package com.epam.fshop.entity.FlowerEntity;

public class Flower implements Comparable<Flower> {
    private double price;
    private int freshness;
    private int length;
    private String color;
    private String variety;

    public Flower() {
    }

    public Flower(double price, int freshness, int length, String color, String variety) {
        this.price = price;
        this.freshness = freshness;
        this.length = length;
        this.color = color;
        this.variety = variety;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getFreshness() {
        return freshness;
    }

    public void setFreshness(int freshness) {
        this.freshness = freshness;
    }

    public int getLength() {
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

    public String getVariety() {
        return variety;
    }

    public void setVariety(String variety) {
        this.variety = variety;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flower flower = (Flower) o;

        if (Double.compare(flower.price, price) != 0) return false;
        if (freshness != flower.freshness) return false;
        if (length != flower.length) return false;
        if (color != null) {
            if (!color.equals(flower.color)) return false;
        } else {
            if (flower.color != null) return false;
        }
        if (variety != null) return variety.equals(flower.variety);
        return flower.variety == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(price);
        result = (int) (temp ^ (temp >>> 32));
        result = 31 * result + freshness;
        result = 31 * result + length;
        result = 31 * result + (color != null ? color.hashCode() : 0);
        result = 31 * result + (variety != null ? variety.hashCode() : 0);
        return result;
    }

    @Override
    public int compareTo(Flower o) {
        return Integer.compare(freshness, o.freshness);
    }

    @Override
    public String toString() {
        return String.format("%-6s - Price: %-4.2f $ | " +
                        "Freshness: %d day(s) | " +
                        "Length: %-2d | " +
                        "Color: %-6s | " +
                        "Variety: %-13s",
                getClass().getSimpleName(), price, freshness, length, color, variety);
    }
}