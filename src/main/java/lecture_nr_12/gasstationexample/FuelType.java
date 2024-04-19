package lecture_nr_12.gasstationexample;

public enum FuelType {

    PETROL_95(27.5f),
    PETROL_98(28.9f),
    PETROL_100(29f),
    DIESEL_51(23.45f),
    DIESEL_55(25.2f),
    METAN(16.95f),
    PROPANE(26.3f),
    ELECTRIC(4f);

    public Float fuelPrice;

    FuelType(Float fuelPrice) {
        this.fuelPrice = fuelPrice;
    }

    public void setFuelPrice(Float fuelPrice) {
        this.fuelPrice = fuelPrice;
    }

    public boolean isLiquidFuel(){

        return this != ELECTRIC && this != PROPANE;
    }
}
