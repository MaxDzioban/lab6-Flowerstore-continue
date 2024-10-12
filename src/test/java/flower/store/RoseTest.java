package flower.store;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RoseTest {
    private Rose rose;

    @BeforeEach
    public void init() {
        rose = new Rose();
    }

    @Test
    public void testPrice() {
        rose.setPrice(50);
        Assertions.assertEquals(50, rose.getPrice());
    }

    @Test
    public void testColor() {
        rose.setColor(FlowerColor.BLUE);
        Assertions.assertEquals("#0000FF", rose.getColor());
    }
}
