package BankOne;

public class SavingsAccount extends BankAccount {
    public final static double INTEREST_RAT = 0.1;

    public SavingsAccount(String accountNumber, double balance, double interestRat) {
        super(accountNumber, balance);

    }
    public void addInterest(){
        deposit(getBalance()*INTEREST_RAT);
    }

    @Override
    public String toString() {
        return "SavingsAccount \n Account Number \t"+getAccountNumber()+
                "Account Balance \t"+getBalance()+
                 "Interest Rat \t"+INTEREST_RAT*100;
    }
}

