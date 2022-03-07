package main;

public class Person {

    public static void main(String[] args) {
        Person william = new Person("William");
        System.out.println(william.getName());
        william.sayHello();


    }

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public void sayHello(){
        System.out.println("Hello, " + this.name);
    }



    //getter and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
