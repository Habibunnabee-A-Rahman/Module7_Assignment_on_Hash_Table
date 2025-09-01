/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problem2;
import java.util.*;
/**
 *
 * @author himal
 */
public class Problem2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        s=s.toLowerCase().replaceAll("[^a-z0-9\s]", "");
        String [] words = s.split("\s");
        Map<String,Integer> mp = new TreeMap<>();
        
        for(int i=0;i<words.length;i++){
            if(mp.containsKey(words[i])){
                mp.put(words[i], mp.get(words[i])+1);
            }else{
                mp.put(words[i],1);
            }
        }
        System.out.print("{");
        int index = 0;
        for(Map.Entry<String,Integer> x : mp.entrySet()){
            System.out.print("'"+x.getKey()+"': "+x.getValue());
            index++;
            if(index!=mp.size()-1){
                System.out.print(",");
            }
        }
        System.out.print("}");
            //System.out.println(mp);
        
    }
    
}
