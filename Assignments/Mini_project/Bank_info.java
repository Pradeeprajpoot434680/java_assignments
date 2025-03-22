class Bank_User {
    int user_id;
    int amount;
    Boolean isCreditcard;
    Boolean isDebitcard;
    int c_pin;
    int d_pin;
    
    Bank_User(int id, int amount, Boolean isCreditcard, Boolean isDebitcard, int c_pin, int d_pin) {
        user_id = id;
        this.amount = amount;
        this.isCreditcard = isCreditcard; 
        this.isDebitcard = isDebitcard;
        this.c_pin = c_pin;
        this.d_pin = d_pin;
    }
}

class Node {
    Bank_User bank_user;
    Node next;
    
    Node(Bank_User p) {
        bank_user = p;
        next = null;
    }
}

class Bank {
    Node front;
    Node tail;
    
    Bank() {
        front = tail = null;
    }

    // Insert a user
    void create_user(int id, int amount, Boolean isCreditcard, Boolean isDebitcard, int c_pin, int d_pin) {   
        Bank_User u1 = new Bank_User(id, amount, isCreditcard, isDebitcard, c_pin, d_pin);
        Node temp = new Node(u1);
        
        if (front == null) {
            front = temp;
            tail = front;
        } else {
            tail.next = temp;
            tail = tail.next;
        }
    }

    // Display all users
    void display_user() {
        Node temp = front;
        while (temp != null) {
            System.out.print(temp.bank_user.user_id + " | ");
            System.out.print(temp.bank_user.amount + " | ");
            System.out.print(temp.bank_user.isDebitcard + " | ");
            System.out.print(temp.bank_user.isCreditcard + " | ");
            System.out.print(temp.bank_user.c_pin + " | ");
            System.out.print(temp.bank_user.d_pin + " | ");
            System.out.println();
            temp = temp.next;
        }
    }
}

class Test {
    public static void main(String[] args) {
        int id = 0;
        Bank u1 = new Bank();
        
        // Incrementing id for each user
        u1.create_user(id++, 12000, true, true, 12345, 54321);
        u1.create_user(id++, 2000, true, true, 54325, 8767);
        u1.create_user(id++, 1000, true, true, 32454, 985786);
        u1.create_user(id++, 122000, true, true, 12345, 4793);
        
        u1.display_user();
    }
}
