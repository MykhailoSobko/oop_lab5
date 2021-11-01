package delivery;

import flowerstore.Flower;
import flowerstore.FlowerType;
import flowerstore.Item;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class DHLDeliveryStrategyTest {
    private Flower flower;
    private ArrayList<Item> itemList;
    private DHLDeliveryStrategy dhlDeliveryStrategy;

    @BeforeEach
    void setUp() {
        flower = new Flower(FlowerType.CHAMOMILE);
        itemList = new ArrayList<>();
        itemList.add(flower);
        dhlDeliveryStrategy = new DHLDeliveryStrategy();
    }

    @Test
    void deliver() {
        dhlDeliveryStrategy.deliver(itemList);
    }
}