package flowerstore;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FlowerBucketTest {
    private FlowerBucket flowerBucket;
    private FlowerPack flowerPack;
    private Flower flower;

    @BeforeEach
    void setUp() {
        flower = new Flower(FlowerType.CHAMOMILE);
        flower.setPrice(30);
        flowerPack = new FlowerPack(flower);
        flowerPack.setAmount(3);
        flowerBucket = new FlowerBucket();
        flowerBucket.addFlowerPack(flowerPack);
        flowerBucket.addFlowerPack(flowerPack);
    }

    @Test
    void getFlowerPacks() {
        assertEquals(2, flowerBucket.getFlowerPacks().size());
    }

    @Test
    void addFlowerPack() {
        flowerBucket.addFlowerPack(flowerPack);
        assertEquals(3, flowerBucket.getFlowerPacks().size());
    }

    @Test
    void getPrice() {
        assertEquals(180, flowerBucket.getPrice());
    }

    @Test
    void getDescription() {
        assertEquals("Flower bucket of 3 flower packs", flowerBucket.getDescription());
    }
}
