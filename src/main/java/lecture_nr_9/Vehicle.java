package lecture_nr_9;

public abstract class Vehicle {

    private String manufacturer;
    private String model;
    private Long VIN;

    public Vehicle(String manufacturer, String model, Long VIN) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.VIN = VIN;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Long getVIN() {
        return VIN;
    }

    public void setVIN(Long VIN) {
        this.VIN = VIN;
    }
}
