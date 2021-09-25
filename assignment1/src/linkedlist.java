public class linkedlist
{
    public static class Node         
    {
        int data;       
        Node next;      
        
    }
    public static void main(String args[])
    {
        Node node1=new Node();    
        Node node2=new Node();    
        Node node3=new Node();    
        Node node4=new Node();    
        Node node5=new Node();  
        node1.data=134;
        node2.data=3443;
        node3.data=484;
        node4.data=4434;
        node5.data=632762;
         
          
        node1.next=node2;       
        node2.next=node3;
        node3.next=node4;
        node4.next=node5;
        node5.next=null;
        
       for (int i=1;i<=4;i++)
        {
            System.out.println(node1.data+" ");
            node1=node1.next;       
        }
    }
}