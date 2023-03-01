package Now;

interface BankAccount1{
    void deposit();
    void withdraw();
}

class CheckingAcc implements BankAccount1 {
    public void deposit() {
        System.out.println("Amount is deposited");
    }
    
    public void withdraw() {
        System.out.println("Amount is withdrawn");
    }
}

public class BankAcc {
    public static void main(String[] args) {
        CheckingAcc check = new CheckingAcc();
        check.deposit();
        check.withdraw();
    }
}

