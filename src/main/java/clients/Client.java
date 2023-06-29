package clients;

import accounts.Account;

public class Client implements MoneyTarget {
    protected String name;
    protected int maxScore;

    private Account[] accounts;

    public Client(String name, int maxScore) {
        this.name = name;
        this.accounts = new Account[maxScore];
    }

    public Account[] getAccounts() {
        return accounts;
    }

    public void setAccounts(Account[] accounts) {
        this.accounts = accounts;
    }

    public boolean pay(int amount) {
        if (accounts == null) {
            return false;
        }
        for (Account account : accounts) {
            if (account != null) {
                if (account.pay(amount)) {
                    return true;
                }
            }
        }
        System.out.println("Метод прошла успешно на " + amount);
        return false;
    }

    public void add(Account account) {
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] == null) {
                accounts[i] = account;
                return;
            }
        }

        System.out.println("Мест для добавления нового счета нет! :(");
    }

    @Override
    public boolean accept(Account money) {
        return false;
    }
}