package OOPS;

public class Methods {

    String name;
    int age;

    public Methods(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void growOlder() {
        this.age += 1;
    }

    public void growOlder(int years) {
        this.age += years;
    }

    public String toString() {
        return "(" + this.name + ", " + this.age + ")";
    }

    public static void main(String[] args) {
        Methods m = new Methods("M1", 2);

        m.growOlder();

        System.err.println(m.age);

        m.growOlder(10);

        System.err.println(m.age);

    }

}
