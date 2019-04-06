package cz.cvut.fel.pjv;

/**
 * Implementation of the {@link Queue} backed by fixed size array.
 */
public class CircularArrayQueue implements Queue {
    private final int size;
    private int value;
    private int start;
    private int end;
    private int capacity;
    private final String[] queue;

    /**
     * Creates the queue with capacity set to the value of 5.
     */
    public CircularArrayQueue() {
        this.size = 5;
        this.value = 0;
        this.start = 0;
        this.end = 0;
        this.queue = new String[this.size];

    }


    /**
     * Creates the queue with given {@code capacity}. The capacity represents maximal number of elements that the
     * queue is able to store.
     * @param capacity of the queue
     */
    public CircularArrayQueue(int capacity) {
        this.size = capacity;
        this.value = 0;
        this.start = 0;
        this.end = 0;
        this.queue = new String[this.size];

    }

    @Override
    public int size() {
        return value;
    }

    @Override
    public boolean isEmpty() {
        return value == 0;
    }

    @Override
    public boolean isFull() {
        return value == size;
    }

    @Override
    public boolean enqueue(String obj) {
        if ((obj != null) && (value != size)){
            value++;
            end = end%size;
            queue[end] = obj;
            end++;
            return true;
        } else{
            return false;
        }
    }

    @Override
    public String dequeue() {
        if (value == 0){
            return null;
        } else{
            value--;
            String element = queue[start];
            start = (start+1)%size;
            return element;
        }
    }

    @Override
    public void printAllElements() {
        for (int i = 0; i < value; i++){
            System.out.println(queue[i]);
        }

    }
}
