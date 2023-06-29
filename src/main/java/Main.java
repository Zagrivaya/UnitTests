import accounts.Account;
import accounts.CheckingAccount;
import accounts.CreditAccount;
import accounts.SavingsAccount;
import clients.Client;

public class Main {
    public static void main(String[] args) {
        Account checkingAccount = new CheckingAccount("Kudryashov", 800_000);
        Account savingsAccount = new SavingsAccount("Ivanov", 450_000);
        Account creditAccount = new CreditAccount("Ruslanova", 650_000);

        System.out.println(checkingAccount.pay(305_000));
        System.out.println(savingsAccount.pay(349_000));
        System.out.println(creditAccount.pay(250_000));

        Client client = new Client("Sergei", 10);
        System.out.println(client.pay(2045));

        Account savingsAccount1 = new SavingsAccount("Savings", 200);
        Account creditAccount1 = new CheckingAccount("Credit", -20);

        System.out.println(savingsAccount1.getBalance());
        System.out.println(creditAccount1.getBalance());

        boolean b = savingsAccount1.transfer(creditAccount1, 50);
        System.out.println(b);
        System.out.println(savingsAccount1.getBalance());
        System.out.println(creditAccount1.getBalance());
    }
}
