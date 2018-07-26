public class Vehicle {
    private int speed;
    private String color;

    public Vehicle() {
        System.out.println("A new vehicle has been created!");

    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

//this an added part of method in the parent class that should be OV the child class
    public String start(){
        return "The vehicle is starting";
    }
    public String stop(){
        return "The vehicle is stopping";
    }
    public String acceleration(){
        return "The vehicle is accelerating ";
    }
}
