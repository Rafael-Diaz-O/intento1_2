
package robotsfactory;
import java.util.ArrayList;
import Robots.*;

public class RobotsFactory {

    public static void main(String[] args) {
        
        ArrayList <Robot> robots = new ArrayList<>();
        robots.add(new CleaningRobot("R2D2",90));
        robots.add(new CookingRobot("C-3PO", 95));
        
        for(Robot r: robots){
            System.out.println(r.toString());
            r.start();
            r.performTask();
            r.stop();
        }
    } 
}


