package lecture_nr_12.gasstationexample;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        GasStation bemol1 = new GasStation("str. Puskin 1",
                887182,
                new ArrayList<>(Arrays.asList(FuelType.PETROL_95, FuelType.PETROL_98, FuelType.PETROL_100
                , FuelType.DIESEL_51)));

        GasStation bemol2 = new GasStation("str. Zaikin 12", 123123, new ArrayList<>(Arrays.asList(FuelType.PETROL_95, FuelType.DIESEL_51))
        );

        System.out.println(bemol1.fuelTypes);

        System.out.println(FuelType.valueOf("PETROL_95"));

        FuelType randomFuelType = FuelType.valueOf("PETROL_95");

        FuelType[] allFuelTypes = FuelType.values();

        System.out.println("-------------- Iterating through the array of fuel types:");
        for(int index = 0; index != allFuelTypes.length; index++){

            System.out.println(allFuelTypes[index]);
        }

        System.out.println("---------------- WORKING WITH OBJECTS");

        bemol1.printFuelTypes();
        bemol2.printGasStationInformation();

        GasStation[] bemolGasStations = new GasStation[] {
                bemol1, bemol2
        };

        Bemol bemol = new Bemol(Arrays.asList(bemol1, bemol2));

        //Need to print fuel types of every gas station of Bemol

        bemol.activeGasStations.stream()
                .forEach((e) -> {
                    e.printFuelTypes();
                });

        //Need to add new fuel type to every gas station
        System.out.println("----------- ADDING NEW FUEL");
        bemol.activeGasStations.stream()
                .forEach((e) -> {
                    e.addNewFuelType(FuelType.ELECTRIC);
                });

        bemol.printAllGasStationsFuels();

        System.out.println("----------------- PRINTING FUEL PRICES");
        bemol1.printFuelTypesAndTheirPrices();

        System.out.println("--------------- CHANGING FUEL TYPE PRICE");
        FuelType electricVariable = FuelType.ELECTRIC;
        System.out.println(electricVariable.fuelPrice);

        electricVariable.setFuelPrice(8f);
        System.out.println(electricVariable.fuelPrice);

        bemol1.printFuelTypesAndTheirPrices();

        //Checking if the fuel type is liquid

        FuelType fuelType1 = FuelType.DIESEL_51;
        FuelType fuelType2 = FuelType.ELECTRIC;

        System.out.println(fuelType1.isLiquidFuel());
        System.out.println(fuelType2.isLiquidFuel());

        System.out.println(FuelType.METAN.isLiquidFuel());
    }
}
