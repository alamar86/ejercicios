public class Main {
    public static void main(String[] args) {
        SmartPhone phone = new SmartPhone("Apple", "iPhone 13", 999.99, true, "iOS", 128);
        SmartWatch watch = new SmartWatch("Samsung", "Galaxy Watch 4", 299.99, true, true, true);

        System.out.println("SmartPhone: " + phone.getBrand() + " " + phone.getModel() + ", " + phone.getPrice()
                + "€, " + phone.getOs() + ", " + phone.getStorage() + "GB storage, waterproof: " + phone.getIsWaterproof());
        System.out.println("SmartWatch: " + watch.getBrand() + " " + watch.getModel() + ", " + watch.getPrice() + "€, "
                + "waterproof: " + watch.getIsWaterproof() + ", " + " has heart rate monitoring: " + watch.getHasHeartRateMonitor()
                + ", " + " has sleep tracker: " + watch.getHasSleepTracker());
    }
}
