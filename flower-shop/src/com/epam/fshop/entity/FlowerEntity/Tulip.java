package com.epam.fshop.entity.FlowerEntity;

public class Tulip extends Flower {
    private String hybridType;
    private String fringe;

    public Tulip() {
    }

    public Tulip(double price, int freshness, int length, String color, String variety, String hybridType, String fringe) {
        super(price, freshness, length, color, variety);
        this.hybridType = hybridType;
        this.fringe = fringe;
    }

    public String getHybridType() {
        return hybridType;
    }

    public void setHybridType(String hybridType) {
        this.hybridType = hybridType;
    }

    public String getFringe() {
        return fringe;
    }

    public void setFringe(String fringe) {
        this.fringe = fringe;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Tulip tulip = (Tulip) o;

        if (hybridType != null) {
            if (!hybridType.equals(tulip.hybridType)) return false;
        } else {
            if (tulip.hybridType != null) return false;
        }
        if (fringe != null) return fringe.equals(tulip.fringe);
        return tulip.fringe == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (hybridType != null ? hybridType.hashCode() : 0);
        result = 31 * result + (fringe != null ? fringe.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return String.format("%-5s - %s" +
                        "Hybrid : %-8s | " +
                        "Fringe: %-6s",
                getClass().getSimpleName(), super.toString(), hybridType, fringe);
    }

}
