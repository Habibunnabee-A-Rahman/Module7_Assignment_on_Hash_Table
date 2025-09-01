/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problem4;
import java.util.*;
/**
 *
 * @author himal
 */
public class Problem4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        int target = scan.nextInt();
        
        String [] input = s.split(" ");
        
        Map<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<input.length;i++){
            mp.put(Integer.parseInt(input[i]), i);
        }
        
        for(Map.Entry<Integer,Integer> entry : mp.entrySet()){
            int value1 = entry.getKey();
            int value2 = target - value1;
            if(mp.containsKey(value2)){
                System.out.println("["+entry.getValue()+","+mp.get(value2)+"]");
                return;
            }
        }
        System.out.println("Doesn't Exist");
        
    }
    
}
