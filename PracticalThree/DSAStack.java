package PracticalThree;

public class DSAStack {
    private Object[] stackArray;
    private int count;

    // Constructor to initialize the stack with a default size
    public DSAStack(int capacity) {
        stackArray = new Object[capacity];
        count = 0;
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return count == 0;
    }

    // Method to check if the stack is full
    public boolean isFull() {
        return count == stackArray.length;
    }

    // Method to push an element onto the stack
    public void push(Object value) {
        if (isFull()) {
            throw new IllegalStateException("Stack is full");
        }
        stackArray[count] = value;
        count++;
    }

    // Method to pop an element from the stack
    public Object pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        count--;
        Object topValue = stackArray[count];
        stackArray[count] = null; // Clear the reference
        return topValue;
    }

    // Method to peek at the top element without removing it
    public Object peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return stackArray[count - 1];
    }

    // Method to get the current size of the stack
    public int size() {
        return count;
    }
}