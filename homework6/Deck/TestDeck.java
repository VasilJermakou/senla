package Deck;

import Container.Container;
import Container.*;

import java.util.Arrays;

public class TestDeck {

    public static void main(String[] args) {

        //create array of containers
        Container[] containers = new Container[4];

        //create small containers
        Container squareContainer1 = new SquareContainer(50,10,WaterType.LIGHT);
        Container squareContainer2 = new SquareContainer(50,10,WaterType.LIGHT);
        Container cylinderContainer = new CylinderContainer(40, 10, WaterType.LIGHT);
        Container coneContainer = new ConeContainer(30, 10, WaterType.LIGHT);

        //put containers into containers array
        containers[0] = squareContainer1;
        containers[1] = squareContainer2;
        containers[2] = cylinderContainer;
        containers[3] = coneContainer;

        //System.out.println(Arrays.toString(containers));

        //DeckSize smallDeckSize = DeckSize.SMALL;

        System.out.println("===============");

        SmallDeck smallDeck = SmallDeck.createSmallDeck();

        System.out.println(smallDeck.toString());

        smallDeck.add(squareContainer1);
        smallDeck.add(squareContainer2);
        smallDeck.add(cylinderContainer);
        smallDeck.add(coneContainer);
        //smallDeck.add(squareContainer1);

        System.out.println(smallDeck.toString());

        smallDeck.delete(squareContainer1);
        System.out.println(smallDeck.toString());
        smallDeck.delete(squareContainer1);
        System.out.println(smallDeck.toString());

        System.out.println("WORK WITH LARGE DECK ***********");

        LargeDeck largeDeck1 = LargeDeck.createLargeDeck();

        //create large containers
        Container squareContainer10 = new SquareContainer(100,20,WaterType.HEAVY);
        Container squareContainer20 = new SquareContainer(90,20,WaterType.HEAVY);
        Container cylinderContainer30 = new CylinderContainer(80, 20, WaterType.HEAVY);
        Container coneContainer40 = new ConeContainer(70, 20, WaterType.HEAVY);

        System.out.println(largeDeck1.toString());

        largeDeck1.add(squareContainer10);
        largeDeck1.add(squareContainer20);
        largeDeck1.add(cylinderContainer30);
        largeDeck1.add(coneContainer40);

        System.out.println(largeDeck1.toString());

        System.out.println(largeDeck1.containers[0].countVolume());












    }//main ends
}//class ends
