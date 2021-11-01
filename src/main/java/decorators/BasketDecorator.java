package decorators;

import flowerstore.Item;

public class BasketDecorator extends ItemDecorator {
    private Item item;
    public BasketDecorator(Item item) {
        super(item);
        this.item = item;
    }

    @Override
    public double getPrice() {
        return 4 + item.getPrice();
    }
}
