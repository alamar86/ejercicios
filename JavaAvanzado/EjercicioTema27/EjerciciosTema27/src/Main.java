import entities.*;
import repositories.MySQLDatabaseConnection;

public class Main {
    public static void main(String[] args) {
        // Crear una instancia de entities.Coche
        CocheImpl coche = new CocheImpl("Toyota", "Corolla", 2022, 25000.0);
        coche.mostrarInformacion();

        System.out.println("--------------------------");

        // Crear una instancia de entities.CocheElectrico
        CocheElectricoImpl cocheElectrico = new CocheElectricoImpl("Tesla", "Model 3", 2023, 50000.0, 300);
        cocheElectrico.mostrarInformacion();
        cocheElectrico.cargarBateria();

        System.out.println("--------------------------");

        // Crear una instancia de entities.CocheDeCombustible
        CocheDeCombustibleImpl cocheDeCombustible = new CocheDeCombustibleImpl("Ford", "Mustang", 2022, 45000.0);
        cocheDeCombustible.mostrarInformacion();

        System.out.println("--------------------------");

        // Crear una instancia de entities.CocheHibrido
        CocheHibridoImpl cocheHibrido = new CocheHibridoImpl("Toyota", "Prius", 2023, 35000.0);
        cocheHibrido.mostrarInformacion();

        System.out.println("------------------------");
        System.out.println("Comprovando conexion a MySQL:");
        MySQLDatabaseConnection mySQL = new MySQLDatabaseConnection();
        mySQL.connect();
        mySQL.disconnect();
    }
}

