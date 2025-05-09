
package Robots;

public abstract class Robot {
    
    private String model;
    private int batteryLevel;
        
    public Robot(){
        this.model = null;
        this.batteryLevel = 0;
    }  
    public Robot(String model, int batteryLevel){
        this.model = model;
        this.batteryLevel = batteryLevel;
    }
    @Override
    public String toString(){
        return "Model: " + this.model + "\nBattery Level:" + this.batteryLevel;
    }
    public abstract void start();
    public abstract void performTask(); 
    public abstract void stop();
}
