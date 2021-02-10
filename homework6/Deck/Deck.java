package Deck;

import Container.Container;

import java.util.Arrays;
import java.util.Objects;

public abstract class Deck implements AddAndDelete<Container> {

    //class fields
    //change to private modifiers!!!!!!!!!!!
    Container[] containers;
    DeckSize deckSize;
    private final double SIZE_OF_LARGE_DIAGONAL_CONTAINER = 20;
    private final double SIZE_OF_SMALL_DIAGONAL_CONTAINER = 10;

    //constructors
    public Deck(DeckSize deckSize){
        this.containers = new Container[deckSize.getSize()];
        this.deckSize = deckSize;
    }

    public Deck(Container container){
        if(container.getDiagonal() == this.SIZE_OF_LARGE_DIAGONAL_CONTAINER){
            this.containers = new Container[2];
            this.containers[0] = container;
            this.deckSize = deckSize;
        }

        if(container.getDiagonal() == this.SIZE_OF_SMALL_DIAGONAL_CONTAINER){
            this.containers = new Container[4];
            this.containers[0] = container;
            this.deckSize = deckSize;
        }
    }

    public Deck(Container[] containers){
        this.containers = new Container[containers.length];
        for(int i = 0; i < containers.length; i++){
            this.containers[i] = containers[i];
        }

        if(containers.length == DeckSize.LARGE.getSize()){
            this.deckSize = DeckSize.LARGE;
        }

        if(containers.length == DeckSize.SMALL.getSize()){
            this.deckSize = DeckSize.SMALL;
        }
    }

    //getters
    public Container[] getContainers() {
        return containers;
    }

    public DeckSize getDeckSize() {
        return deckSize;
    }

    //methods from object
    @Override
    public String toString() {
        return "Deck {" +
                "containers=" + Arrays.toString(containers) +
                ", deckSize=" + deckSize +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Deck deck = (Deck) o;
        return Arrays.equals(containers, deck.containers) && deckSize == deck.deckSize;
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(deckSize);
        result = 31 * result + Arrays.hashCode(containers);
        return result;
    }
}//class ends
