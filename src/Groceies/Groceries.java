package Groceies;

public class Groceries {

    private String name;
    private int amount;

    public Groceries(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }

    //accessors

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
