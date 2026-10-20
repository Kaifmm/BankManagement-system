package Bank_acount_management_system;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        BankAccount kaif=new BankAccount(121,"kaif mulla",3000);
      //  kaif.deposit(500);
      //  kaif.withdraw(400);
       // kaif.displayDetails();
       /* SavingAccount musa=new SavingAccount(111,"musa mulla",100,0.5);
        musa.displayDetails();
        musa.deposit(5000);
        musa.displayDetails();
        musa.withdraw(4000);*/
      //  BankAccount rahul=new BankAccount(122,"rahul mulla",4000);
        //kaif.transferTo(1000,rahul);
        //kaif.displayDetails();

       // BankAccount kaif1=new SavingAccount(121,"kaif mulla",3000,0.5);
        //kaif1.displayDetails();
        BankAccount Ba[]=new BankAccount[10];

            Ba[0]=new BankAccount(121,"kaif mulla",3000);
            Ba[1]=new BankAccount(122,"afnan kumbari",4000);
            Ba[2]=new BankAccount(123,"sohel pattekari",5000);
       // for(int i=0;i<Ba.length;i++){
         //   Ba[i].displayDetails();
        //}
        Scanner sc=new Scanner(System.in);
       /* System.out.println("enter the account number");
        int n=sc.nextInt();
        System.out.println("enter the amount to deposit");
        int a=sc.nextInt();
        boolean flag=true;
        for(int i=0;i<Ba.length;i++){
            if(n== Ba[i].getAccount_no()) {
                Ba[i].deposit(a);

                flag=false;
                break;
            }

        }
        if(flag==true) {
            System.out.println("no acount found");
        }*/

      /*  System.out.println("enter the account number");
        int n1=sc.nextInt();
        System.out.println("enter the amount to withdraw");
        int a1=sc.nextInt();
        boolean flag1=true;
        for(int i=0;i<Ba.length;i++){
            if(n1== Ba[i].getAccount_no()) {
                Ba[i].withdraw(a1);

                flag1=false;
                break;
            }

        }
        if(flag1==true) {
            System.out.println("no acount found");
        }*/
      /*  System.out.println("enter the senders account number");
        int n2=sc.nextInt();
        System.out.println("enter the receivers account number");
        int n3=sc.nextInt();
        System.out.println("enter the amount to tranfer");
        int a3=sc.nextInt();
       BankAccount sender=null;
       BankAccount receiver=null;

        for(int i=0;i<Ba.length;i++){
            if(n2== Ba[i].getAccount_no()) {
               sender=Ba[i];
               break;
            }
        }
        for(int i=0;i<Ba.length;i++){
            if(n3== Ba[i].getAccount_no()) {
                receiver=Ba[i];
                break;
            }
        }
        if(sender==null&&receiver==null)
        {
      System.out.println("account not found");
        }
        else{
            sender.transferTo(a3,receiver);
        }*/
        int choice;
do{
            System.out.println("Bank Account Management System");
            System.out.println("1. displayAccountDetails");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Transfer");
            System.out.println("5. Exit");
            System.out.println("6.create new account");
            System.out.println("Enter your choice");
            choice=sc.nextInt();



            switch (choice) {
                case 1:
                    for (int i = 0; i < Ba.length; i++) {
                    Ba[i].displayDetails();
                }
                    break;
                case 2:System.out.println("Enter the account no");
                int n=sc.nextInt();
                System.out.println("Enter the amount to deposit");
                int am=sc.nextInt();
                    for (int i = 0; i < Ba.length; i++) {
                        if(n== Ba[i].getAccount_no()) {
                            Ba[i].deposit(am);
                        }
                    }
                    break;
                    case 3:System.out.println("Enter the account no");
                    int n1=sc.nextInt();
                    System.out.println("Enter the amount to withdraw");
                    int am1=sc.nextInt();
                    for (int i = 0; i < Ba.length; i++) {
                        if(n1== Ba[i].getAccount_no()) {
                            Ba[i].withdraw(am1);
                        }
                    }
                       break;
                    case 4:
                        System.out.println("enter the senders account number");
                        int n2=sc.nextInt();
                        System.out.println("enter the receivers account number");
                        int n3=sc.nextInt();
                        System.out.println("enter the amount to tranfer");
                        int a3=sc.nextInt();
                        BankAccount sender=null;
                        BankAccount receiver=null;

                        for(int i=0;i<Ba.length;i++){
                            if(n2== Ba[i].getAccount_no()) {
                                sender=Ba[i];
                                break;
                            }
                        }
                        for(int i=0;i<Ba.length;i++){
                            if(n3== Ba[i].getAccount_no()) {
                                receiver=Ba[i];
                                break;
                            }
                        }
                        if(sender==null||receiver==null)
                        {
                            System.out.println("account not found");
                        }
                        else{
                            sender.transferTo(a3,receiver);
                        }
                        break;
                case 5:
                    System.exit(0);
                case 6:
                    int emptyIndex=-1;
                    for(int i=0;i<Ba.length;i++){
                        if(Ba[i]==null) {
                            emptyIndex=i;
                            break;
                        }
                    }
                    if(emptyIndex==-1) {
                        System.out.println("no available sapce");
                    }
                    else
                {
                      boolean exist=false;
                        System.out.println("enter account no");
                        int account_no = sc.nextInt();
                        for(int i=0;i<Ba.length;i++) {
                            if (Ba[i]!=null&&Ba[i].getAccount_no() == account_no) {
                                exist = true;
                                System.out.println("account already exists");
                            }
                        }
                        if(!exist) {
                            System.out.println("enter your name");
                            String customerName = sc.next();
                            System.out.println("enter the initial balance");
                            int balance = sc.nextInt();
                            Ba[emptyIndex] = new BankAccount(account_no, customerName, balance);
                            System.out.println("Account Created Succesfully");
                        }
                    }
            }

      }while(choice !=5);
    }
}

