/**
 * Created by Janek Taras on 4/16/2017.
 */
public class Main {
    public static void main(String[] args)
    {
        Vehicle vehicle = new Car();
        test(vehicle);
        vehicle = new Bike();
        test(vehicle);




    }

    public static void test(Vehicle v)
    {
        v.drive();
        v.stop();
        v.drive();
        v.stop();
    }

}
