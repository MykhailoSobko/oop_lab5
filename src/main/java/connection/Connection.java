package connection;

// Modify to create connection on first call
public class Connection {
    public static Connection thisConnection = null;

    private Connection() {}

    public static Connection getConnection() {
        if (Connection.thisConnection == null) {
            Connection.thisConnection = new Connection();
        }
        return Connection.thisConnection;
    }
}
