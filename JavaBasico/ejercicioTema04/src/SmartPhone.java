public class SmartPhone extends SmartDevice {
    private String os;
    private int storage;

    public SmartPhone() {
    }

    public SmartPhone(String brand, String model, double price, boolean isWaterproof, String os, int storage) {
        super(brand, model, price, isWaterproof);
        this.os = os;
        this.storage = storage;
    }

    // Getters y Setters

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }
}
