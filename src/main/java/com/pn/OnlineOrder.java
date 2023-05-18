package com.pn;

public class OnlineOrder extends Order {

    private String orderId;
    private String itemName;
    private String deliveryAddress;

    public OnlineOrder(String orderId, String itemName, String deliveryAddress) {
        super();
        this.orderId = orderId;
        this.itemName = itemName;
        this.deliveryAddress = deliveryAddress;
    }

    @Override
    public String toString() {
        return String.format("Online Order\n" +
                "Order ID: %s\n" +
                "Item Name: %s\n" +
                "Delivery Address: %s", orderId, itemName, deliveryAddress);
    }
}
