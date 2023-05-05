import Parser.Opcion;
import Parser.Opciones;
import org.apache.commons.cli.CommandLine;

import java.util.ArrayList;

public class SmartPhone extends SmartDevice {
    private String os;
    private int storage;

    public SmartPhone() {}
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

    public static ArrayList<Opcion> creaOpcionesParse() {
        Opciones opciones = new Opciones();
        opciones.añadirOpcion(new Opcion("b","brand", true, "Marca del telefono"));
        opciones.añadirOpcion(new Opcion("o", "os" , true, "Sistema operativo"));
        opciones.añadirOpcion(new Opcion("s", "storage" , true, "Capacidad del telefono"));
        opciones.añadirOpcion(new Opcion("m", "model" , true, "Modelo del dispositivo"));
        opciones.añadirOpcion(new Opcion("p", "price" , true, "Precio del dispositivo"));
        opciones.añadirOpcion(new Opcion("i", "isWaterproof" , false, "Es sumergible"));

        return opciones.getOpciones();
    }
}
