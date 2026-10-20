package Bank_acount_management_system;

public class BankAccount {
    private int account_no;
    private String customerName;
    private int balance;
    public BankAccount(int account_no, String customerName, int balance) {
        this.account_no = account_no;
        this.customerName = customerName;
        this.balance = balance;
    }

    public void setAccount_no(int account_no) {
        this.account_no = account_no;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;

    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
    public int getAccount_no() {
        return account_no;
    }
    public String getCustomerName() {
        return customerName;
    }
  public int getBalance() {
        return balance;
  }
    public void deposit(int amount) {
        if(amount>0){
            balance += amount;
            System.out.println("Deposited " + amount+" cuurent balance is "+balance);
        }
        else {
            System.out.println("invalid deposit amount");
        }
    }
    public void deposit(double amount) {
        if(amount>0){
            balance += amount;
        }
    }
    public void withdraw(int amount) {
        if(amount>balance){
            System.out.println("withdrawal amount is greater than balance");
        }
        else if(amount<=0) {
            System.out.println("invalid withdrawal amount");
        }
        else {
            balance -= amount;
            System.out.println("Withdrawn " + amount+" cuurent balance is "+balance);
        }
    }
    public void displayDetails() {
        System.out.println("Account no: " + account_no);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Balance: " + balance);
    }
    public void transferTo(int amount,BankAccount destination) {
         if(amount<=0) {
             System.out.println("invalid transfer amount");
         }
        else if(amount>balance){
            System.out.println("transfer amount is greater than balance");
        }

        else {
            this.balance -= amount;
            destination.balance += amount;
            System.out.println("transfer successful");
        }
    }
}
