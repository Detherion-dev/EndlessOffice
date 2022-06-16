package endlessoffice.entities.items;

public enum ItemSize {
    SMALL (1),
    MEDIUM (2),
    LARGE (3);

    private final int index;

    public int index() {
        return index;
    }

    private ItemSize(int index) {
        this.index = index;
    }
}
