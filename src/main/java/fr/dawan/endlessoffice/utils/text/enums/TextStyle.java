package fr.dawan.endlessoffice.utils.text.enums;

public enum TextStyle
{
    B("bold"),
    I("italic");

    private final String description;

    TextStyle(String description)
    {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
