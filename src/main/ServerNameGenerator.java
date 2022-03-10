package main;

public class ServerNameGenerator {

    String [] adjArray = {"snobbish", "grotesque", "necessary", "abounding", "severe", "profuse", "nutritious", "wide-eyed", "thankful", "heavy"};
    String[] nounArray = {"atmosphere", "performance", "supermarket", "difference", "response", "childhood", "instruction", "phone", "direction", "percentage"};

    public String getRandomName() {
        return adjArray[(int) Math.floor(Math.random() * 10)] + "-" + nounArray[(int) Math.floor(Math.random() * 10)];
    }

    public static void main(String[] args) {
        ServerNameGenerator generator = new ServerNameGenerator();

        System.out.print("Here is your server name: ");
        System.out.println(generator.getRandomName());
    }
}
