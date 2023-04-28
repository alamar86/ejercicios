package Singleton;

public class Main {
    public static void main(String[] args) {
        ConnectorSQL singletonConnector = ConnectorSQL.getInstance();
        ConnectorSQL singletonConnector2 = ConnectorSQL.getInstance();
        // Conectamos a SQL desde la primera instancia
        singletonConnector.connected();
        // Al conectar desde la segunda instancia nos dice que ya esta conectado
        singletonConnector2.connected();
        // Desconectamos desde la segunda instancia
        singletonConnector2.disconnected();
        // Comprobamos el estado de la conexion desde la primera instancia
        singletonConnector.connectionStatus();
    }
}
