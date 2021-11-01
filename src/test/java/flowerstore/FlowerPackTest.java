package flowerstore;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FlowerPackTest {
    private Flower flower;
    private FlowerPack flowerPack;

    @BeforeEach
    void setUp() {
        flower = new Flower(FlowerType.CHAMOMILE);
        flower.setPrice(30);
        flower.setColor(new int[] {255, 255, 255});
        flower.setSepalLength(5);
        flowerPack = new FlowerPack(flower);
        flowerPack.setAmount(3);
    }

    @Test
    void getFlower() {
        assertEquals(flower, flowerPack.getFlower());
    }

    @Test
    void getAmount() {
        assertEquals(3, flowerPack.getAmount());
    }

    @Test
    void getPrice() {
        assertEquals(90, flowerPack.getPrice());
    }

    @Test
    void getDescription() {
        assertEquals("Flower pack of 3 CHAMOMILE flowers", flowerPack.getDescription());
    }
}
