package OOPs_Java.Interface;

public class NiceCar {
    private Engine engine;
    private Media player = new CDPlayer();

    public NiceCar() {
        engine = new PowerEngine();
    }
    public void stop(){
        engine.stop();
    }

    public void StopMusic(){
        player.stop();
    }
    public void upGradeEngine() {
        engine =new ElecticEngine();
    }
}
