package senla.loops;

import java.lang.reflect.Array;

public class Main {

    //main method
    public static void main(String[] args) {

        //local variable
        int counter = 10;

        //Example with while loop
        System.out.println("Example with while loop ==========");
        while (counter > 0){
            Cat cat = new Cat();
            System.out.println("Cat name = " + cat.catName +
                                ", cat age = " + cat.catAge + "\n");
            counter--;
        }

        //Example with for loop
        System.out.println("Example with for loop =============");
        for (int i = 0; i < 10; i++){
            Cat cat = new Cat();
            cat.setCatName("Boris");
            cat.setCatAge(3);
            System.out.println("Cat name = " + cat.catName +
                    ", cat age = " + cat.catAge + "\n");
        }

        //Example with do while loop
        System.out.println("Example with do while loop =========");
        do{
            counter++;
            Cat cat = new Cat("Matroskin", 8);
            System.out.println("Cat name = " + cat.catName +
                    ", cat age = " + cat.catAge + "\n");
        }while(counter < 10);

        //Example with forEach loop
        System.out.println("Example with forEach loop");

        //create Cat array
        Cat[] cats = new Cat[5];

        //init Cat array
        for(int i = 0; i < 5; i++){
            cats[i] = new Cat();
        }

        //print data using forEach loop
        for(Cat c : cats){
            System.out.println("Cat name = " + c.catName +
                               ", cat age = " + c.catAge + "\n");
        }

    }//main ends
}//class ends
