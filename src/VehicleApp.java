public class VehicleApp {
    public static void main(String[] args) {
// The next activity "Create Book Class and App" is also implimented here
// which require you to display


        Car c = new Car();

        print(c.start());
        print(c.stop());
        print(c.acceleration());
        c.setMake("Kia");
        print("This is the make of the car : " + c.getMake());
        c.setSpeed(60);
        c.setColor("Black");
        print("This car is : " + c.getColor());
        System.out.println("Car speed " + c.getSpeed());
        c.setModel("KlM3546");
        print("Car model : " + c.getModel());
        print(c.acceleration()+ " " + c.getSpeed() +  "rpm");
        print(c.display());

        Bus b = new Bus();

        print(b.start());
        print(b.stop());
        print(b.acceleration());
        b.setSettingSize(28);
        System.out.println( "Bus holding capacity :" + b.getSettingSize());
        b.setNumberOfWheel(12);
        System.out.println( "Bus number of wheels :" + b.getNumberOfWheel());
        print(b.display());


    }
    private static void print(String s) {
        System.out.println(s);
    }
}
