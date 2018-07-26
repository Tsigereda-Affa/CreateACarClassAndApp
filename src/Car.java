public class Car extends Vehicle {
    //private member variables
    //a default constructor
    //an overloaded constructor
    //methods which return a string indicating each task the car is performing.

    private String manufacture;

    public Car() {
        super();
        System.out.println("This is a car....");
        System.out.println("   Display my car");
    }

//    public String getManufacture() {
//        return manufacture;
//    }
//
//    public void setManufacture(String manufacture) {
//        this.manufacture = manufacture;
//  }
    private String make;
    private String model;

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String stop() {
        return "The car is stopping";
    }

    @Override
    public String acceleration() {
        return "The car is accelerating";  //+ super.getSpeed();  this is to add to this class speed
    }

    @Override
    public String start() {
        return "the car is starting";
    }
 public String display(){
        return  "This car is : "+ make + ".This cars model is :" + model + " and " + this.acceleration()+ " " +super.getSpeed(); // use super.accelerate + this.stop(); ues if you want to display the override new idea
 }
    //an overloaded constructor
    //methods which return a string indicating each task the car is performing.

}
