package clients;

import accounts.Account;
import accounts.CheckingAccount;
import accounts.CreditAccount;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class ClientTest {
    private Account testAccount1;
    private Account testAccount2;
    private Client testClient;

    @BeforeEach
    public void createNewAccountsAndClient() {
        int maximumNumberOfAccountsInClient = 1;
        testClient = new Client("Maxim", maximumNumberOfAccountsInClient);
        testAccount1 = new CheckingAccount("Ivanov", 5);
        testAccount2 = new CreditAccount("Petrov", 10);
    }

    @Test
    @DisplayName("Клиент не может превышать указанное количество учетных записей")
    public void doNotExceedTheNumberOfAccounts() {
        testClient.add(testAccount1);
        assertFalse(testClient.accept(testAccount2));
    }
}
