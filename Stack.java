import java.util.Scanner;

public class Stack {
    private int[] stack;
    private int top;
    private int size;

    public Stack(int size) {
        this.size = size;
        stack = new int[size];
        top = -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(int element) {
        if (!isFull()) {
            stack[++top] = element;
            System.out.println("Pushed element: " + element);
        } else {
            System.out.println("Stack Overflow!");
        }
    }

    public void pop() {
        if (!isEmpty()) {
            System.out.println("Popped element: " + stack[top]);
            stack[top--] = 0; // or 0 or some default value
        } else {
            System.out.println("Stack Underflow!");
        }
    }

    public void peek() {
        if (!isEmpty()) {
            System.out.println("Top element: " + stack[top]);
        } else {
            System.out.println("Stack is empty!");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter maximum number of elements in stack: ");
        int n = scanner.nextInt();

        Stack stack = new Stack(n);

        int choice = 0;

        System.out.println("1) Push");
        System.out.println("2) Pop");
        System.out.println("3) Peek");
        System.out.println("4) Is Stack empty");
        System.out.println("5) Is Stack full");
        System.out.println("6) Exit");

        while (choice != 6) {
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter element to push: ");
                    int element = scanner.nextInt();
                    stack.push(element);
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    stack.peek();
                    break;
                case 4:
                    if (stack.isEmpty()) {
                        System.out.println("Stack is empty");
                    } else {
                        System.out.println("Stack is not empty");
                    }
                    break;
                case 5:
                    if (stack.isFull()) {
                        System.out.println("Stack is full");
                    } else {
                        System.out.println("Stack is not full");
                    }
                    break;
                case 6:
                    System.out.println("Bye!");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }

        scanner.close();
    }
}
