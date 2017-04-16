/**
 * Created by Janek Taras on 4/16/2017.
 */
public class Car implements Vehicle {

    @Override
    public void drive() {
        System.out.println("Vroooom!!!");
    }

    @Override
    public void stop() {
        System.out.println("Screeetch!!!");
    }
}
