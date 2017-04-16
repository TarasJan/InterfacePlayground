/**
 * Created by Janek Taras on 4/16/2017.
 */
public interface Vehicle {

    default public void drive()
    {
       System.out.println("You are moving, but you are unable to hear anything");
    }

    public void stop();


}
