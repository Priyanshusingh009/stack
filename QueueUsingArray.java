class MyQueue {
    int arr[];
    int front;
    int rear;
    int size;

    MyQueue(int size) {
        this.size = size;
        arr = new int[size];
        front = -1;
        rear = -1;
    }

    void push(int x) {
        if (rear == size - 1) {
            System.out.println("Queue Overflow");
            return;
        }

        if (front == -1) {
            front = 0;
        }

        rear++;
        arr[rear] = x;
    }

    void pop() {
        if (front == -1 || front > rear) {
            System.out.println("Queue Underflow");
            return;
        }

        front++;

        if (front > rear) {
            front = -1;
            rear = -1;
        }
    }

    int front() {
        if (front == -1) {
            System.out.println("Queue is Empty");
            return -1;
        }
        return arr[front];
    }

    int rear() {
        if (rear == -1) {
            System.out.println("Queue is Empty");
            return -1;
        }
        return arr[rear];
    }

    boolean isEmpty() {
        return (front == -1);
    }
}

public class QueueUsingArray {
    public static void main(String[] args) {
        MyQueue q = new MyQueue(5);

        q.push(10);
        q.push(20);
        q.push(30);

        System.out.println("Front: " + q.front()); // 10
        System.out.println("Rear: " + q.rear());   // 30

        q.pop();

        System.out.println("Front after pop: " + q.front()); // 20
    }
}