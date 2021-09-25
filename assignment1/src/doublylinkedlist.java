class doublylinkedlist {    
    static class Node{  
        int data;  
        Node previous;  
        Node next;  
        public Node(int item) 
        {  
            data = item;  
        }  
    }  
    
    Node head, tail = null;  
   
    
    public void add(int data) 
    {  
        
        Node n = new Node(data);  
        if(head == null) 
        {  
            head = tail = n;  
            head.previous = null;  
            tail.next = null;  
        }  
        else 
        {  
            
            tail.next = n;  
            n.previous = tail;  
            tail = n;  
            tail.next = null;  
        }  
    }  
   

    void display() {  
        
        Node current = head;  
        if(head == null) {  
            System.out.println("Doubly linked list is empty");  
            return;  
        }  
        System.out.println("contents of doubly linked list are : ");  
        while(current != null) {  
            
            System.out.print(current.data + " ");  
            current = current.next;  
        }  
    }  

    public static void main(String[] args) {  
        
        doublylinkedlist list = new doublylinkedlist();  
        
        list.add(34);  
        list.add(26);  
        list.add(43);  
        list.add(76);  
        list.add(99);    
        list.display();  
    }  
} 