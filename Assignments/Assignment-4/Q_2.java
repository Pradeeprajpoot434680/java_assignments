import java.util.ArrayList;
import java.util.Scanner;
class Product
{
    String product_name;
    int product_price;
}
    
class Customer
{
    String name;
    String email;
    int balance;
    String membership;
    String password;
    String isDebit;
    String isCredit;
    ArrayList<Product>products;
    Customer(String name,String email,String membership,int balance,String password,String isCredit,String isDebit)
    {
        this.name = name;
        this.email = email;
        this.membership = membership;
        this.balance = balance;
        this.password =password;
        this.isCredit =isCredit;
        this.isDebit = isDebit;
    }
    void buyProduct()
    {
        
    }   
   
}
    

class Store extends Customer
{
    private  ArrayList<Customer> customers = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);
    public static void main(String arg[])
    {
        while (true) 
        {
            System.out.println("\n--- Store System Menu ---");
            System.out.println("1. Add Customer");
            System.out.println("2. Add Payment Card");
            System.out.println("3. List Payment Cards");
            System.out.println("4. Make Payment");
            System.out.println("5. Deposit Money");
            System.out.println("6. Add Store to Customer");
            System.out.println("7. View Customer Details");
            System.out.println("8. Exit");

            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // consume newline

            switch (choice) {
                case 1:
                    addCustomer();
                    break;
                case 2:
                    addPaymentCard();
                    break;
                case 3:
                    listPaymentCards();
                    break;
                case 4:
                    makePayment();
                    break;
                case 5:
                    depositMoney();
                    break;
                case 6:
                    addStoreToCustomer();
                    break;
                case 7:
                    viewCustomerDetails();
                    break;
                case 8:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }

        private static void addCustomer() {
        System.out.println("Enter your name:");
        name = sc.nextLine();
        System.out.println("Enter your Email:");
        email = sc.nextLine();
        System.out.print("Enter membership info: ");
        String membershipInfo = scanner.nextLine();
        System.out.println("Enter your initial balance:");
        int balance = sc.nextInt();
        System.out.println("Enter your password:");
        String pass = nextLine();
        System.out.println("Do you have Debit card(yes/no):");
        isDebit = sc.nextLine();
        System.out.println("Do you have creadit card(yes/no):");
        isCredit = sc.nextLine();

        customers.add(new Customer(name, email, membershipInfo,balance,pass,isCredit,isDebit));
        System.out.println("Customer added successfully.");
    }
    }
}  
