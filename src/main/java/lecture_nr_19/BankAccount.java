package lecture_nr_19;

public class BankAccount {

    private double balance;
    private String accountName;
    //Locks
    private final Object balanceLock = new Object();
    private final Object nameLock = new Object();

    public BankAccount(double balance, String accountName) {
        this.balance = balance;
        this.accountName = accountName;
    }

    public void setAccountName(String accountName, String color) {
        synchronized (nameLock) {
            this.accountName = accountName;
            System.out.println(color + "NEW NAME: " + accountName);
        }
    }

    public void deposit(double amount, String color) {

        synchronized (balanceLock) {
            System.out.println(color + "Talking to the clerk....");
            try {
                Thread.sleep(7000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            double newBalance = balance + amount;

            System.out.println(color + "STARTING BALANCE: " + balance + " DEPOSIT: " + amount + " REMAINING: " + newBalance);
            balance = newBalance;
            promoDollars(amount, color);
        }
    }

    public void withdraw(double amount, String color) {

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        synchronized (balanceLock) {
            if (amount > balance) {
                System.out.println(color + "INSUFFICIENT FUNDS!");
            } else {
                double newBalance = balance - amount;

                System.out.println(color + "STARTING BALANCE: " + balance + " WITHDRAW: " + amount + " REMAINING: " + newBalance);
                balance = newBalance;
            }
        }
    }

    public void promoDollars(double amount, String color) {

        if (amount >= 5000) {
            synchronized (balanceLock) {
                System.out.println(color + "Congratulations, you earned a promotional deposit!");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                this.balance += 25;
            }
        }
    }
}
