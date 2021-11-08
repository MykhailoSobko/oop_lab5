package connection;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConnectionTest {
    private Connection connection1;
    private Connection connection2;

    @Test
    void getConnection() {
        connection1 = Connection.getConnection();
        connection2 = Connection.getConnection();
        assertEquals(connection1, connection2);
    }

    @Test
    void thisConnection() {
        assertNull(Connection.thisConnection);
        connection1 = Connection.getConnection();
        assertNotNull(Connection.thisConnection);
    }
}