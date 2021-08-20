package com.epam.fshop.entity;

import com.epam.fshop.entity.AccessoryEntity.Accessory;
import com.epam.fshop.entity.FlowerEntity.Flower;

import java.util.List;

public class Bouquet {
    private String name;
    private double cost;
    private List<Flower> flowers;
    private List<Accessory> accessories;

    public Bouquet(String name, double cost, List<Flower> flowers, List<Accessory> accessories) {
        this.name = name;
        this.cost = cost;
        this.flowers = flowers;
        this.accessories = accessories;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public List<Flower> getFlowers() {
        return flowers;
    }

    public void setFlowers(List<Flower> flowers) {
        this.flowers = flowers;
    }

    public List<Accessory> getAccessories() {
        return accessories;
    }

    public void setAccessories(List<Accessory> accessories) {
        this.accessories = accessories;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Bouquet bouquet = (Bouquet) o;

        if (Double.compare(bouquet.cost, cost) != 0) return false;
        if (name != null) {
            if (!name.equals(bouquet.name)) return false;
        } else {
            if (bouquet.name != null) return false;
        }
        if (flowers != null) {
            if (!flowers.equals(bouquet.flowers)) return false;
        } else {
            if (bouquet.flowers != null) return false;
        }
        if (accessories != null) return accessories.equals(bouquet.accessories);
        return bouquet.accessories == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name != null ? name.hashCode() : 0;
        temp = Double.doubleToLongBits(cost);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (flowers != null ? flowers.hashCode() : 0);
        result = 31 * result + (accessories != null ? accessories.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(
                String.format("%-8s \"%s\"\nCost: %-4.2f $\n", getClass().getSimpleName(), name, cost)
        );

        for (Flower f : flowers) {
            sb.append(f + "\n");
        }
        sb.append("\n");
        for (Accessory a : accessories) {
            sb.append(a + "\n");
        }
        return sb.toString();
    }
}
