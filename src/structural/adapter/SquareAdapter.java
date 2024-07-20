package structural.adapter;

public class SquareAdapter implements PaymentProcessor{
    private SquareGateway squareGateway;

    public SquareAdapter(){
        this.squareGateway = new SquareGateway();
    }

    @Override
    public void processPayment(double amount) {
        squareGateway.pay(amount);
    }
}
