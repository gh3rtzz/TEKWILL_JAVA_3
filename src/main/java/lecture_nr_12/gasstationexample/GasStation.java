package lecture_nr_12.gasstationexample;

import java.util.List;

public class GasStation {

    public String address;
    public int id;
    public List<FuelType> fuelTypes;

    public GasStation(String address, int id, List<FuelType> fuelTypes) {
        this.address = address;
        this.id = id;
        this.fuelTypes = fuelTypes;
    }

    public void printFuelTypes(){
        for (FuelType element :
                fuelTypes) {
            System.out.println(element);
        }
    }

    public void printGasStationInformation(){

        System.out.println("Gas Station Number: " + id);
        System.out.println("Gas Station Address: " + address);
    }

    public void addNewFuelType(FuelType fuelType){

        fuelTypes.add(fuelType);
    }

    public void printFuelTypesAndTheirPrices(){

        fuelTypes.stream()
                .forEach(e -> {
                    System.out.println("Fuel type: " + e + " Price: " + e.fuelPrice);
                });
    }
}
