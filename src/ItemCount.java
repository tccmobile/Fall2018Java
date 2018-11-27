
public class ItemCount <Type extends Comparable<Type>> {
    private Type itemVal;  // Value for item
    private int itemCount; // Count for item

    // Set item value, and reset item count to 0
    public void setItem(Type newItemVal) {
        itemVal = newItemVal;
        itemCount = 0;
    }

    // Get item value
    public Type getItem() {
        return itemVal;
    }

    // Get item count
    public int getCount() {
        return itemCount;
    }

    // Reset item count to 0
    public void resetCount() {
        itemCount = 0;
    }

    // Reset item count to 0
    public void incrementCount() {
        ++itemCount;
    }

    // Increments the item count if compareVal argument
    // is equal to item value.
    public void incrementIfDuplicate(Type compareVal) {
        // FIXME: Complete method
        if (itemVal.compareTo(compareVal)==0){
            ++itemCount;
        }
    }

    // Returns string for item value and count using
    // the format itemVal: itemCount
    @Override
    public String toString() {
        return "" + itemVal + ": " + itemCount;
    }
}
