package PracticalThree;

public class DSAQueue {
    public Object[] queue;
    public int count;
    public int front;
    public int rear;
    private static final int DEFAULT_CAPACITY = 10;

    public DSAQueue() {
        queue = new Object[DEFAULT_CAPACITY];
        count = 0;
        front = 0;
        rear = -1;
    }

    public void enqueue(Object value) {
        if (count == queue.length) {
            throw new IllegalStateException("Queue is full");
        }
        rear = (rear + 1) % queue.length;
        queue[rear] = value;
        count++;
    }

    public Object dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        Object value = queue[front];
        queue[front] = null;
        front = (front + 1) % queue.length;
        count--;
        return value;
    }

    public Object peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return queue[front];
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public int size() {
        return count;
    }
}

//----------------------------------------------------------------------
class ShuffleQueue extends DSAQueue {

    public ShuffleQueue() {
        super();
    }

    @Override
    public void enqueue(Object value) {
        if (size() == queue.length) {
            throw new IllegalStateException("ShuffleQueue is full");
        }
        super.enqueue(value);
    }

    @Override
    public Object dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("ShuffleQueue is empty");
        }
        Object value = queue[front];
        for (int i = 0; i < count - 1; i++) {
            queue[i] = queue[i + 1];
        }
        queue[count - 1] = null;
        count--;
        rear = count - 1;
        return value;
    }
}

//----------------------------------------------------------------------
class CircularQueue extends DSAQueue {
    private int capacity;

    public CircularQueue(int capacity) {
        super();
        this.capacity = capacity;
        queue = new Object[capacity];
    }

    @Override
    public void enqueue(Object value) {
        if (size() == capacity) {
            throw new IllegalStateException("CircularQueue is full");
        }
        super.enqueue(value);
    }

    public Object pop() {
        if (isEmpty()) {
            throw new IllegalStateException("CircularQueue is empty");
        }
        Object value = queue[rear];
        queue[rear] = null;
        rear = (rear - 1 + capacity) % capacity;
        count--;
        return value;
    }

    @Override
    public Object dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("CircularQueue is empty");
        }
        return super.dequeue();
    }
}