package decorators;

import flowerstore.Flower;
import flowerstore.FlowerType;
import flowerstore.Item;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BasketDecoratorTest {
    private Flower flower;
    private Item basketFlower;

    @BeforeEach
    void setUp() {
        flower = new Flower(FlowerType.CHAMOMILE);
        flower.setPrice(5);
        basketFlower = new BasketDecorator(flower);
    }

    @Test
    void getPrice() {
        assertEquals(flower.getPrice() + 4, basketFlower.getPrice());
    }
}