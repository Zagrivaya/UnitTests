package accounts;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SavingsAccountTest {
    @Test
    public void accountMustMaintainMinimalBalance() {
        long testMinimalBalance = 1000;
        long exceedingTheMinimumBalance = 2000;
        SavingsAccount testSavingAccount = new SavingsAccount("John Doe", testMinimalBalance);
        // Аккаунт имеет минимальный баланс
        Assertions.assertFalse(testSavingAccount.pay(exceedingTheMinimumBalance));
    }
}