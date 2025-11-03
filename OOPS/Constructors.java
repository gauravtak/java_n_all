package OOPS;

public class Constructors {

    String name;
    int age;

    public Constructors(String name) {
        this(name, 0);
    }

    public Constructors(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return this.name + " " + this.age + " of constructor";
    }

    public static void main(String[] args) {
        Constructors c = new Constructors("C1");
        Constructors c2 = new Constructors("C2", 26);
        System.out.println(c);
        System.out.println(c2);
    }

}