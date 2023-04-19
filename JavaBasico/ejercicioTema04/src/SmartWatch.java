public class SmartWatch extends SmartDevice {
    private boolean hasHeartRateMonitor;
    private boolean hasSleepTracker;

    public SmartWatch() {
    }

    public SmartWatch(String brand, String model, double price, boolean isWaterproof, boolean hasHeartRateMonitor, boolean hasSleepTracker) {
        super(brand, model, price, isWaterproof);
        this.hasHeartRateMonitor = hasHeartRateMonitor;
        this.hasSleepTracker = hasSleepTracker;
    }

    // Getters y Setters

    public boolean getHasHeartRateMonitor() {
        return hasHeartRateMonitor;
    }

    public void setHasHeartRateMonitor(boolean hasHeartRateMonitor) {
        this.hasHeartRateMonitor = hasHeartRateMonitor;
    }

    public boolean getHasSleepTracker() {
        return hasSleepTracker;
    }

    public void setHasSleepTracker(boolean hasSleepTracker) {
        this.hasSleepTracker = hasSleepTracker;
    }
}
