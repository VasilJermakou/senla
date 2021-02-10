package Ship;

import Deck.Deck;

public class SingleDeckShipe extends Ship {

    //constructors
    private SingleDeckShipe(ShipType shipType, Deck deck){
        super(shipType, deck);
    }

    public static SingleDeckShipe CreateSingleDeckShipe(ShipType shipType, Deck deck){
        SingleDeckShipe singleDeckShipe = null;
        if(shipType.getNumberOfDecks() == 1){
            singleDeckShipe = new SingleDeckShipe(shipType, deck);
        }
        return singleDeckShipe;
    }

}//class ends
