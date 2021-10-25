package flowerstore;

import lombok.Getter;

import java.util.ArrayList;

public class FlowerBucket {
    @Getter
    private ArrayList<FlowerPack> flowerPacks = new ArrayList<>();

    public void addFlowerPack(FlowerPack flowerPack) {
        flowerPacks.add(flowerPack);
    }

    public double getPrice() {
        double price = 0;
        for (FlowerPack flowerPack: flowerPacks) {
            price += flowerPack.getPrice();
        }
        return price;
    }
}