package repositories;

public class PostgreSQLDatabaseConnection implements DatabaseConnection{
    @Override
    public void connect() {
        System.out.println("Conexión a PostgreSQL con éxito");
    }

    @Override
    public void disconnect() {
        System.out.println("Desconexión a PostgreSQL con éxito");
    }
}
