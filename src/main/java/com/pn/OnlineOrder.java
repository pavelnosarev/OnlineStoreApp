package com.pn;

public class OnlineOrder extends Order {

    private String deliveryAddress;

    public OnlineOrder(int id, String itemName, String deliveryAddress) {
        super();

        this.deliveryAddress = deliveryAddress;
    }

    @Override
    public String toString() {
        return String.format("Online Order\n" +
                "Order ID: %s\n" +
                "Item Name: %s\n" +
                "Delivery Address: %s", deliveryAddress);
    }
}
