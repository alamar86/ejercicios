package interfaz;

import objetos.Coche;

import java.util.List;

public interface CocheCRUD {
    void save(Coche coche);

    List<Coche> findAll();

    void delete(Coche coche);

}
