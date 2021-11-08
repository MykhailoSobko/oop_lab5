package user;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReceiverTest {
    private Receiver receiver1;
    private Receiver receiver2;

    @BeforeEach
    void setUp() {
        Receiver.lastReceiverId = 0;
        receiver1 = new Receiver();
        receiver2 = new Receiver();
    }

    @Test
    void id() {
        assertEquals(1, receiver1.getId());
        assertEquals(2, receiver2.getId());
    }

    @Test
    void update() {
        receiver1.update("success");
    }
}