
package Robots;

public class CleaningRobot extends Robot{
    
    public CleaningRobot(){ 
    }
    public CleaningRobot(String model, int batteryLevel){
        super(model, batteryLevel);
    }
    @Override
    public void start(){
        System.out.println("The robot is recognizing the cleaning space");
    }
    @Override
    public void performTask(){
        System.out.println("The robot is cleaning in automatic mode");
    }
    @Override
    public void stop(){
        System.out.println("The robot has stopped and will turn off in 30 seconds");
    }
    @Override
    public String toString(){
        String str= "\nRobot Information\n" + super.toString();
        return str;
    }
}
