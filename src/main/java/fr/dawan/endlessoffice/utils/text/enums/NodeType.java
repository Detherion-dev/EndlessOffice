package fr.dawan.endlessoffice.utils.text.enums;

public enum NodeType
{
    NONE    (false, 0, ""),
    TEXT    (false, 0, "text node"),
    ANSWER  (true,  1, "answer section"),
    CHOICE  (true,  1, "choice section"),
    SECTION (true,  1, "section delimiter"),
    A       (true,  2, "response to selected choice"),
    BL      (true,  2, "text block node"),
    C       (true,  2, "choice selection"),
    L       (true,  3, "text line");

    private final boolean hasNumeration;
    private final int depth;
    private final String description;

    NodeType(boolean hasNumeration, int depth, String description)
    {
        this.hasNumeration = hasNumeration;
        this.depth = depth;
        this.description = description;
    }

    public boolean hasNumeration() {
        return hasNumeration;
    }

    public int getDepth() {
        return depth;
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
