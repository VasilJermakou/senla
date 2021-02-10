package Main;

import Container.*;
import Deck.*;
import Port.*;
import Ship.*;

public class Main {

    public static void main(String[] args) {

        //create large containers
        Container squareContainer1 = new SquareContainer(100, 20, WaterType.HEAVY);
        Container squareContainer2 = new SquareContainer(90, 20, WaterType.HEAVY);
        Container cylinderContainer1 = new CylinderContainer(80, 20, WaterType.HEAVY);
        Container coneContainer1 = new ConeContainer(70,20,WaterType.HEAVY);

        //create small containers
        Container squareContainer10 = new SquareContainer(50,10, WaterType.LIGHT);
        Container squareContainer11 = new SquareContainer(40, 10, WaterType.LIGHT);
        Container squareContainer12 = new SquareContainer(30, 10, WaterType.LIGHT);
        Container squareContainer13 = new SquareContainer(20, 10, WaterType.LIGHT);
        Container cylinderContainer20 = new CylinderContainer(50, 10, WaterType.LIGHT);
        Container cylinderContainer21 = new CylinderContainer(40, 10, WaterType.LIGHT);
        Container coneContainer30 = new ConeContainer(30, 10, WaterType.LIGHT);
        Container coneContainer31 = new ConeContainer(20, 10, WaterType.LIGHT);

        //create deck size
        DeckSize largeSize = DeckSize.LARGE;

        //create large deck
        Deck largeDeck1 = LargeDeck.createLargeDeck();
        Deck largeDeck2 = LargeDeck.createLargeDeck();

        //create small deck
        Deck smallDeck1 = SmallDeck.createSmallDeck();
        Deck smallDeck2 = SmallDeck.createSmallDeck();

        //add containers to largeDeck1 & largeDeck2
        largeDeck1.add(squareContainer1);
        largeDeck1.add(squareContainer2);
        largeDeck2.add(cylinderContainer1);
        largeDeck2.add(coneContainer1);

        //add containers to smallDeck1 & smallDeck2
        smallDeck1.add(squareContainer10);
        smallDeck1.add(squareContainer11);
        smallDeck1.add(squareContainer12);
        smallDeck1.add(squareContainer13);
        smallDeck2.add(cylinderContainer20);
        smallDeck2.add(cylinderContainer21);
        smallDeck2.add(coneContainer30);
        smallDeck2.add(coneContainer31);

        //create shipType
        ShipType doubleType = ShipType.DOUBLE_DECK;
        ShipType singleType = ShipType.SINGLE_DECK;

        //create double deck ship
        Ship doubleDeckShip1 = DoubleDeckShipe.CreateDoubleDeckShipe(doubleType, largeDeck1, largeDeck2);
        System.out.println(doubleDeckShip1.toString());

        //create single deck ships
        Ship singleDeckShip1 = SingleDeckShipe.CreateSingleDeckShipe(singleType, smallDeck1);
        Ship singleDeckShip2 = SingleDeckShipe.CreateSingleDeckShipe(singleType, smallDeck2);
        System.out.println(singleDeckShip1.toString());
        System.out.println(singleDeckShip2.toString());

        //create Ship array
        Ship[] ships = new Ship[10];
        ships[0] = doubleDeckShip1;
        ships[1] = singleDeckShip1;
        ships[2] = singleDeckShip2;

        //create port
        Port port1 = Port.createPort(ships);
        System.out.println(port1.toString());

        double massOfWater = 0.0;
        massOfWater = Port.countTheMassOfWater(port1.getShips());
        System.out.printf("Mass of water in port1 = %,.2f\n", massOfWater);




    }//main ends
}//class ends
