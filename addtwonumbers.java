 import java.util.*;
 public class addtwonumbers {
    static class LinkedList{
        int data;
        LinkedList next;
    LinkedList(int data){
            this .data=data;
            this.next=null;
        }
    }
    public static int addtwonumber(LinkedList l1,LinkedList l2){
        LinkedList dummy=new LinkedList(0);
        LinkedList head=dummy;
        int sum=0; 
        int carry=0;
        LinkedList ans=new LinkedList(0);
        while(l1!=null|| l2!=null){
            if(l1!=null){
                sum=l1.data+sum;
                l1=l1.next;
            }
            if(l2!=null){
                sum=l2.data+sum;
                l2=l2.next;
            }
            int num=sum%10;
            carry=sum/10;
            dummy.next=new LinkedList(num);
            dummy=dummy.next;

        } if(carry!=0){
            sum=carry;
        }
        return head.next;
    

    }
    public static void main(String[] args) {
     
    }    
}
