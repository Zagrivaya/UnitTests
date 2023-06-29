package accounts;
import clients.MoneyTarget;

public abstract class Account implements MoneyTarget {
    protected Account account;
    protected String name;
    protected long balance;

    protected Account(String name, long balance)  {
        this.name = name;
        this.balance = balance;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public boolean pay(long amount) {
        if (balance < amount) {
            return false;
        } else {
            balance -= amount;
            return true;
        }
    }

    public boolean transfer(Account accountTo, int amount) {
        if (this.pay(amount)) {
            if (accountTo.add(amount)) {
                return true;
            } else {
                System.out.println("Неудачный перевод: " + amount + " рублей " + " возвращен на счет");
                this.balance += amount;
                return false;
            }
        }
        return false;
    }

    public  abstract  boolean add(long amount);

    public abstract boolean accept(int money);
}
