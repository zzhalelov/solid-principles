package singleResponsibilityPrinciple.example_1;

public class Order {
    private String customerName;
    private String customerEmail;
    private String purchasedItem;
    private int purchasedQuantity;

    public Order(String customerName, String customerEmail, String purchaseItem, int purchaseQuantuty) {
        this.customerName = customerName;
        this.purchasedItem = purchaseItem;
        this.purchasedQuantity = purchaseQuantuty;
        this.customerEmail = customerEmail;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getPurchasedItem() {
        return purchasedItem;
    }

    public int getPurchasedQuantity() {
        return purchasedQuantity;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }
}