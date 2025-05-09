
package Robots;

public class CookingRobot extends Robot{
    
    public CookingRobot(){
    }
    public CookingRobot(String model, int batteryLevel){
        super(model,batteryLevel);
    }
    @Override
    public void start(){
        System.out.println("The robot is loading the recipe book");
    }
    @Override
    public void performTask(){
        System.out.println("The robot is preparing your selected meal");
    }
    @Override
    public void stop(){
        System.out.println("The robot is doing the dishes and then will be on "
                + "sleeping mode");
    }
    @Override
    public String toString(){
        String str= "\nRobot Information\n" + super.toString();
        return str;
    }
    
}
