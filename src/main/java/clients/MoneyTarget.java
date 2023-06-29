package clients;

import accounts.Account;

public interface MoneyTarget {
    boolean accept(Account money);
}
