
class StackArray {
    int[] arr;
    int top;
    int size;

    // Constructor
    StackArray(int size) {
        this.size = size;
        arr = new int[size];
        top = -1;  // IMPORTANT
    }

    // PUSH
    void push(int value) {
        if (top == size - 1) {
            System.out.println("Stack Overflow");
            return;
        }

        top = top + 1;
        arr[top] = value;
        System.out.println(value + " pushed");
    }

    // POP
    void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return;
        }

        System.out.println(arr[top] + " popped");
        top = top - 1;
    }

    // PEEK
    void peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return;
        }

        System.out.println("Top element is: " + arr[top]);
    }

    // DISPLAY
    void display() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return;
        }

        System.out.print("Stack: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        StackArray stack = new StackArray(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60); // This will cause stack overflow

        stack.display();

        stack.peek();

        stack.pop();
        stack.pop();

        stack.display();
    }   
}