package fr.dawan.endlessoffice.utils.text.enums;

public enum NodeType
{
    NONE    (false, ""),
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

    @Override
    public String toString()
    {
        switch (this)
        {
            case TEXT:
                return "text";
            case ANSWER:
                return "answer";
            case CHOICE:
                return "choice";
            case SECTION:
                return "section";
            case A:
                return "a";
            case BL:
                return "bl";
            case C:
                return "c";
            case L:
                return "l";
            default:
                return "";
        }
    }
}
