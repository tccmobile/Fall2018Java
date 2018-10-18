import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ItemToPurchaseTest {

    ItemToPurchase test = new ItemToPurchase();
    @Test
    public void setDescription() {

        test.setDescription("junk food");
        Assert.assertEquals("junk food", test.getDescription());
    }

    @Test
    public void setPrice() {
        test.setPrice(5);
        Assert.assertEquals(5,test.getPrice());

        test.setPrice(-1);
        Assert.assertEquals(0,test.getPrice());
    }

    @Test
    public void setQuantity() {
        test.setQuantity(-1);
        Assert.assertEquals(0,test.getQuantity());
    }
}