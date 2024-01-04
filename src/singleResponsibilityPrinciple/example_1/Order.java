package singleResponsibilityPrinciple.example_1;

public class Order {
    String customerName;
    String purchasedItem;
    int purchasedQuantity;

    public Order(String customerName, String purchaseItem, int purchaseQuantuty) {
        this.customerName = customerName;
        this.purchasedItem = purchaseItem;
        this.purchasedQuantity = purchaseQuantuty;
    }
}