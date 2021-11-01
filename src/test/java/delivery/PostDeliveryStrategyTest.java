package delivery;

import flowerstore.Flower;
import flowerstore.FlowerType;
import flowerstore.Item;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class PostDeliveryStrategyTest {
    private Flower flower;
    private ArrayList<Item> itemList;
    private PostDeliveryStrategy postDeliveryStrategy;

    @BeforeEach
    void setUp() {
        flower = new Flower(FlowerType.CHAMOMILE);
        itemList = new ArrayList<>();
        itemList.add(flower);
        postDeliveryStrategy = new PostDeliveryStrategy();
    }

    @Test
    void deliver() {
        postDeliveryStrategy.deliver(itemList);
    }
}