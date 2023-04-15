public class CheckingAccount extends BankAccount {

    static private final double FEE = 0.15;

    public CheckingAccount(String name, double amountInitial)
    {
        super(name, amountInitial);

        String accountNum = super.getAccountNumber();

        super.setAccountNumber(accountNum + "-10");
    }

        @Override
        public boolean withdraw(double amount )
    {
        double value = amount + FEE;

        return super.withdraw((value));
    }


}
