package decorators;

import flowerstore.Flower;
import flowerstore.FlowerType;
import flowerstore.Item;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RibbonDecoratorTest {
    private Flower flower;
    private Item ribbonFlower;

    @BeforeEach
    void setUp() {
        flower = new Flower(FlowerType.CHAMOMILE);
        flower.setPrice(5);
        ribbonFlower = new RibbonDecorator(flower);
    }

    @Test
    void getPrice() {
        assertEquals(flower.getPrice() + 40, ribbonFlower.getPrice());
    }
}