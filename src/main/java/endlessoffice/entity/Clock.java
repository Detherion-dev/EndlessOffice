package main.java.endlessoffice.entity;

//=============================================================================================
// Module Import
//=============================================================================================
import java.time.LocalDate;
import java.time.LocalTime;
//=============================================================================================


/**
 * TODO: describe this class
 */
public class Clock {
    private String day;
    private LocalTime hour;

    //region Constructors
    public Clock() {

    }
    //endregion

    //region Public methods
    public String toString() {
        return day + " - " + hour.toString();
    }

    //region Getters
    public String getDay() {
        return day;
    }

    public LocalTime getHour() {
        return hour;
    }
    //endregion

    //region Setters
    public void setDay(String day) {
        this.day = day;
    }

    public void setHour(LocalTime hour) {
        this.hour = hour;
    }
    //endregion
}
