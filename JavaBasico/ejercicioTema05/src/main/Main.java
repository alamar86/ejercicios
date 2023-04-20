package main;

import interfaz.CocheCRUD;
import objetos.Coche;
import objetos.CocheCRUDImpl;

public class Main {

    public static void main(String[] args) {
        CocheCRUD cocheCRUD = new CocheCRUDImpl();
        cocheCRUD.save(new Coche());
        cocheCRUD.findAll();
        cocheCRUD.delete(new Coche());

    }
}
