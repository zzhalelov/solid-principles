package singleResponsibilityPrinciple.example_1;

public class Order {
    String customerName;
    String purchaseItem;
    int purchaseQuantuty;

    public Order(String customerName, String purchaseItem, int purchaseQuantuty) {
        this.customerName = customerName;
        this.purchaseItem = purchaseItem;
        this.purchaseQuantuty = purchaseQuantuty;
    }
}