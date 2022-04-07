package za.ac.cput.domain;

/*
    Upholstery.java
    Entity for the Upholstery
    Wajedien Samuels (216287820)
    10 April 2022
 */

public class Upholstery {

    private int upholsteryId;
    private String upholstItem;
    private String upholstMaterial;
    private String upholstColour;

    private Upholstery(Builder builder) {
        this.upholsteryId = builder.upholsteryId;
        this.upholstItem = builder.upholstItem;
        this.upholstMaterial = builder.upholstMaterial;
        this.upholstColour = builder.upholstColour;

    }

    public int getUpholsteryId() {
        return upholsteryId;
    }

    public void setUpholsteryId(int upholsteryId) {
        this.upholsteryId = upholsteryId;
    }

    public String getUpholstItem() {
        return upholstItem;
    }

    public void setUpholstItem(String upholstItem) {
        this.upholstItem = upholstItem;
    }

    public String getUpholstMaterial() {
        return upholstMaterial;
    }

    public void setUpholstMaterial(String upholstMaterial) {
        this.upholstMaterial = upholstMaterial;
    }

    public String getUpholstColour() {
        return upholstColour;
    }

    public void setUpholstColour(String upholstColour) {
        this.upholstColour = upholstColour;
    }

    @Override
    public String toString() {
        return "Upholstery{" +
                "upholsteryId=" + upholsteryId +
                ", upholstItem='" + upholstItem + '\'' +
                ", upholstMaterial='" + upholstMaterial + '\'' +
                ", upholstColour='" + upholstColour + '\'' +
                '}';
    }

    public static class Builder {

        private int upholsteryId;
        private String upholstItem;
        private String upholstMaterial;
        private String upholstColour;

        public Builder setUpholsteryId(int upholsteryId) {
            this.upholsteryId = upholsteryId;
            return this;
        }

        public Builder setUpholstItem(String upholstItem) {
            this.upholstItem = upholstItem;
            return this;
        }

        public Builder setUpholstMaterial(String upholstMaterial) {
            this.upholstMaterial = upholstMaterial;
            return this;
        }

        public Builder setUpholstColour(String upholstColour) {
            this.upholstColour = upholstColour;
            return this;
        }

        public Builder copy(Upholstery upholstery) {
            this.upholsteryId = upholstery.upholsteryId;
            this.upholstItem = upholstery.upholstItem;
            this.upholstMaterial = upholstery.upholstMaterial;
            this.upholstColour = upholstery.upholstColour;
            return this;
        }

        public Upholstery build() {return new Upholstery(this);}
    }
}
