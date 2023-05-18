package com.pn;

public class Order {

    private String orderId;
    private String item;


    public Order() {
        this.orderId = orderId;
        this.item = item;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrder_Id(String orderId) {
        this.orderId = orderId;
    }

    public String getItems() {
        return item;
    }

    public void setItems(String item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "Order{" +
                "order_Id='" + orderId + '\'' +
                ", item='" + item + '\'' +
                '}';
    }
}
