package Bank_acount_management_system;

public class CurrentAccount extends BankAccount {
    int DraftLimit;

    public CurrentAccount(int account_no, String customerName,
                          int balance, int DraftLimit) {
        super(account_no, customerName, balance);
        this.DraftLimit = DraftLimit;
    }
    @Override
    public void withdraw(int amount) {
        if(amount<=0){
            System.out.println("Amount is negative");
        }
        else if(amount<=getBalance()+DraftLimit){
            setBalance(getBalance()-amount);
            System.out.println("withdrawn "+amount);
            System.out.println("Balance is "+getBalance());
        }
        else{
           System.out.println("withdraw  not possible draft limit exceeded");
        }
    }
}