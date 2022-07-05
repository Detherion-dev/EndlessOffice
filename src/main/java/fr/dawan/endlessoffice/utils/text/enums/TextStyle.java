package fr.dawan.endlessoffice.utils.text.enums;

public enum TextStyle
{
    NONE("none"),
    B   ("bold"),
    I   ("italic");

    private final String description;

    TextStyle(String description)
    {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString()
    {
        switch (this)
        {
            case B:
                return "b";
            case I:
                return "i";
            default:
                return "";
        }
    }
}
