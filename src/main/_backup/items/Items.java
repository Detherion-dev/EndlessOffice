package endlessoffice.entities._backup.items;

public enum Items {
    DESK (45, 23, false),
    DRAWER (45, 23, false),
    COMPUTER (45, 23, false),
    LAPTOP (45, 23, false),
    SCREEN (45, 23, false),
    MOUSE (45, 23, false),
    BAG (45, 23, false),
    STAPLER (45, 23, false),
    PEN (45, 23, false),
    NOTEPAD (45, 23, false),
    HEADPHONE (45, 23, false),
    BOOK (45, 23, false),
    BADGE (45, 23, false),
    POCKET (45, 23, false),
    CASE (45, 23, false),
    MUG (45, 23, false),
    PHONE (45, 23, false),
    COFFEEMACHINE (45, 23, false),
    WATERDISPENSER (45, 23, false),
    FRIDGE (45, 23, false),
    KETTLE (45, 23, false),
    LIBRARY (45, 23, false);

    private final int width, length;
    private final boolean isFixe;
    Items(int width, int length, boolean isFixe) {
        this.width = width;
        this.length = length;
        this.isFixe = isFixe;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public boolean isFixe() {
        return isFixe;
    }
}
