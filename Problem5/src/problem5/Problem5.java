/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problem5;
import java.util.*;
/**
 *
 * @author himal
 */
class LinkedNode{
    int value;
    LinkedNode next;
    LinkedNode(){
        
    }
    LinkedNode(int value){
        this.value=value;
    }
    LinkedNode(int value,LinkedNode next){
        this.value = value;
        this.next = next;
    }
}
public class Problem5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //input
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        int loop = scan.nextInt();
        
        String [] input = s.split(" ");
        LinkedNode prev_node = new LinkedNode();
        LinkedNode head = prev_node;        
        LinkedNode curr_node ;
        LinkedNode loop_node = new LinkedNode();
        for(int i=0;i<input.length;i++){
             curr_node = new LinkedNode(Integer.parseInt(input[i]));
             prev_node.next = curr_node;
             prev_node = curr_node;
             if(i==loop){
                 loop_node = curr_node;
             }
             
        }
        
        
        head = head.next;
        LinkedNode tail = prev_node;
        tail.next = loop_node;
        //input done
        
        Set<LinkedNode> st = new HashSet<>();
        while(head!=null){
            if(st.contains(head)){
                System.out.println("True");
                return;
            }else{
                st.add(head);
            }
            head = head.next;
        }
        System.out.println("False");
        
        
        
    }
    
}
