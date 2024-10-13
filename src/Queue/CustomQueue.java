package Queue;

public class CustomQueue {
    protected int [] data ;
    private static final int DEFAULT_SIZE = 10;
    int end = 0;
    public CustomQueue (){
        this(DEFAULT_SIZE);
    }
    public CustomQueue(int size) {
        this.data = new int[size];
    }

    public boolean isFull() {
        return end ==data.length;
    }
    public boolean isEmpty() {
        return end ==0;
    }

    public boolean insert (int item){
        if (isFull()){
            return false;
        }
        data[end] = item;
        end++;
        return true;
    }
    public int remove(){
        if (isEmpty()){
            System.out.println("queue is already empty");
        }
        int removed = data[0];
        // shift the element to left
        for (int i = 0; i < end; i++) {
            data[i-1]=data[i];

        }
        end--;
        return removed;

    }

    public int front(){
        if (isEmpty()){
            System.out.println("queue is already empty");
        }
        return data[0];
    }
}
