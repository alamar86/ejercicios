package entities;

// Clase entities.CocheHibrido que extiende la funcionalidad de la clase entities.Coche sin modificarla
public class CocheHibridoImpl extends CocheImpl implements CocheHibrido{
    public CocheHibridoImpl(String marca, String modelo, int año, double precio) {
        super(marca, modelo, año, precio);
    }

    // Método específico para coche híbrido
    @Override
    public void estaCargandoBateria(Boolean check) {
        if (check) {
            System.out.println("Esta cargando la bateria...");
        } else {
            System.out.println("La bateria no necesita cargar");
        }
    }
}