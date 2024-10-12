package flower.store;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Random;

public class ChamomileTest {
    private static final Random RANDOM_GENERATOR = new Random();
    private static final int MAX_PRICE = 300;
    private Chamomile chamomile;

    @BeforeEach
    public void init() {
        chamomile = new Chamomile();
    }

    @Test
    public void testPrice() {
        int priceNew = RANDOM_GENERATOR.nextInt(MAX_PRICE);
        chamomile.setPrice(priceNew);
        Assertions.assertEquals(priceNew, chamomile.getPrice());
    }

    @Test
    public void testColor() {
        chamomile.setColor(FlowerColor.RED);
        Assertions.assertEquals("#FF0000", chamomile.getColor());
    }
}