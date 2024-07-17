import java.util.Scanner;

/**
 * Stack_implementation_using_Linked_List
 */
public class Stack_implementation_using_Linked_List {
    public static class Node {
        int data;
        Node next = null ;
    
        Node(int value){
            this.data = value; 
        }
    
        @Override
        public String toString() {
            return "" + this.data;
        }
        
    }

    public static class Stack{
        int lenght =0;
        Node top;
    
    
        @Override
    public String toString() {
        String temp = "";

        Node current = this.top;
        while (current != null) {
            temp = temp + current.data+ " -- " ;
            current =current.next;
        }

        return temp + "Stack End";
    }
    
    public void push(int i){
        Node temp = new Node(i);
        if (this.top==null) {
            this.top=temp;
            this.lenght++;
            return ;
        }
        temp.next=this.top;
        top = temp;
        this.lenght++;
    }

    public int pop(){
        if(this.top == null){
            System.out.println("Stack Underflow");
            return -1;
        }
        Node temp = this.top;
        top = top.next;
        this.lenght--;
        return temp.data;
    }

    public void peek(){
        System.out.println("top = "+this.top);
    }





    
    }
    public static void main(String[] args) {
       Stack a = new Stack();
       Scanner sc = new Scanner(System.in);
       boolean l = true;
       System.out.println("Empty stack initailized perform your operations :");
       while (l) {
            System.out.println();
           System.out.print("1) Push ");
           System.out.print("2) Pop ");
           System.out.print("3) Peek ");
           System.out.print("4) Is Stack empty ");
           System.out.print("5) Display ");
           System.out.print("6) Exit \n");
           System.out.print("Enter your choice : ");
        int ch = sc.nextInt();
        System.out.println("OUTPUT:");
        switch (ch) {
            case 1:
                System.out.print("Enter int to push: ");
                int i = sc.nextInt();
                a.push(i);
                break;
            case 2:
                int poped = a.pop();
                System.out.println(poped + " got removed");
                break;
            case 3:
                a.peek();
                break;
            case 4:
                if (a.lenght == 0) {
                    System.out.println("Stack is empty");
                } else {
                    System.out.println("Stack is not empty");
                }
                break;
            
            case 6:
                System.out.println("Bye!");
                l=false;
                break;

            case 5:
                System.out.println(a);
                break;
            default:
                System.out.println("Invalid choice");
        }

       }
       sc.close();
    }
    
}



