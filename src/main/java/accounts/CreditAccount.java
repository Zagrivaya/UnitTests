package accounts;

public class CreditAccount extends Account {
    protected long credit;

    public CreditAccount(String name, long balance) {
        super(name, balance);
        this.balance -= 0;
    }

    @Override
    public boolean add(long amount) {
        if (balance + amount < 0) {
            balance += amount;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean pay(long amount) {
        return super.pay(amount);
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
