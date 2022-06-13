package tiagobarbosa.marathonjava.javacore.ZZGconcurrence.domain;

public class Account {
    private int balance = 50;

    public void withdraw(int amount) {
        this.balance = this.balance - amount;
    }

    public int getBalance() {
        return balance;
    }
}
