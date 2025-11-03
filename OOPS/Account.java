package OOPS;

public class Account {
    private String name;
    private float balance;

    Account(String n, float b) {
        this.name = n;
        this.balance = b;
    }

    public void deposit(float a) {
        this.balance += a;
    }

    public void withdraw(float a) {
        this.balance -= a;
    }

    public void transfer(float a, Account acc) {
        this.balance -= a;
        acc.balance += a;
    }

    public static void main(String[] args) {
        System.out.println("HI this is an account");

        Account acc = new Account("Suresh", 100.0f);

        Account myAcc = new Account("Me", 300.0f);

        myAcc.transfer(100.0f, acc);

        System.out.println(myAcc.name + " has transfered 100.0 USD to " + acc.name + " so now myAcc has "
                + myAcc.balance + " and " + acc.name + " has " + acc.balance);

    }
}
