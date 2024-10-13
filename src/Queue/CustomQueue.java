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
}
