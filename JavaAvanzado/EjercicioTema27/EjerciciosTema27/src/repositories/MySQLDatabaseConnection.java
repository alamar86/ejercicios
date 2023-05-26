package repositories;

public class MySQLDatabaseConnection implements DatabaseConnection {
    public void connect() {
        System.out.println("Conexion a MySQL con exito");
    }

    public void disconnect() {
        System.out.println("Desconexion a MySQL con exito");
    }
}
