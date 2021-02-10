package Ship;

import Deck.Deck;

public class DoubleDeckShipe extends Ship{

    Deck secondDeck;

    //constructors
    private DoubleDeckShipe(ShipType shipType, Deck deck, Deck secondDeck){
        super(shipType, deck);
        this.secondDeck = secondDeck;
    }

    public static DoubleDeckShipe CreateDoubleDeckShipe(ShipType shipType, Deck deck, Deck secondDeck){
        DoubleDeckShipe doubleDeckShipe = null;
        if(shipType.getNumberOfDecks() == 2){
            doubleDeckShipe = new DoubleDeckShipe(shipType, deck, secondDeck);
        }
        return doubleDeckShipe;
    }

    //object methods
    @Override
    public String toString() {
        super.toString();
        return "DoubleDeckShipe{" +
                "shipType=" + super.getShipType() +
                ", deck=" + super.getDeck() +
                "secondDeck=" + secondDeck +
                '}';
    }

}//class ends
