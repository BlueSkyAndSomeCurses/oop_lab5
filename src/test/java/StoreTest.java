import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;

import org.junit.jupiter.api.Assertions;
import ua.ucu.edu.flowers.*;
import ua.ucu.edu.flowers.Store;

public class StoreTest {
    public Flower flower1;
    public Flower flower2;
    public Flower flower3;
    public FlowerPack flowerPack1;
    public FlowerPack flowerPack2;
    public FlowerPack flowerPack3;
    public Store store;

    @BeforeEach
    public void init() {
        flower1 = new Flower(FlowerType.CHAMOMILE, 10, FlowerColor.RED, 20);
        flower2 = new Flower(FlowerType.ROSE, 20, FlowerColor.BLUE, 40);
        flower3 = new Flower(FlowerType.LILYOFTHEVALLEY, 250, FlowerColor.WHITE, 490);

        flowerPack1 = new FlowerPack(flower1, 3);
        flowerPack2 = new FlowerPack(flower2, 5);
        flowerPack3 = new FlowerPack(flower3, 7);

        store = new Store();
        store.addPack(flowerPack1);
        store.addPack(flowerPack2);
        store.addPack(flowerPack3);
    }

    @Test
    public void test_adding() {
        FlowerPack new_pack = new FlowerPack(new Flower(FlowerType.LILYOFTHEVALLEY, 15, FlowerColor.RED, 50), 5);
        Assertions.assertEquals(store.getSize(), 3);
        store.addPack(new_pack);
        Assertions.assertEquals(store.getSize(), 4);
    }

    @Test
    public void buyOneFlower() {
        Flower toBuy = new Flower(FlowerType.CHAMOMILE, 10, FlowerColor.RED, 20);
        Assertions.assertTrue(store.isInside(toBuy));
        Assertions.assertEquals(store.getNumberOf(toBuy), 3);
        Flower bought = store.search(toBuy);
        Assertions.assertTrue(bought.equals(flower1));
        Assertions.assertEquals(store.getNumberOf(toBuy), 2);

    }

    @Test
    public void buyPacksTillEmpty() {
        Flower flower_new = new Flower(FlowerType.ROSE, 20, FlowerColor.BLUE, 40);
        FlowerPack bought = store.search(flower_new, 3);
        Assertions.assertEquals(store.getNumberOf(flower2), 2);
        Assertions.assertEquals(store.getSize(), 3);
        bought = store.search(flower_new, 2);
        Assertions.assertEquals(store.getNumberOf(flower_new), 0);
        Assertions.assertEquals(store.getSize(), 2);
    }

    @Test
    public void testBucketPurchase() {
        FlowerBucket toBuy = store.search(new FlowerPack(flower1, 2), new FlowerPack(flower2, 2));
        Assertions.assertEquals(store.getNumberOf(flower1), 1);
        Assertions.assertEquals(store.getNumberOf(flower2), 3);

    }


}
