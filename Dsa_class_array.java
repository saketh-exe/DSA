import java.util.Scanner;

/**
 * Dsa_class_array
 */

public class Dsa_class_array {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
      

        System.out.println("Enter the max length of the array ?");
        int N = sc.nextInt();
        int[] arr = new int[N];
        boolean loop = true;

        while (loop) {
            System.out.println("Enter your choice  1) Creating  2)Inserting  3) Deleting  4) Displaing  5) Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                arr = create(arr);
                    break;
                case 2:
                arr = Insert(arr);
                    break;
                case 3:
                arr = Delete(arr);
                    break;
                case 4:
                    Display(arr);
                    break;
                case 5:
                    System.out.println("Program Finished");
                    loop = false;
                   
                    break;
                default:
                    break;
            }
        }
        sc.close();
    }


    public static int[] create(int a[]){
        
        int n = a.length;
       System.out.println("Enter the intial no of elements :");
        int p = sc.nextInt()-1;
        if (p>n) {
            System.out.println("INVALID INDEX");
            return null;
        }
        for(int i  = 0 ; i<p+1;i++){
            System.out.println("Enter "+ (i+1) + " Element");
            a[i] = sc.nextInt();
        }
        for (int i = p+1; i < a.length; i++) {
            a[i] = 0;
        }
        return a;
    }

    public static void Display(int a[]){
        for (int i : a) {
            System.out.print(i+" ");
        }
        System.out.print("\n");
    }

    public static int[] Insert(int a[]){
        System.out.println("Enter the postion to insert");
        int p = sc.nextInt()-1;
        if (p>=a.length) {
            System.out.println("INVALID INDEX");
            return null;
        }
        System.out.println("Enter the value ");
        int val = sc.nextInt();
        for(int i = a.length-1 ; p!=i;i--){
            int temp = a[i-1];
            a[i-1] = a[i];
            a[i] = temp;
        }
        a[p] = val;

        return a;
    }

    public static int[] Delete(int[] a){
        System.out.println("Enter the postion to Delete");
        int p = sc.nextInt()-1;
        if (p>=a.length) {
            System.out.println("INVALID INDEX");
            return null;
        }
        a[p] = 0;
        for(int i =p;i<a.length-1;i++){
            int temp = a[i+1];
            a[i+1] = a[i];
            a[i] = temp;
        }

        return a;
    }
}