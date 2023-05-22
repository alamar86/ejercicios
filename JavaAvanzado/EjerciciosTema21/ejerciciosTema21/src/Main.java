import Parser.ParserApacheCLI;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.ParseException;

public class Main {
    // Refactorizanción utilizando también el patrón creacional builder
    public static void main(String[] args) throws ParseException {
        ParserApacheCLI cli = new ParserApacheCLI();
        CommandLine cmd;


        switch (args[0]) {
            case "Phone" :
                cli.addOptions(SmartPhone.creaOpcionesParse());
                cmd = cli.createCmd(args);

                SmartPhone phone2 = (SmartPhone) new SmartPhone(cmd.getOptionValue("brand"))
                        .setOs(cmd.getOptionValue("os"))
                        .setStorage(Integer.parseInt(cmd.getOptionValue("storage")))
                        .setModel(cmd.getOptionValue("model"))
                        .setPrice(Double.parseDouble(cmd.getOptionValue("price")))
                        .setIsWaterproof(cmd.hasOption("isWaterproof"))
                        .build();

                System.out.println(phone2.getClass() + phone2.toString());
                break;

            case "SmartWatch":
                SmartWatch watch = (SmartWatch) new SmartWatch("Samsung")
                        .setHasHeartRateMonitor(true)
                        .setHasSleepTracker(true)
                        .setModel("Watch4")
                        .setPrice(299.99)
                        .setIsWaterproof(true)
                        .build();

                System.out.println(watch.getClass() + watch.toString());
                break;



        }
    }
}
