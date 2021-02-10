package Deck;

import Container.Container;

import java.util.Arrays;

public class SmallDeck extends Deck {

    //constructor
    private SmallDeck(DeckSize deckSize){
        super(deckSize);
    }

    public static SmallDeck createSmallDeck(){
        DeckSize deckSize = DeckSize.SMALL;
        SmallDeck smallDeck = null;
        smallDeck = new SmallDeck(deckSize);
        return smallDeck;
    }

    //implements method from Interface
    @Override
    public boolean add(Container item) {
        boolean isAdded = false;
        //step 1
        if(item == null){
            isAdded = false;
        }
        //step 2
        if(super.containers.length == 0){
            isAdded = false;
        }
        //step3
        for(int i = 0; i < super.containers.length; i++){
            if(super.containers[i] == null){
                super.containers[i] = item;
                isAdded = true;
                break;
            }

            if(super.containers[i].isContainerEmpty() == false){
                System.out.println("Container #" + i + " is full!");
            }else{
                super.containers[i] = item;
                isAdded = true;
                break;
            }
        }
        return isAdded;
    }

    @Override
    public boolean delete(Container item) {
        boolean result = false;

        for(int i = 0; i < super.containers.length; i++){
            if(super.containers[i] == null){
                continue;
            }

            if(super.containers[i].equals(item)){
                super.containers = SmallDeck.deleteItemInArray(super.containers, i);
            }
        }

        return result;
    }

    public static Container[] deleteItemInArray(Container[] containers, int index){
        Container[] newContainers = new Container[containers.length];
        for(int i = 0; i < containers.length; i++){
            if(i == index){
                continue;
            }
            newContainers[i] = containers[i];
        }
        return  newContainers;
    }



}//class ends
