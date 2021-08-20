package com.epam.fshop.entity.AccessoryEntity;

public class WrappingPaper extends Accessory {
    private String surface;
    private String material;


    public WrappingPaper() {
    }

    public WrappingPaper(double price, double length, String color, String surface, String material) {
        super(price, length, color);
        this.surface = surface;
        this.material = material;
    }

    public String getSurface() {
        return surface;
    }

    public void setSurface(String surface) {
        this.surface = surface;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        WrappingPaper that = (WrappingPaper) o;

        if (surface != null) {
            if (!surface.equals(that.surface)) return false;
        } else {
            if (that.surface != null) return false;
        }
        if (material != null) return material.equals(that.material);
        return that.material == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (surface != null ? surface.hashCode() : 0);
        result = 31 * result + (material != null ? material.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return String.format("%s - %s" +
                        "Surface: %s | " +
                        "Material: %s",
                getClass().getSimpleName(), super.toString(), surface, material);
    }
}
