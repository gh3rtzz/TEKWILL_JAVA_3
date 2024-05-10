package lecture_nr_19;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        BankAccount companyAccount = new BankAccount(10000, "Test name");

        Thread t1 = new Thread(() -> companyAccount.withdraw(2500, Constants.ANSI_RED));
        Thread t2 = new Thread(() -> companyAccount.deposit(5001, Constants.ANSI_BLUE));
        Thread t3 = new Thread(() -> companyAccount.withdraw(3000, Constants.ANSI_GREEN));
        Thread t4 = new Thread(() -> companyAccount.setAccountName("Changed name", Constants.ANSI_PURPLE));

        t2.start();
        t1.start();
        t4.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();
    }
}
