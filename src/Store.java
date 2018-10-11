public class Store {
    // Declare and initialize public static field
    private static int nextId = 101;

    // Define private fields
    private String name;
    private String type;
    private int id;

    public Store(String storeName, String storeType) {
        name = storeName;
        type = storeType;
        id = nextId;

        ++nextId;   // Increment each time a Store object is created
    }

    public int getId() {
        return id;
    }

    public static int getNextId() {
        return nextId;
    }
}