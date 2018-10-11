public class NewStore {
    public static void main(String[] args) {
        Store store1 = new Store("Macy's", "Department");
        Store store2 = new Store("Albertsons", "Grocery");
        Store store3 = new Store("Ace", "Hardware");

        System.out.println("Store 1's ID: " + store1.getId());
        System.out.println("Store 2's ID: " + store2.getId());
        System.out.println("Store 3's ID: " + store3.getId());
     //   System.out.println("Next ID: " + Store.nextId); nextId is private
      // System.out.println("Next ID: " + Store.name); name not a static field

        // System.out.println("Next ID: " + store1.nextId); works but unclear


        System.out.println("Next ID: " + Store.getNextId());
    }
}