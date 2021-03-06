package fr.dawan.endlessoffice.utils.enums;

public enum ItemSize {
    SMALL (1),
    MEDIUM (2),
    LARGE (3);

    private final int index;

    ItemSize(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

}
