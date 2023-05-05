package Parser;

public class Opcion {
    private String option;
    private String longOption;
    private boolean hasArg;
    private String description;

    private Opcion() {}

    public Opcion(String option, String longOption, boolean hasArg, String description) {
        this.option = option;
        this.longOption = longOption;
        this.hasArg = hasArg;
        this.description = description;
    }

    public String getLongOption() {
        return longOption;
    }
    public String getOption() {
        return option;
    }

    public boolean getHasArg() {
        return hasArg;
    }

    public String getDescription() {
        return description;
    }
}
