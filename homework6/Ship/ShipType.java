package Ship;

public enum ShipType {

    SINGLE_DECK(1),
    DOUBLE_DECK(2);

    private int numberOfDecks;

    //constructor
    private ShipType(int numberOfDecks){
        this.numberOfDecks = numberOfDecks;
    }

    //getter
    public int getNumberOfDecks(){
        return this.numberOfDecks;
    }

}//enum ends
