package openClosedPrinciple.example_1;

public class OrderProcessorWithPreAndPostProcessing extends OrderProcessor {
    @Override
    public void process(Order order) {
        super.process(order);
    }

    public void beforeProcessing() {
        // Осуществим некоторые действия перед обработкой заказа
    }

    public void afterProcessing() {
        // Осуществим некоторые действия после обработки заказа
    }
}