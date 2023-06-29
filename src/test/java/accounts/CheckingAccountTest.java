package accounts;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CheckingAccountTest {
    @Test
    @DisplayName("Аккаунт имеет минимальный баланс (0), ниже минимума платить нельзя.")
    public void accountMustMaintainPositiveBalance() {
        CheckingAccount testCheckingAccount = new CheckingAccount("Sergei", 50);
        // Аккаунт имеет минимальный баланс (0), ниже минимума платить нельзя.
        long testPaymentAmount = 2_000;
        Assertions.assertFalse(testCheckingAccount.pay(testPaymentAmount));
    }
}