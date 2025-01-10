package BankOne;

public class CurrentAccount extends BankAccount{
    private double overdraftLimit=1000;

    public CurrentAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    public double applyOverdraft(double amount){
        return 0;
    }
}
