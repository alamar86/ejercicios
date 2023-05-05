package Parser;

import java.util.ArrayList;
import java.util.HashMap;
import org.apache.commons.cli.*;

/**
 * Esta clase utiliza la libreria de Apache Commons ClI para parsear un array.
 *
 * @see <a href="https://commons.apache.org/proper/commons-cli/">...</a>
 */

public class ParserApacheCLI {
    HashMap<String,String> map = new HashMap<String,String>();
    CommandLineParser parser = new DefaultParser();
    Options options = new Options();
    CommandLine cmd;

    /**
     * Añade las opciones con el argumento y la opcion
     * @param opciones -> ArrayLis de opciones
     */
    public void addOptions(ArrayList<Opcion> opciones) {
        for (Opcion opcion : opciones) {
            options.addOption(opcion.getOption(),opcion.getLongOption(), opcion.getHasArg(), opcion.getDescription());
        }
    }

    /**
     * Crea y devuelve el CommandLine con las opciones y los argumentos
     * @param args -> Lista de entrada de argumentos
     * @return -> CommandLine con las opciones y los argumentos
     * @throws ParseException
     */
    public CommandLine createCmd(String[] args) throws ParseException {
        return cmd = parser.parse(options, args);
    }

}
