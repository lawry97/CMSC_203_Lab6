import java.util.prefs.BackingStoreException;

public class SavingsAccount extends BankAccount {

    private double rate = 0.025;

    private static int savingsNumber = 0;
    private String accountNumber;

    public SavingsAccount(String name, double initialBalance)
    {
        super(name, initialBalance);

        accountNumber = super.getAccountNumber() + "-" + savingsNumber;

    }

    public SavingsAccount(SavingsAccount account, double initialAmount)
    {
        super(account, initialAmount);
    }

    public void postInterest()
    {
        double value = super.getBalance() * rate;
        super.deposit(value);

    }

    public String getAccountNumber()
    {
        return accountNumber;
    }


}
