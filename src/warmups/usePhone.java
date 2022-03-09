package warmups;

public class usePhone {


    public static void main(String[] args) {
        Phone myPhone = new Phone("iPhone");
        myPhone.setColor("white");
        System.out.println(myPhone.getBatteryPercentage());
        myPhone.call();
        myPhone.takePicture();

    }
}
