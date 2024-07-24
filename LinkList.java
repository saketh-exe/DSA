
import java.util.Scanner;

public class LinkList {
    
    public static class Student {

    int roll;
    String name;
    int age;

    Student(String nam , int ag , int rol){
        this.name = nam;
        this.roll = rol;
        this.age = ag;
    }
}
    public static class Node{
        Student data;
        Node next = null;
        
        Node(int age ,int roll, String name){
            Student newstud = new Student(name, age, roll);
            this.data = newstud;
        }
        
        
    }
    public static class LinkedList{
        Node head = null;
        int length = 0;
        public void Insert(int age ,int roll, String name,int pos){
          
             Node temp = new Node(age,roll,name);
            
            if(head == null){
                head = temp;
                length++;
                return;
            }
            if(pos == 0){
                temp.next = head;
                head = temp;
                length++;
                return;
            }
            if(pos > this.length){
            //    System.out.println("the entered position is not valid, inserting at end.");
               Node current = this.head;
               while(current.next != null){
                   current = current.next;
               }
               current.next = temp;
                length++;
                return;
            }
            Node current = this.head;
            for(int i = 0;i<pos-2;i++){
                current = current.next;
            }
            temp.next = current.next;
            current.next = temp;
            length++;
            
        }
        public void Display(){
            Node current = this.head;
            
            while(current != null){
                System.out.println("Name : "+current.data.name + ", Age : " + current.data.age + ", Roll : " + current.data.roll);
                current = current.next;
            }
        } 
        public void Remove(int pos){
            if (this.head == null) {
                System.out.println("Invaild the Linked list is null");
                return;
            }
            if (head.next == null) {
                this.head = null;
                length--;
                return;
            }
           if (pos >= length) { // is position is greater than length then last elem gets removed 
            Node current = this.head;
                while (current.next.next != null) {
                    current = current.next;
                }
                current.next = null;
                length--;
                return;
           }
            Node current = this.head;
            for(int i =0 ; i!=pos-2;i++){
                current = current.next;
            }
            
            current.next = current.next.next;
            length--;
        }
        }
    public static LinkedList createdb(LinkedList ll){
        Scanner sc = new  Scanner(System.in);
        System.out.println("Enter no of Students : ");
        int n = sc.nextInt();
        
        for (int i = 1; i != n+1; i++) {
            System.out.println("Enter details for student "+i+" : ");
            System.out.print("Enter name : ");
            sc.nextLine();
            String name = sc.nextLine();
            
            System.out.print("Enter roll no : ");
            int roll = sc.nextInt();
            System.out.print("Enter age : ");
            int age = sc.nextInt();
            ll.Insert(age, roll, name, roll);
        }
        sc.close();
        return ll;
    }
    
    
    
    
    public static void main(String args[]){
        LinkedList ll = new LinkedList();
        ll = createdb(ll);
        ll.Display();
        System.out.println();
        ll.Insert(18, 120, "noname", 120);
        ll.Display();
        
    }
}
