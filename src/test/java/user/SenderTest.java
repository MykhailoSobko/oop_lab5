package user;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SenderTest {
    private Sender sender1;
    private Sender sender2;

    @BeforeEach
    void setUp() {
        Sender.lastSenderId = 0;
        sender1 = new Sender();
        sender2 = new Sender();
    }

    @Test
    void id() {
        assertEquals(1, sender1.getId());
        assertEquals(2, sender2.getId());
    }

    @Test
    void update() {
        sender1.update("success");
    }
}