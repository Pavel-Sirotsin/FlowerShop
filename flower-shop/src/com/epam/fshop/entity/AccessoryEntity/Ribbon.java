package com.epam.fshop.entity.AccessoryEntity;

public class Ribbon extends Accessory {
    private String edging;
    private String fabric;


    public Ribbon() {
    }

    public Ribbon(double price, double length, String color, String edging, String fabric) {
        super(price, length, color);
        this.edging = edging;
        this.fabric = fabric;
    }

    public String getEdging() {
        return edging;
    }

    public void setEdging(String edging) {
        this.edging = edging;
    }

    public String getFabric() {
        return fabric;
    }

    public void setFabric(String fabric) {
        this.fabric = fabric;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Ribbon ribbon = (Ribbon) o;

        if (edging != null) {
            if (!edging.equals(ribbon.edging)) return false;
        } else {
            if (ribbon.edging != null) return false;
        }
        if (fabric != null) return fabric.equals(ribbon.fabric);
        return ribbon.fabric == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (edging != null ? edging.hashCode() : 0);
        result = 31 * result + (fabric != null ? fabric.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return String.format("%s - %s" +
                        "Edging: %s | " +
                        "Fabric: %s",
                getClass().getSimpleName(), super.toString(), edging, fabric);
    }
}
