public class Car extends Vehicle {
    //private member variables
    //a default constructor
    //an overloaded constructor
    //methods which return a string indicating each task the car is performing.


    public Car() {
        super();
    }

    @Override
    public String getStatus() {
        return super.getStatus();
    }

    @Override
    public void setStatus(String status) {
        super.setStatus(status);
    }

    @Override
    public int getSpeed() {
        return super.getSpeed();
    }

    @Override
    public void setSpeed(int speed) {
        super.setSpeed(speed);
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }
    //an overloaded constructor
    //methods which return a string indicating each task the car is performing.

    public String getMember() {
        return member;
    }

    public void setMember(String member) {
        this.member = member;
    }

    private String member = "";
}
