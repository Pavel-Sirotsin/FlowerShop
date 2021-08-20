package com.epam.fshop.entity.FlowerEntity;

public class Pion extends Flower {
    private String bush;
    private String fragrance;

    public Pion() {
    }

    public Pion(double price, int freshness, int length, String color, String variety, String bush, String fragrance) {
        super(price, freshness, length, color, variety);
        this.bush = bush;
        this.fragrance = fragrance;
    }

    public String getBush() {
        return bush;
    }

    public void setBush(String bush) {
        this.bush = bush;
    }

    public String getFragrance() {
        return fragrance;
    }

    public void setFragrance(String fragrance) {
        this.fragrance = fragrance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Pion pion = (Pion) o;

        if (bush != null) {
            if (!bush.equals(pion.bush)) return false;
        } else {
            if (pion.bush != null) return false;
        }
        if (fragrance != null) return fragrance.equals(pion.fragrance);
        return pion.fragrance == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (bush != null ? bush.hashCode() : 0);
        result = 31 * result + (fragrance != null ? fragrance.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return String.format("%-5s - %s" +
                        "Bush: %-11s | " +
                        "Fragrance: %-3s",
                getClass().getSimpleName(), super.toString(), bush, fragrance);
    }


}
