public class BankAccount {

    private double accountBalance;

    public void setBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public double getBalance() {
        return accountBalance;
    }

    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        account.setBalance(5000);

        System.out.println("Account Balance: " + account.getBalance());
    }
}