import org.apache.commons.cli.CommandLine;

public class SmartDevice {
    String brand;
    private String model;
    private double price;
    private boolean isWaterproof;

    public SmartDevice() {
    }

    public SmartDevice(String brand) {
        this.brand = brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public SmartDevice setModel(String model) {
        this.model = model;
        return this;
    }

    public SmartDevice setPrice(double price) {
        this.price = price;
        return this;
    }

    public SmartDevice setIsWaterproof(boolean isWaterproof) {
        this.isWaterproof = isWaterproof;
        return this;
    }

    public SmartDevice build() {
        return this;
    }

    public String toString() {
        return String.format("Brand: %s, Model: %s, Price: %.2f, Waterproof: %b", brand, model, price, isWaterproof);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public boolean getIsWaterproof() {
        return isWaterproof;
    }

    public CommandLine creaCmd() {return null;}
}
