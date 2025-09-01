/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problem1;

import java.util.*;

/**
 *
 * @author himal
 */
public class Problem1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Map<Integer,String> mp = new HashMap<>();
        for(int i=0;i<n;i++){
            String action = scan.next();
            if(action.equals("put")){
                mp.put(scan.nextInt(), scan.next());
            }else if(action.equals("get")){
                String out = mp.get(scan.nextInt());
                if(out==null){
                    System.out.println("Key not found");
                    
                }else{
                    System.out.println(out);
                }
            }else if(action.equals("remove")){
                mp.remove(scan.nextInt());
            }
        }
    }
    
}
