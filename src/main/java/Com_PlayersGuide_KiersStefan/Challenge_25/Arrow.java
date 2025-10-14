package Com_PlayersGuide_KiersStefan.Challenge_25;


enum Arrowhead {
    STEEL, WOOD, OBSIDIAN
}

enum Fletching {
    PLASTIC, TURKEYFEATHERS, GOOSEFEATHERS
}

class Arrow {
    // created private final fields
    private final int arrowLength;
    private final Arrowhead selectedArrowhead;
    private final Fletching fletchingChoice;

    // constructor for fields
    public Arrow(int arrowLength, Arrowhead selectedArrowHead, Fletching selectedFletching) {
        this.arrowLength = arrowLength;
        this.selectedArrowhead = selectedArrowHead;
        this.fletchingChoice = selectedFletching;
    }

    // added getters.
    public int getArrowLength() {
        return arrowLength;
    }

    public Arrowhead getSelectedArrowhead() {
        return selectedArrowhead;
    }

    public Fletching getFletchingChoice() {
        return fletchingChoice;
    }

    public float getCost() {
        float cost = 0;

        // Arrowhead price
        switch (selectedArrowhead) {
            case STEEL:
                cost += 10;
                break;
            case WOOD:
                cost += 3;
                break;
            case OBSIDIAN:
                cost += 5;
                break;
        }

        // Fletching price
        switch (fletchingChoice) {
            case PLASTIC:
                cost += 10;
                break;
            case TURKEYFEATHERS:
                cost += 5;
                break;
            case GOOSEFEATHERS:
                cost += 3;
                break;
        }
        // Length price =  0.05 gold per centimeter
        cost += arrowLength * 0.05f;

        return cost;
    }

    @Override
    public String toString() {
        //noinspection preview
        return STR."\{arrowLength}cm \{selectedArrowhead} arrow with \{fletchingChoice} fletching";
    }
}

