package flowerstore;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class FlowerTest {
    private Flower flower;

    @BeforeEach
    void setUp() {
        flower = new Flower(FlowerType.CHAMOMILE);
        flower.setPrice(30);
        flower.setColor(new int[] {255, 255, 255});
        flower.setSepalLength(5);
    }

    @Test
    void getPrice() {
        assertEquals(30, flower.getPrice());
    }

    @Test
    void getFlowerType() {
        assertEquals(FlowerType.CHAMOMILE, flower.getFlowerType());
    }

    @Test
    void getColor() {
        assertArrayEquals(new int[] {255, 255, 255}, flower.getColor());
    }

    @Test
    void getSepalLength() {
        assertEquals(5, flower.getSepalLength());
    }

    @Test
    void getDescription() {
        assertEquals("Flower of type CHAMOMILE", flower.getDescription());
    }
}