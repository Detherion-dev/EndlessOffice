package endlessoffice.entities.items;

public enum Items {
    phone (1, 1, 200, true, true, true, false),
    computer (12, 4, 4500, false, true, true, false),
    laptop (4, 2, 1500, true, true, true, false),
    screen (4, 2, 800, true, true, true, false),
    mug (2, 1, 300, true, true, false, false),
    coffeeMachine ( 4, 4, 2500, false, true, true, false),
    badge (1, 1, 100, true, true, false, false),
    bag (8, 6, 300, true, true, false, true);

    private final int length, width;
    private final double weight;
    private final boolean isMovable, isBreakable, isElectrical, isAContainer;


    Items(int length, int width, double weight,
          boolean isMovable, boolean isBreakable, boolean isElectrical, boolean isAContainer) {
        this.length = length;
        this.width = width;
        this.weight = weight;
        this.isMovable = isMovable;
        this.isBreakable = isBreakable;
        this.isElectrical = isElectrical;
        this.isAContainer = isAContainer;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public double getWeight() { return weight; }

    public boolean isMovable() {
        return isMovable;
    }

    public boolean isBreakable() {
        return isBreakable;
    }

    public boolean isElectrical() {
        return isElectrical;
    }

    public boolean isAContainer() {
        return isAContainer;
    }
}
