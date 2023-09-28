package lab2._5;

public class Dog {
    private final String name;
    private final int age;
    public Dog(int age, String name) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int humanAge() {
        return age * 7;
    }
}
