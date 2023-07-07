import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name,city;
        int accno , amt;
        ArrayList<Account> list = new ArrayList<>();
        list.add(new Account("Ajay Kumar","Delhi",5000));
        list.add(new Account("Amit Kumar","Kanpur",6000));
        list.add(new Account("Vijay Kumar","Jaipur",10000));

        System.out.println("Select Operation:");
        System.out.println("1. Open Account");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Balance Enquiry");
        System.out.println("5. List All");
        System.out.println("6. Exit");
        int choice;
        boolean found;
    do {
        System.out.println("---------------------");
        System.out.print("Enter Choice Here:-");
        choice = sc.nextInt();
        switch (choice)
        {
        case 1:
            System.out.println("--Account Open--");
            System.out.print("Enter name for account:");
            name=sc.next();
            System.out.print("Enter city:");
            city=sc.next();
            System.out.print("Enter amount:");
            amt=sc.nextInt();
            Account acc=new Account(name,city,amt);
            System.out.println("Account Opened");
            list.add(acc);
            break;
        case 2:
                System.out.println("--Account Deposit--");
                found=false;
                System.out.print("Enter the account number:");
                accno=sc.nextInt();
                for(Account ac:list) {
                    if (accno == ac.getAccno())
                    {
                        found = true;
                        System.out.println("Customer name:" + ac.getName());
                        System.out.println("City name :" + ac.getCity());
                        System.out.println("Account balance:" + ac.getBal());

                        System.out.println("\n Enter Amount to deposit:");
                        amt = sc.nextInt();
                        ac.setBal(ac.getBal() + amt);
                        System.out.println("Deposit Successfully..!!");
                        System.out.println("Updated amount is :"+ ac.getBal());
                        break;
                    }
                }
                    if(!found){
                        System.out.println("Invalid Account Number");
                    }
                break;
            case 3:
                System.out.println("--Account Withdraw--");
                found=false;
                System.out.print("Enter the account number:");
                accno=sc.nextInt();
                for(Account ac:list) {
                    if (accno == ac.getAccno()) {
                        found = true;
                        System.out.println("Customer name:" + ac.getName());
                        System.out.println("City name :" + ac.getCity());
                        System.out.println("Account balance:" + ac.getBal());

                        System.out.println("\n Enter Amount to deposit:");
                        amt = sc.nextInt();
                        if(amt<=ac.getBal()){
                            ac.setBal(ac.getBal() - amt);
                            System.out.println("Withdraw Successfully..!!");
                            System.out.println("Updated amount is :"+ ac.getBal());
                        }
                        else{
                            System.out.println("Insufficient balance..!!");
                        }
                        break;
                    }
                }
                if(!found){
                    System.out.println("Invalid Account Number");
                }
                break;
            case 4:
                System.out.println("--Account Balance Enquiry--");
                found=false;
                System.out.print("Enter the account number:");
                accno=sc.nextInt();
                for(Account ac:list) {
                    if (accno == ac.getAccno()) {
                        found = true;
                        System.out.println("Customer name:" + ac.getName());
                        System.out.println("City name :" + ac.getCity());
                        System.out.println("Account balance:" + ac.getBal());
                    }
                }
                if(!found){
                    System.out.println("Invalid Account Number");
                }
                break;
            case 5:
                System.out.println("--List of all accounts--");
                for (Account ac : list) {
                    System.out.println(ac);
                }
                break;
            case 6:
                System.out.println("--Thanks for visiting us--");
                break;
            default:
                System.out.println("--Invalid Choice--");
                break;
        }
    }
        while(choice!=6);
    }
}
