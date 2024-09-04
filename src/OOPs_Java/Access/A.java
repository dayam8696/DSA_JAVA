package OOPs_Java.Access;

public class A {
   private int num;
    String nums;
    int [] arr;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public A(int num, String nums) {
        this.num = num;
        this.nums = nums;
        this.arr = new int[]{arr[num]};
    }
}
