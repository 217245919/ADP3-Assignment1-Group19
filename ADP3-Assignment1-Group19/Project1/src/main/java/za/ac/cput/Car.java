package za.ac.cput;

/**
 * Lyle Haines - 217245919
 * Group 19
 *Section B-4: Small program
 */
public class Car
{
    private String Model;
    private double yearModel;
    private double topSpeed;

    public Car(String model, double yearModel, double topSpeed) {
        Model = model;
        this.yearModel = yearModel;
        this.topSpeed = topSpeed;
    }

    public Car() {
        this.yearModel = yearModel;
        this.topSpeed = topSpeed;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public double getYearModel() {
        return yearModel;
    }

    public void setYearModel(double yearModel) {
        this.yearModel = yearModel;
    }

    public double getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(double topSpeed) {
        this.topSpeed = topSpeed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "Model='" + Model + '\'' +
                ", yearModel=" + yearModel +
                ", topSpeed=" + topSpeed +
                '}';
    }
}
