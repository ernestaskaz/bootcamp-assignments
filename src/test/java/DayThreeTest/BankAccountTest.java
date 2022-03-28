package DayThreeTest;

import com.bootcamp.assignments.DayThree.BankAccount;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import javax.management.InvalidApplicationException;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.fail;

public class BankAccountTest {



    @BeforeClass
    public static void setUp() {
        BankAccountTest bankAccountTest = new BankAccountTest();
    }

    @Test
    public void canDeposit() {
        BankAccount firstAccount = new BankAccount(1000, "ERNESTAS", "KAZ");

        firstAccount.deposit(500);
        double expected = 1500;

        assertEquals("did not deposit", expected, firstAccount.getBalance());

    }

    @Test

    public void canWithdraw() {

        BankAccount firstAccount = new BankAccount(1000, "ERNESTAS", "KAZ");

        firstAccount.withdraw(500);
        double expected = 500;

        assertEquals("did not withdraw", expected, firstAccount.getBalance());



    }
    @Test
    public void canTransfer() {

        BankAccount firstAccount = new BankAccount(1000, "ERNESTAS", "KAZ");
        BankAccount secondAccount = new BankAccount(2000, "SOMEONE", "ELSE");

        double expected = 2076;

        firstAccount.transferBalance(secondAccount, 76);

        assertEquals("did not withdraw", expected, secondAccount.getBalance());



    }




    @Test(expected = IllegalArgumentException.class)
    public void depositThrowsIllegalArgument() {
        BankAccount firstAccount = new BankAccount(1000, "ERNESTAS", "KAZ");

        double amountToDeposit = 7000;

        firstAccount.deposit(amountToDeposit);


        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            firstAccount.deposit(amountToDeposit);
        });


    }




}
