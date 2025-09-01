/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package probelm3;
import java.util.*;
/**
 *
 * @author himal
 */
public class Probelm3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        Map<Character,Integer> mp = new LinkedHashMap<>();
        
        for(int i=0;i<s.length();i++){
            char x = s.charAt(i);
            if(mp.containsKey(x)){
                mp.put(x, mp.get(x)+1);
            }else{
                mp.put(x,1);
            }
        }
        
        for(Map.Entry<Character,Integer> entry : mp.entrySet()){
            if(entry.getValue()==1){
                System.out.println(entry.getKey());
                return;
            }
        }
        System.out.println("None");
    }
    
}
