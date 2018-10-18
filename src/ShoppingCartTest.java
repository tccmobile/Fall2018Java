import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ShoppingCartTest {

    ShoppingCart testCart = new ShoppingCart();

    @Test
    public void addItem() {

       ItemToPurchase testItem = new ItemToPurchase("hot dog","junk",-1,12);

        testCart.addItem(testItem);

        Assert.assertEquals("hot dog",testCart.cartItems.get(0).getName());;
        Assert.assertEquals(0,testCart.cartItems.get(0).getPrice());

    }
}