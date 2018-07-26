public class Bus extends Vehicle {
    public Bus(){
        super();
        System.out.println("This is a bus....");
        System.out.println("   Display my bus");
    }
    private int numberOfWheel;
    private int SettingSize;

    public int getSettingSize() {
        return SettingSize;
    }

    public void setSettingSize(int settingSize) {
        SettingSize = settingSize;
    }

    @Override
    public String start() {

        return "The bus is starting";
    }

    @Override
    public String acceleration() {
        return "The bus is accelerating";
    }

    @Override
    public String stop() {
        return "The bus is stopping" ;
    }



    public int getNumberOfWheel() {
        return numberOfWheel;
    }

    public void setNumberOfWheel(int numberOfWheel) {
        this.numberOfWheel = numberOfWheel;
    }
    public String display(){
//        String formatSettingSize = String.format("%.02f", SettingSize);
//        String formatnumberOfWheel = String.format("%.02f", numberOfWheel);
//        return "This is the bus capcity : " + formatSettingSize +  "This is the number of the wheel" + formatnumberOfWheel;
        return "The number of wheels are: " + numberOfWheel + "   The number of sets are: " + SettingSize;
    }


}
