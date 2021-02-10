package Ship;

import Deck.Deck;
import Deck.AddAndDelete;

import java.util.Objects;

public abstract class Ship {

    //class fields
    private ShipType shipType;
    private Deck deck;

    //constructors
    public Ship(ShipType shipType, Deck deck){
        this.shipType = shipType;
        this.deck = deck;
    }

    //getters
    public ShipType getShipType() {
        return this.shipType;
    }

    public Deck getDeck() {
        return this.deck;
    }

    //object methods
    @Override
    public String toString() {
        return "Ship{" +
                "shipType=" + shipType +
                ", deck=" + deck +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ship ship = (Ship) o;
        return shipType == ship.shipType && Objects.equals(deck, ship.deck);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shipType, deck);
    }

}//class ends
