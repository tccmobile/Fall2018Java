public class PersonInfo {
    private int numKids;

    public void setNumKids(int personsKids) {
        numKids = personsKids;
    }

    public void incNumKids() {
        numKids = numKids + 1;
    }

    public int getNumKids() {
        return numKids;
    }
}