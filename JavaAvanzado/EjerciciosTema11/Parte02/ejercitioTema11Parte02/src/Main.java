public class Main {
    // Refactorizanción utilizando también el patrón creacional builder
    public static void main(String[] args) {
        SmartPhone phone = (SmartPhone) new SmartPhone("Apple")
                .setOs("IOS 16.4")
                .setStorage(64)
                .setModel("iPhone 6s")
                .setPrice(199.99)
                .setIsWaterproof(true)
                .build();

        SmartWatch watch = (SmartWatch) new SmartWatch("Samsung")
                .setHasHeartRateMonitor(true)
                .setHasSleepTracker(true)
                .setModel("Watch4")
                .setPrice(299.99)
                .setIsWaterproof(true)
                .build();

        System.out.println(phone.getClass() + phone.toString());
        System.out.println(watch.getClass() + watch.toString());
    }
}
