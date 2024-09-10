package OOPs_Java.Interface;

public class ElecticEngine implements Engine{

    @Override
    public void start() {
        System.out.println("Electric engine start");
    }

    @Override
    public void pause() {

    }

    @Override
    public void stop() {
        System.out.println("Electric engine stop");
    }


}
