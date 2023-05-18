package com.pn;

public class Item {

    private String items_Id;
    private String name;
    private String price;

    public Item() {
        this.items_Id = items_Id;
        this.name = name;
        this.price = price;
    }

    public String getItem_Id() {
        return items_Id;
    }

    public void setItem_Id(String item_Id) {
        this.items_Id = item_Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Item{" +
                "item_Id='" + items_Id + '\'' +
                ", name='" + name + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}

