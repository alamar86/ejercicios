package Singleton;

public class ConnectorSQL {
    private static ConnectorSQL connectorSQL;
    private boolean isConnected = false;
    private ConnectorSQL(){}

    public static ConnectorSQL getInstance(){
        if (connectorSQL == null){
            connectorSQL = new ConnectorSQL();
        }
        return connectorSQL;
    }

    public void connected(){
        if (!isConnected){
            isConnected = true;
            System.out.println("Connected");
        } else {
            System.out.println("Already connected");
        }
    }

    public void disconnected(){
        isConnected = false;
        System.out.println("Disconnected");
    }

    public void connectionStatus(){
        if (isConnected){
            System.out.println("SQL is connected");
        } else {
            System.out.println("SQL is not connected");
        }
    }
}
