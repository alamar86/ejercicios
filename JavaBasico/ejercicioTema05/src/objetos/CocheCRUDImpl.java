package objetos;

import interfaz.CocheCRUD;

import java.util.List;

public class CocheCRUDImpl implements CocheCRUD {
    @Override
    public void save(Coche coche) {
        System.out.println("Coche guardado con save()");
    }

    @Override
    public List<Coche> findAll() {
        System.out.println("Buscando lista de coches con findAll()");
        return null;
    }

    @Override
    public void delete(Coche coche) {
        System.out.println("Coche borrado con delete()");
    }
}
