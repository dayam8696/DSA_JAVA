package Stack;

public class DynamicStack extends CustomStack{
    public DynamicStack(){
        super();
    }
    public DynamicStack(int size){
        super(size);
    }

    @Override
    public boolean push(int item) {
        if (isFull()){
            int [] temp = new int[data.length*2];

            //copy all previous Item 
            for (int i = 0; i < data.length; i++) {
                temp[i] =data[i];
                
            }
            data =temp;
        }
        return super.push(item);
    }
}
