package inheritance;

public class Animal {
    Protected String name;
    Protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat() {
        System.out.println("Animal is eating...");
    }
}
