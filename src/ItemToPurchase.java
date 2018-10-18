public class ItemToPurchase {

    private String itemName;
    private String itemDescription;
    private int itemPrice;
    private int itemQuantity;

    public ItemToPurchase() {
        itemName = "none";
        itemDescription = "none";
        itemPrice = 0;
        itemQuantity = 0;
    }

    public ItemToPurchase(String itemName, String itemDescription, int itemPrice, int itemQuantity) {
        this.itemName = itemName;
        this.itemDescription = itemDescription;
        setPrice(itemPrice);
        setQuantity(itemQuantity);
    }

    public String getDescription() {
        return itemDescription;
    }

    public void setDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public String getName() {
        return itemName;
    }

    public void setName(String itemName) {
        this.itemName = itemName;
    }

    public int getPrice() {
        return itemPrice;
    }

    public void setPrice(int itemPrice) {

        if (itemPrice>=0)
            this.itemPrice = itemPrice;
        else
            this.itemPrice = 0;
    }

    public int getQuantity() {
        return itemQuantity;
    }

    public void setQuantity(int itemQuantity) {
        if (itemQuantity>=0)
            this.itemQuantity = itemQuantity;
        else
            this.itemQuantity = 0;
    }


    public void printItemCost(){
        System.out.println(itemName+" "+itemQuantity+" @ $"+itemPrice+" = $"+(itemPrice*itemQuantity));
    }

    public void printItemDescription(){
        System.out.println(itemName+": "+itemDescription);
    }
}
