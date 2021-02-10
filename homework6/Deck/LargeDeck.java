package Deck;

import Container.Container;

public class LargeDeck extends Deck{

    //constructor
    private LargeDeck(DeckSize deckSize){
        super(deckSize);
    }

    public static LargeDeck createLargeDeck(){
        DeckSize deckSize = DeckSize.LARGE;
        LargeDeck largeDeck = null;
        largeDeck = new LargeDeck(deckSize);
        return largeDeck;
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

}//class ends
