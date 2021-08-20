package com.epam.fshop.entity.FlowerEntity;

public class Rose extends Flower {
    private String thornType;
    private String habitat;

    public Rose() {
    }

    public Rose(double price, int freshness, int length, String color, String variety, String thornType, String habitat) {
        super(price, freshness, length, color, variety);
        this.thornType = thornType;
        this.habitat = habitat;
    }

    public String getThornType() {
        return thornType;
    }

    public void setThornType(String thornType) {
        this.thornType = thornType;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Rose rose = (Rose) o;

        if (thornType != null) {
            if (!thornType.equals(rose.thornType)) return false;
        } else {
            if (rose.thornType != null) return false;
        }
        if (habitat != null) return habitat.equals(rose.habitat);
        return rose.habitat == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (thornType != null ? thornType.hashCode() : 0);
        result = 31 * result + (habitat != null ? habitat.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return String.format("%-5s - %s" +
                        "Thorn: %-10s | " +
                        "Habitat: %-6s",
                getClass().getSimpleName(), super.toString(), thornType, habitat);
    }


}
