package flowerstore;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class FlowerPack {
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
}
