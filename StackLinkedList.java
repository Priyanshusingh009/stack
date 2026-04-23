
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class StackLinkedList {
    Node top;

    // PUSH
    void push(int value) {
        Node newNode = new Node(value);

        newNode.next = top;  // link
        top = newNode;       // move top

        System.out.println(value + " pushed");
    }

    // POP
    void pop() {
        if (top == null) {
            System.out.println("Stack Underflow");
            return;
        }

        System.out.println(top.data + " popped");
        top = top.next;
    }

    // PEEK
    void peek() {
        if (top == null) {
            System.out.println("Stack is empty");
            return;
        }

        System.out.println("Top element is: " + top.data);
    }

    // DISPLAY
    void display() {
        if (top == null) {
            System.out.println("Stack is empty");
            return;
        }

        Node temp = top;

        System.out.print("Stack: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        StackLinkedList stack = new StackLinkedList();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.display();

        stack.peek();

        stack.pop();
        stack.display();

        stack.pop();
        stack.pop();
        stack.pop();  // Underflow case
    }
}
