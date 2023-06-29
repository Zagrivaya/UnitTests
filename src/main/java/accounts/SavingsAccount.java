package accounts;

public class SavingsAccount extends Account {
    protected long minBalance;

    public SavingsAccount(String name, long balance) {
        super(name, balance);
        int minBalance = 200_000;
    }

    @Override
    public boolean add(long amount) {
        if (amount > 0) {
            balance += amount;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean pay(long amount) {
        if (balance - amount >= minBalance) {
            balance -= amount;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean accept(int money) {
        return false;
    }

    @Override
    public boolean accept(Account money) {
        return false;
    }
}
