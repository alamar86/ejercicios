public class SmartWatch extends SmartDevice {
    private boolean hasHeartRateMonitor;
    private boolean hasSleepTracker;

    public SmartWatch(String brand) {
        super(brand);
    }

    public SmartWatch setHasHeartRateMonitor(boolean hasHeartRateMonitor) {
        this.hasHeartRateMonitor = hasHeartRateMonitor;
        return this;
    }

    public SmartWatch setHasSleepTracker(boolean hasSleepTracker) {
        this.hasSleepTracker = hasSleepTracker;
        return this;
    }

    public String toString() {
        return super.toString() + String.format(", hasHeartRateMonitor=%s, hasSleepTracker=%s",
                hasHeartRateMonitor, hasSleepTracker);
    }


    public boolean getHasHeartRateMonitor() {
        return hasHeartRateMonitor;
    }

    public boolean getHasSleepTracker() {
        return hasSleepTracker;
    }
}
