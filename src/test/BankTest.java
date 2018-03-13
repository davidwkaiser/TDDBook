import org.junit.Test;

import static org.junit.Assert.*;

public class BankTest {

    @Test
    public void testReduceMoney(){
        Bank bank = new Bank();
        Money result = bank.reduce(Money.dollar(1), "USD");
        assertEquals(Money.dollar(1), result);
    }

}