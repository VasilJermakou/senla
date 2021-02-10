package Deck;

public enum DeckSize {

    SMALL(4),       //4 small containers on small deck
    LARGE(2);       //2 large containers on large deck

    private int size;

    private DeckSize(int size){
        this.size = size;
    }

    public int getSize(){
        return this.size;
    }
}
