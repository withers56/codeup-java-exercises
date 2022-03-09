package warmups;

public class Phone {
    private String brand;
    private String color;
    private boolean hasCase;
    private int batteryPercentage;




    public Phone(String brand) {
        this.brand = brand;

        batteryPercentage = 100;
    }

    public void call() {
        System.out.println("ring ring...... ring ring");
    }

    public void takePicture() {
        System.out.println("Takes picture");
    }

    //accessors

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isHasCase() {
        return hasCase;
    }

    public void setHasCase(boolean hasCase) {
        this.hasCase = hasCase;
    }

    public int getBatteryPercentage() {
        return batteryPercentage;
    }

    public void setBatteryPercentage(int batteryPercentage) {
        this.batteryPercentage = batteryPercentage;
    }
}
