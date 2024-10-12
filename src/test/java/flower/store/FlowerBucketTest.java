package flower.store;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FlowerBucketTest {
    private FlowerBucket flowerBucket;
    private FlowerPack flowerPack;

    @BeforeEach
    public void init() {
        flowerBucket = new FlowerBucket();
        flowerPack = new FlowerPack(new Rose(), 10);
    }

    @Test
    public void testAddFlowerPack() {
        flowerBucket.add(flowerPack);
        Assertions.assertEquals(1, flowerBucket.getAllFlowerPacks().size());
        Assertions.assertEquals(flowerPack, flowerBucket.getAllFlowerPacks().get(0));
    }

}
