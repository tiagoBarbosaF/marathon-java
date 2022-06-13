package tiagobarbosa.marathonjava.javacore.ZZFthreads.main;

import tiagobarbosa.marathonjava.javacore.ZZFthreads.domain.Account;

public class ThreadAccountMain01 implements Runnable {
    private final Account account = new Account();

    public static void main(String[] args) {
        ThreadAccountMain01 threadAccountMain01 = new ThreadAccountMain01();
        Thread tiago = new Thread(threadAccountMain01, "Tiago");
        Thread peter = new Thread(threadAccountMain01, "Peter");
        tiago.start();
        peter.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            withdraw(10);
            if (account.getBalance() < 0) {
                System.out.println("No more money bro =/ ...");
            }
        }
    }

    // synchronized methods
//    private synchronized void withdraw(int amount)
    private void withdraw(int amount) {
        System.out.println(getThreadName() + "### outside synchronized block");
        synchronized (account) {
            System.out.println(getThreadName() + " **** inside synchronized block");
            if (account.getBalance() >= amount) {
                System.out.println(getThreadName() + " is going to withdraw money.");
                account.withdraw(amount);
                System.out.println(getThreadName() + " withdraw complete, current account value is -> " + account.getBalance());
            } else {
                System.out.println(getThreadName() + " No money to withdraw account, current account value is -> " + account.getBalance());
            }
        }
    }

    private String getThreadName() {
        return Thread.currentThread().getName();
    }
}
