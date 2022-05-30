package endlessoffice.entities.items;

public interface IItem {

    /**
     * Returns if the item can be broken (true) or not (false)
     */
    boolean isBreakable();

    /**
     * Returns if the item can be moved (true) or not (false)
     */
    boolean isMovable();

    /**
     * Returns if the item can be stolen (true) or not (false)
     */
    boolean isStealable();

    /**
     * Returns if the item is electrical (true) or not (false)
     */
    boolean isElectrical();

    /**
     * Returns if the item can contains anothers items (true) or not (false)
     */
    boolean isAContainer();
}
