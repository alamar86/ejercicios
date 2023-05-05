package Parser;

import Parser.Opcion;

import java.util.ArrayList;

/**
 * Clase para almacenar en una lista las opciones de parse y poder gestionarlas
 */
public class Opciones {
    ArrayList<Opcion> opciones = new ArrayList<Opcion>();

    public Opciones() {}

    public ArrayList<Opcion> getOpciones() {
        return opciones;
    }

    public void añadirOpcion(Opcion opcion) {
        this.opciones.add(opcion);
    }
}
