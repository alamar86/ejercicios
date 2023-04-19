public class SmartDevice {
    private String brand;
    private String model;
    private double price;
    private boolean isWaterproof;

    public SmartDevice() {
    }

    public SmartDevice(String brand, String model, double price, boolean isWaterproof) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.isWaterproof = isWaterproof;
    }

    // Getters y Setters

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean getIsWaterproof() {
        return isWaterproof;
    }

    public void setIsWaterproof(boolean isWaterproof) {
        this.isWaterproof = isWaterproof;
    }
}
