package endlessoffice.entities._backup.employees;

//=============================================================================================
// Module Import
//=============================================================================================
import java.util.Map;

import Action;
import endlessoffice.entities._backup.*;
import endlessoffice.entities._backup.actions.Planning;
import endlessoffice.entities._backup.items.Bag;
import endlessoffice.entities._backup.items.Item;
import endlessoffice.entities._backup.items.Phone;
//=============================================================================================

/**
 * The Employee class represents a character in the game Endless Office
 */
public abstract class Employee extends InteractiveObject implements IEmployee {
    //region Attributes
    private String trigram;                       // Employee trigram
    private String firstname;                     // Employee firstname
    private String lastname;                      // Employee lastname
    private String gender;                        // Employee gender
    private String position;                      // Employee position; ex: Office 1, toilets, etc.
    private Phone phone;                          // Employee phone
    private Item desk;                            // Employee desk
    private Item itemInHand;                      // Item in employee's hand
    private Bag bag;                              // Employee bag
    private Planning planning;                    // Employee planning
    private Map<Integer, Action> pendingActions;  // Employee pending actions
    //endregion

    //region Constructors
    public Employee() {
        super();
    }

    public Employee(int id) {
        super(id);
    }

    public Employee(int id, String firstname, String lastname) {
        this(id);
        this.setName(firstname, lastname);
    }
    //endregion

    //region Public methods
    public String toString() {
        return "Employee " + getName() + "( " + getId() + ")";
    }

    @Override
    public Action acts(Action actionToExecute) {
        // TODO: to implement
        return null;
    }

    @Override
    public void addTaskInPlanning(Action task) {
        // TODO: to implement
    }

    @Override
    public void deleteTaskFromPlanning(int taskId) {
        // TODO: to implement
    }

    @Override
    public void updateTaskFromPlanning(int taskId) {
        // TODO: to implement
    }
    
    @Override
    public void takeItem(Item item) {
        // TODO : to implement
    }

    @Override
    public void dropItem(int itemId) {
        // TODO: to implement
    }

    @Override
    public void storeItem(Item item, boolean isBag) {
        //TODO: to implement
    }

    public String getName() {
        return firstname + " " + lastname;
    }

    public void setName(String firstname, String lastname){
        this.firstname = firstname;
        this.lastname = lastname;
        this.trigram = firstname.charAt(0) + lastname.substring(0,2);
    }
    //endregion

    //region Getters
    public String getTrigram() {
        return trigram;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getGender() {
        return gender;
    }

    public String getPosition() {
        return position;
    }

    public Phone getPhone() {
        return phone;
    }

    public Item getDesk() {
        return desk;
    }

    public Item getItemInHand() {
        return itemInHand;
    }

    public Bag getBag() {
        return bag;
    }

    public Planning getPlanning() {
        return planning;
    }

    public Map<Integer, Action> getPendingActions() {
        return pendingActions;
    }
    //endregion

    //region Setters
    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    public void setDesk(Item desk) {
        this.desk = desk;
    }

    public void setItemInHand(Item itemInHand) {
        this.itemInHand = itemInHand;
    }

    public void setBag(Bag bag) {
        this.bag = bag;
    }

    public void setPlanning(Planning planning) {
        this.planning = planning;
    }

    public void setPendingActions(Map<Integer, Action> pendingActions) {
        this.pendingActions = pendingActions;
    }
    //endregion
}
