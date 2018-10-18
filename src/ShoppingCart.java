import java.util.ArrayList;

public class ShoppingCart {

    private String customerName;
    private String currentDate;
    private ArrayList<ItemToPurchase> cartItems;

    public ShoppingCart() {
        customerName = "none";
        currentDate = "January 1, 2016";
        cartItems = new ArrayList<>();
    }

    public ShoppingCart(String customerName, String currentDate) {
        this.customerName = customerName;
        this.currentDate = currentDate;
        cartItems = new ArrayList<>();
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getDate() {
        return currentDate;
    }


    public void addItem(ItemToPurchase item){

    }

    public void removeItem(String itemToRemove){


    }

    public void modifyItem(ItemToPurchase item){
        int i = 0;
        boolean found = false;

        while ( (!found) && (i < cartItems.size()) ) {
            if (cartItems.get(i).getName().equals(item.getName())) {
                found = true;

                // Update fields
                if (!item.getDescription().equals("none")) {
                    cartItems.get(i).setDescription(item.getDescription());
                }

                if (item.getPrice() != 0) {
                    cartItems.get(i).setPrice(item.getPrice());
                }

                if (item.getQuantity() != 0) {
                    cartItems.get(i).setQuantity(item.getQuantity());
                }
            }

            ++i;
        }

        if(!found) {
            System.out.println("Item not found in cart. Nothing modified.");
        }
    }

    public int getNumItemsInCart(){
        int numItems = 0;

        return numItems;
    }

    public int getCostOfCart(){
        int totalCost = 0;

        return totalCost;
    }

    public void printTotal(){

    }

    public void printDescriptions(){

    }
}
