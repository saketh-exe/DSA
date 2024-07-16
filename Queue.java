import java.util.Scanner;

public class Queue {
    private int[] queue;
    private int front, rear, size;

    public Queue(int n) {
        size = n;
        queue = new int[size];
        front = -1;
        rear = -1;
    }

    public boolean isFull() {
        return ((rear + 1) % size == front);
    }

    public boolean isEmpty() {
        return (front == -1);
    }

    public void enqueue(int element) {
        if (!isFull()) {
            if (rear == -1) {
                rear = 0;
                front = 0;
            } else {
                rear = (rear + 1) % size;
            }
            queue[rear] = element;
            System.out.println("Enqueued element: " + element);
        } else {
            System.out.println("Queue Overflow!");
        }
    }

    public void dequeue() {
        if (!isEmpty()) {
            System.out.println("Dequeued element: " + queue[front]);
            if (front == rear) {
                front = -1;
                rear = -1;
            } else {
                front = (front + 1) % size;
            }
        } else {
            System.out.println("Queue Underflow!");
        }
    }

    public void peek() {
        if (!isEmpty()) {
            System.out.println("Front element: " + queue[front]);
        } else {
            System.out.println("Queue is empty!");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter maximum number of elements in queue: ");
        int n = scanner.nextInt();

        Queue queue = new Queue(n);
        int choice = 0;

        System.out.println("1) Push");
        System.out.println("2) Pop");
        System.out.println("3) Peek");
        System.out.println("4) Is Queue empty");
        System.out.println("5) Is Queue full");
        System.out.println("6) Exit");

        while (choice != 6) {
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter element to enqueue: ");
                    int element = scanner.nextInt();
                    queue.enqueue(element);
                    break;
                case 2:
                    queue.dequeue();
                    break;
                case 3:
                    queue.peek();
                    break;
                case 4:
                    if (queue.isEmpty()) {
                        System.out.println("Queue is empty");
                    } else {
                        System.out.println("Queue is not empty");
                    }
                    break;
                case 5:
                    if (queue.isFull()) {
                        System.out.println("Queue is full");
                    } else {
                        System.out.println("Queue is not full");
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
