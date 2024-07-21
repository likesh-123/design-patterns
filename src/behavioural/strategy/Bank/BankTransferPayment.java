package behavioural.strategy.Bank;

// Concrete Strategy 3: Bank Transfer Payment
public class BankTransferPayment implements PaymentStrategy {
    private String bankAccount;
    private String bankCode;

    public BankTransferPayment(String bankAccount, String bankCode) {
        this.bankAccount = bankAccount;
        this.bankCode = bankCode;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid using bank transfer");
    }
}
