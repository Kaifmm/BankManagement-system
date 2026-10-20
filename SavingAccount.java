package Bank_acount_management_system;

public class SavingAccount extends BankAccount {
    double interestRate;
    public SavingAccount(int account_no, String customerName, int balance,double interestRate) {
        super(account_no, customerName, balance);
        this.interestRate = interestRate;
    }

    public void displayDetails()
    {
        super.displayDetails();
        System.out.println("rate of interest is: " + interestRate);
        System.out.println("Annual interst is: " + CalcInterestRate());
    }

    public double CalcInterestRate() {
        double interst=(getBalance()*interestRate)/100;
        return interst;
    }

}
