package flowerstore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Arrays;

@ToString
public class Flower extends Item {
    @Getter @Setter
    private double sepalLength;
    @Getter
    private int[] color = new int[3];
    @Getter
    private FlowerType flowerType;
    @Setter @Getter
    private double price;

    public Flower(FlowerType flowerType) {
        this.flowerType = flowerType;
    }

    public void setColor(int[] color) {
        this.color = Arrays.copyOf(color, color.length);
    }

    public String getDescription() {
        return "Flower of type " + flowerType;
    }
}
