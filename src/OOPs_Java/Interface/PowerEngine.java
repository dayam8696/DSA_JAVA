package OOPs_Java.Interface;

public class PowerEngine implements Engine{

    @Override
    public void start() {
        System.out.println("Power engine start");
    }

    @Override
    public void pause() {

    }

    @Override
    public void stop() {
        System.out.println("Power engine stop");
    }


}
