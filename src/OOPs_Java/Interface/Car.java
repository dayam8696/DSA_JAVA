package OOPs_Java.Interface;

public class Car implements Engine , Breake{
    @Override
    public void start() {
        System.out.println("start");
    }

    @Override
    public void pause() {
        System.out.println("pause the car");
    }

    @Override
    public void stop() {
        System.out.println("stop the car");
    }
}
