public class Main {
    public static void main(String[] args) {
        // Crear una instancia de Coche
        Coche coche = new Coche("Toyota", "Corolla", 2022, 25000.0);
        coche.mostrarInformacion();

        System.out.println("--------------------------");

        // Crear una instancia de CocheElectrico
        CocheElectrico cocheElectrico = new CocheElectrico("Tesla", "Model 3", 2023, 50000.0, 300);
        cocheElectrico.mostrarInformacion();
        cocheElectrico.cargarBateria();

        System.out.println("--------------------------");

        // Crear una instancia de CocheDeCombustible
        CocheDeCombustible cocheDeCombustible = new CocheDeCombustible("Ford", "Mustang", 2022, 45000.0);
        cocheDeCombustible.mostrarInformacion();

        System.out.println("--------------------------");

        // Crear una instancia de CocheHibrido
        CocheHibrido cocheHibrido = new CocheHibrido("Toyota", "Prius", 2023, 35000.0);
        cocheHibrido.mostrarInformacion();
    }
}

