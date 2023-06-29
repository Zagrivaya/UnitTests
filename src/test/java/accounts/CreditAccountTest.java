package accounts;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CreditAccountTest {
    @Test
    public void balanceCannotBePositive() {
        long testPayment = 45;
        CreditAccount testCreditAccount = new CreditAccount("Ruslanova", 300_34);
        // Аккаунт не может иметь положительный баланс
        Assertions.assertFalse(testCreditAccount.add(testPayment));
    }
}