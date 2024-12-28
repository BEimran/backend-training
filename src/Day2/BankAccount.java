package Day2;

class BankAccountCheck {
    private String accountNumber;
    private double balance;

    public BankAccountCheck(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            System.out.println("Initial balance cannot be negative. Setting balance to 0.");
            this.balance = 0;
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited $" + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Successfully withdrew $" + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient balance. Withdrawal failed.");
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

    public double checkBalance() {
        return balance;
    }
}
public class BankAccount {

        public static void main(String[] args) {
            BankAccountCheck account = new BankAccountCheck("123456789", 1000);

            System.out.println("Initial Balance: $" + account.checkBalance());

            account.deposit(500);
            System.out.println("Balance after deposit: $" + account.checkBalance());

            account.withdraw(300);
            System.out.println("Balance after withdrawal: $" + account.checkBalance());


            account.withdraw(1500);


            System.out.println("Final Balance: $" + account.checkBalance());
        }
    }
