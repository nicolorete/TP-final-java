package com.company;

import java.util.UUID;

public class ItemRent {

    private UUID uuid;
    private String name;
    private double price;

    public ItemRent() {
    }

    public ItemRent(String name, double price) {
        this.uuid = uuid.randomUUID();
        this.name = name;
        this.price = price;
    }

    ///region GETTERS AND SETTERS

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    ///endregion


    @Override
    public String toString() {
        return " ItemRent{" +
                "\n id: " + uuid.toString().substring(1,10) +
                "\n name: " + name +
                "\n price: $" + price +
                '}';
    }
}
