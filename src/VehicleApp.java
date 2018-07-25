public class VehicleApp {
    public static void main(String[] args) {
        Car c = new Car();
        c.setColor("Black");
        print("This car is" + c.getColor());
        c.setSpeed(60);


    }
    private static void print(String s) {
        System.out.println(s);
    }
}
