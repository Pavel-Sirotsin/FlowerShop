package com.epam.fshop.entity.AccessoryEntity;

public class Accessory {
    private double price;
    private double length;
    private String color;

    public Accessory() {
    }

    public Accessory(double price, double length, String color) {
        this.price = price;
        this.length = length;
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Accessory accessory = (Accessory) o;

        if (Double.compare(accessory.price, price) != 0) return false;
        if (Double.compare(accessory.length, length) != 0) return false;
        if (color != null) return color.equals(accessory.color);
        return accessory.color == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(price);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(length);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (color != null ? color.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return String.format("%s | " +
                "Price: %.2f | " +
                "Length: %.1f | " +
                "Color: %s", getClass().getSimpleName(), price, length, color);
    }
}
