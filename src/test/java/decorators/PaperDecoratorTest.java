package decorators;

import flowerstore.Flower;
import flowerstore.FlowerType;
import flowerstore.Item;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaperDecoratorTest {
    private Flower flower;
    private Item paperFlower;

    @BeforeEach
    void setUp() {
        flower = new Flower(FlowerType.CHAMOMILE);
        flower.setPrice(5);
        paperFlower = new PaperDecorator(flower);
    }

    @Test
    void getPrice() {
        assertEquals(flower.getPrice() + 13, paperFlower.getPrice());
    }
}