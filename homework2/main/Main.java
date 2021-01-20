package homework2.main;

import homework2.rainbow.*;

public class Main {

    public static void main(String[] args) {

        /**
         * This app print color from RainbowVersion1 class.
         * Each color has personal number:
         * 1 - red;
         * 2 - orange;
         * 3 - yellow;
         * 4 - green;
         * 5 - blue;
         * 6 - indigo;
         * 7 - purple;
         * Use method showColor(int color)
         * or overloading method showColor(int color1, int color2)
         * to see the app work result.
         * */

        //RainbowVersion1 class

        //create RainbowVersion1 object
        RainbowVersion1 rainbow1 = new RainbowVersion1();

        //test methods
        Main.printRainbowColors(rainbow1);

        //**********************************************
        System.out.println("***************************");

        //RainbowVersion2 class

        //create RainbowVersion2 object
        RainbowVersion2 rainbow2 = new RainbowVersion2();

        //test methods
        rainbow2.showOneColor(RainbowVersion2.RainbowColors.RED);
        rainbow2.showOneColor(RainbowVersion2.RainbowColors.ORANGE);
        rainbow2.showOneColor(RainbowVersion2.RainbowColors.YELLOW);
        rainbow2.showOneColor(RainbowVersion2.RainbowColors.GREEN);
        rainbow2.showOneColor(RainbowVersion2.RainbowColors.BLUE);
        rainbow2.showOneColor(RainbowVersion2.RainbowColors.INDIGO);
        rainbow2.showOneColor(RainbowVersion2.RainbowColors.PURPLE);

    }//main ends

    //static methods
    public static void printRainbowColors(RainbowVersion1 rainbow){
        for (int i = 1; i < 8; i++)
            rainbow.showColor(i);

        System.out.println("\n");

        for(int i = 7, j = 1; i > 0; i--, j++)
            rainbow.showColor(i, j);
    }//static method ends

}//class ends
