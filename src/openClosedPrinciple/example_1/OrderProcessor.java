package openClosedPrinciple.example_1;

public class OrderProcessor {
    public void process(Order order) {
        MyOrderRepository repository = new MyOrderRepository();
        ConfirmationEmailSender emailSender = new ConfirmationEmailSender();
        if (repository.save(order)) {
            emailSender.sendConfirmationEmail(order);
        }
    }
}