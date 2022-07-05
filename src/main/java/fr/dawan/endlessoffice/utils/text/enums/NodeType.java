package fr.dawan.endlessoffice.utils.text.enums;

public enum NodeType
{
    TEXT    (false, "text node"),
    ANSWER  (true,  "answer section"),
    CHOICE  (true,  "choice section"),
    SECTION (true,  "section delimiter"),
    A       (true,  "response to selected choice"),
    BL      (true,  "text block node"),
    C       (true,  "choice selection"),
    L       (true,  "text line");

    private final boolean hasNumeration;
    private final String description;

    NodeType(boolean hasNumeration, String description)
    {
        this.hasNumeration = hasNumeration;
        this.description = description;
    }

    public boolean hasNumeration() {
        return hasNumeration;
    }

    public String getDescription() {
        return description;
    }
}
