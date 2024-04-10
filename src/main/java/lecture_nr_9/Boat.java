package lecture_nr_9;

public class Boat extends Vehicle implements Swimmable{

    private int minimumCrewSize;
    private String mainSatNavBrand;

    public Boat(String manufacturer, String model, Long VIN, int minimumCrewSize, String mainSatNavBrand) {
        super(manufacturer, model, VIN);
        this.minimumCrewSize = minimumCrewSize;
        this.mainSatNavBrand = mainSatNavBrand;
    }

    public int getMinimumCrewSize() {
        return minimumCrewSize;
    }

    public void setMinimumCrewSize(int minimumCrewSize) {
        this.minimumCrewSize = minimumCrewSize;
    }

    public String getMainSatNavBrand() {
        return mainSatNavBrand;
    }

    public void setMainSatNavBrand(String mainSatNavBrand) {
        this.mainSatNavBrand = mainSatNavBrand;
    }


    @Override
    public void swim() {

        System.out.println("The boat is swimming...");
    }

    @Override
    public void dock() {

        System.out.println("The boat is now docked");
    }
}
