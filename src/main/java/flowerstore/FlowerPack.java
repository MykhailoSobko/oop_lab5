package flowerstore;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class FlowerPack extends Item {
    @Getter @Setter
    private Flower flower;
    @Getter @Setter
    private int amount;

    public FlowerPack(Flower flower) {
        this.flower = flower;
    }

    public double getPrice() {
        return flower.getPrice() * amount;
    }

    @Override
    public String getDescription() {
        return "Flower pack of " + amount + ' ' + flower.getFlowerType() + " flowers";
    }
}
