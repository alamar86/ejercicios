public class SmartPhone extends SmartDevice {
    private String os;
    private int storage;

    public SmartPhone(String brand) {
        super(brand);
    }

    public SmartPhone setOs(String os) {
        this.os = os;
        return this;
    }

    public SmartPhone setStorage(int storage) {
        this.storage = storage;
        return this;
    }

    public SmartPhone build() {
        return this;
    }

    public String toString() {
        return super.toString() + String.format(", os: %s, storage: %d", os, storage);
    }

    public String getOs() {
        return os;
    }

    public int getStorage() {
        return storage;
    }
}
