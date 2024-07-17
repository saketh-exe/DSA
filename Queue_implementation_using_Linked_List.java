import java.util.Scanner;

public class Queue_implementation_using_Linked_List {
    public static void main(String[] args) {
         Queue a = new Queue();
       Scanner sc = new Scanner(System.in);
       boolean l = true;
       System.out.println("Empty Queue initailized perform your operations :");
       while (l) {
            System.out.println();
           System.out.print("1) Enqueue ");
           System.out.print("2) Dequeue ");
           System.out.print("3) Peek ");
           System.out.print("4) Is Queue empty ");
           System.out.print("5) Display ");
           System.out.print("6) Exit \n");
           System.out.print("Enter your choice : ");
        int ch = sc.nextInt();
        System.out.println("OUTPUT:");
        switch (ch) {
            case 1:
                System.out.print("Enter int to Enqueue: ");
                int i = sc.nextInt();
                a.Enqueue(i);
                break;
            case 2:
                int Dequeueed = a.Dequeue();
                System.out.println(Dequeueed + " got removed");
                break;
            case 3:
                a.peek();
                break;
            case 4:
            System.out.println(a.length != 0 ? "The Queue is Not Empty":"The Queue is Empty");
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

    public static class Queue {
        Node top = null;
        Node bottom = null;
        int length = 0;


        public static class Node {
            int data;
            Node next;

            Node(int a){
                this.data = a;
                this.next = null;
            }
            
        }
    
        public void Enqueue(int i ){
            Node a = new Node(i);

            if (this.top == null) {
                top = a;
                bottom = a;
                this.length++;
                return;
            }

            this.bottom.next =a;
            this.bottom =a;
            this.length++;
            
        }

        public int Dequeue(){
            if(top == null){
                System.out.println("INVALID INDEX QUEUE UNDERFLOW");
                return -1;
            }
            else if (top == bottom) {
                Node temp = this.top;
                this.top = this.bottom = null;
                this.length--;
                return temp.data;
            }
            
            Node temp = this.top;
            this.top = this.top.next;
            this.length--;
            return temp.data;

        }
    
        public void peek(){

            if (this.top != null) {
                System.out.println(this.top.data);
            } else {
                System.out.println("Top doesn't exist. The Queue is empty.");
            }
            
        }

        public String toString() {
            String temp = "Queue Start -- ";
    
            Node current = this.top;
            while (current != null) {
                temp = temp + current.data+ " -- " ;
                current =current.next;
            }
    
            return temp + "Queue End";
        }

       
    
    }


}
