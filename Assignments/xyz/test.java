import java.util.ArrayList;
import java.util.Scanner;


class Customer {
    private String name;
    private String email;
    private String membershipInfo;
    private ArrayList<PaymentCard> paymentCards = new ArrayList<>();
    private ArrayList<String> stores = new ArrayList<>();

    // Constructor
    public Customer(String name, String email, String membershipInfo) {
        this.name = name;
        this.email = email;
        this.membershipInfo = membershipInfo;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getMembershipInfo() {
        return membershipInfo;
    }

    public void addStore(String storeName) {
        stores.add(storeName);
    }

    public ArrayList<String> getStores() {
        return stores;
    }

    public void addPaymentCard(PaymentCard card) {
        paymentCards.add(card);
    }

    public void listPaymentCards() {
        for (PaymentCard card : paymentCards) {
            System.out.println(card);
        }
    }

    public void makePayment(double amount, String cardType) {
        for (PaymentCard card : paymentCards) {
            if (card.getCardType().equalsIgnoreCase(cardType)) {
                card.payment(amount);
                return;
            }
        }
        System.out.println("Card type not found.");
    }

    public void depositMoney(double amount, String cardType) {
        for (PaymentCard card : paymentCards) {
            if (card.getCardType().equalsIgnoreCase(cardType)) {
                card.deposit(amount);
                return;
            }
        }
        System.out.println("Card type not found.");
    }
}

abstract class PaymentCard {
    protected double balance;
    protected String cardType;

    public PaymentCard(String cardType, double balance) {
        this.cardType = cardType;
        this.balance = balance;
    }

    public String getCardType() {
        return cardType;
    }

    public double getBalance() {
        return balance;
    }

    public abstract void payment(double amount);

    public abstract void deposit(double amount);
}

class CreditCard extends PaymentCard {

    public CreditCard(double balance) {
        super("Credit Card", balance);
    }

    @Override
    public void payment(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Paid " + amount + " using Credit Card. Remaining balance: " + balance);
        } else {
            System.out.println("Insufficient balance on Credit Card.");
        }
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " to Credit Card. New balance: " + balance);
    }
}

class DebitCard extends PaymentCard {

    public DebitCard(double balance) {
        super("Debit Card", balance);
    }

    @Override
    public void payment(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Paid " + amount + " using Debit Card. Remaining balance: " + balance);
        } else {
            System.out.println("Insufficient balance on Debit Card.");
        }
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " to Debit Card. New balance: " + balance);
    }
}

class StoreSystem {
    private static ArrayList<Customer> customers = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
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
    }

    private static void addCustomer() {
        System.out.print("Enter customer name: ");
        String name = scanner.nextLine();
        System.out.print("Enter customer email: ");
        String email = scanner.nextLine();
        System.out.print("Enter membership info: ");
        String membershipInfo = scanner.nextLine();

        customers.add(new Customer(name, email, membershipInfo));
        System.out.println("Customer added successfully.");
    }

    private static void addPaymentCard() {
        System.out.print("Enter customer email: ");
        String email = scanner.nextLine();
        Customer customer = findCustomerByEmail(email);
        if (customer != null) {
            System.out.print("Enter card type (Credit/Debit): ");
            String cardType = scanner.nextLine();
            System.out.print("Enter initial card balance: ");
            double balance = scanner.nextDouble();
            scanner.nextLine();  // consume newline

            if (cardType.equalsIgnoreCase("Credit")) {
                customer.addPaymentCard(new CreditCard(balance));
            } else if (cardType.equalsIgnoreCase("Debit")) {
                customer.addPaymentCard(new DebitCard(balance));
            } else {
                System.out.println("Invalid card type.");
            }
        } else {
            System.out.println("Customer not found.");
        }
    }

    private static void listPaymentCards() {
        System.out.print("Enter customer email: ");
        String email = scanner.nextLine();
        Customer customer = findCustomerByEmail(email);
        if (customer != null) {
            customer.listPaymentCards();
        } else {
            System.out.println("Customer not found.");
        }
    }

    private static void makePayment() {
        System.out.print("Enter customer email: ");
        String email = scanner.nextLine();
        Customer customer = findCustomerByEmail(email);
        if (customer != null) {
            System.out.print("Enter payment amount: ");
            double amount = scanner.nextDouble();
            scanner.nextLine();  // consume newline
            System.out.print("Enter card type (Credit/Debit): ");
            String cardType = scanner.nextLine();
            customer.makePayment(amount, cardType);
        } else {
            System.out.println("Customer not found.");
        }
    }

    private static void depositMoney() {
        System.out.print("Enter customer email: ");
        String email = scanner.nextLine();
        Customer customer = findCustomerByEmail(email);
        if (customer != null) {
            System.out.print("Enter deposit amount: ");
            double amount = scanner.nextDouble();
            scanner.nextLine();  // consume newline
            System.out.print("Enter card type (Credit/Debit): ");
            String cardType = scanner.nextLine();
            customer.depositMoney(amount, cardType);
        } else {
            System.out.println("Customer not found.");
        }
    }

    private static void addStoreToCustomer() {
        System.out.print("Enter customer email: ");
        String email = scanner.nextLine();
        Customer customer = findCustomerByEmail(email);
        if (customer != null) {
            System.out.print("Enter store name: ");
            String storeName = scanner.nextLine();
            customer.addStore(storeName);
            System.out.println("Store added to customer.");
        } else {
            System.out.println("Customer not found.");
        }
    }

    private static void viewCustomerDetails() {
        System.out.print("Enter customer email: ");
        String email = scanner.nextLine();
        Customer customer = findCustomerByEmail(email);
        if (customer != null) {
            System.out.println("\nCustomer Name: " + customer.getName());
            System.out.println("Customer Email: " + customer.getEmail());
            System.out.println("Membership Info: " + customer.getMembershipInfo());
            System.out.println("Stores: " + customer.getStores());
        } else {
            System.out.println("Customer not found.");
        }
    }

    private static Customer findCustomerByEmail(String email) {
        for (Customer customer : customers) {
            if (customer.getEmail().equalsIgnoreCase(email)) {
                return customer;
            }
        }
        return null;
    }
}
