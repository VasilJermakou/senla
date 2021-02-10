package Ship;

import Deck.*;
import Container.*;

public class TestShip {

    public static void main(String[] args) {

        //create small containers
        Container squareContainer1 = new SquareContainer(50,10, WaterType.LIGHT);
        Container squareContainer2 = new SquareContainer(40,10, WaterType.LIGHT);
        Container cylinderContainer1 = new CylinderContainer(30, 10, WaterType.LIGHT);
        Container coneContainer1 = new ConeContainer(20,10, WaterType.LIGHT);

        //create small deck
        Deck smallDeck1 = SmallDeck.createSmallDeck();

        //print
        System.out.println(smallDeck1.toString());

        //add containers on deck
        smallDeck1.add(squareContainer1);
        smallDeck1.add(squareContainer2);
        smallDeck1.add(cylinderContainer1);
        smallDeck1.add(coneContainer1);

        //print
        System.out.println(smallDeck1.toString());

        //create ShipeType
        ShipType singleType = ShipType.SINGLE_DECK;

        //create single deck shipe
        SingleDeckShipe singleDeckShipe1 = SingleDeckShipe.CreateSingleDeckShipe(singleType, smallDeck1);
        System.out.println(singleDeckShipe1.toString());

        //TEST to calculate volume of water in ship containers
        for(int i = 0; i < singleDeckShipe1.getDeck().getContainers().length; i++){
            System.out.println(singleDeckShipe1.getDeck().getContainers()[i].countVolume());
        }

        System.out.println("***************");

        //create large deck
        Deck largeDeck1 = LargeDeck.createLargeDeck();

        //create large containers
        Container cylinderContainer = new CylinderContainer(100, 20, WaterType.HEAVY);
        Container coneContainer = new ConeContainer(90, 20, WaterType.HEAVY);

        //add containers on deck
        largeDeck1.add(cylinderContainer);
        largeDeck1.add(coneContainer);

        //print
        System.out.println(largeDeck1.toString());

        //create shipe type
        ShipType doubleType = ShipType.DOUBLE_DECK;

        //create double deck shipe
        DoubleDeckShipe doubleDeckShipe1 = DoubleDeckShipe.CreateDoubleDeckShipe(doubleType, smallDeck1, largeDeck1);
        System.out.println(doubleDeckShipe1.toString());









    }//main ends
}//class ends
