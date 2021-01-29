import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        /**
         * HomeWork #4
         * 1. Create a String matrix of 10x10 rows. Enter Strings in the form of numbers as double.
         * Each element of the matrix must contain 6 characters. Elements in the matrix alternate:
         * number line line number line line. Numbers and lines are generated randomly.
         *
         * 2. Take its straight and side diagonal, compare them, whether they are the same.
         * Then putt all elements of diagonals to an array. Determine symbols and numbers in an array.
         *
         * 3. If the element is a String, then take from 2 to 4 elements from it and put it in the
         * StringBuilder, after which simply display them on the screen, separated by commas.
         *
         * 4. If the element is a number, then each number must be rounded: if 1.7 or more,
         * then upwards, if a number less than 1.7 - down. Then add these numbers into an array.
         * Print this array to the screen through the sign underscores.
         *
         * 5. Display the initial matrix on the screen.
         * */

        System.out.println("\nString Binary Array (first version):");

        //create String matrix size 10x10, #2
        String[][] array = StringArrayTests.createStringBinaryArray(10, 10);

        //fill in matrix with random words and numbers type of String #16
        array = StringArrayTests.createRandomWordsAndNumbers(array);

        System.out.println("Work to find Side Diagonal elements: \n");

        System.out.println("Print String Binary Array #1.1");
        StringArrayTests.printStringBinaryArray(array);

        System.out.println("\nPrint Side Diagonal Elements #5");
        StringArrayTests.printSideDiagonal(array);

        System.out.println("Print Straight Diagonal Elements #6");
        StringArrayTests.printStraightDiagonal(array);

        //find Side Diagonal elements and put it into new String Array #7
        String[] sideElements = StringArrayTests.findSideDiagonalElements(array);

        //print String array
        System.out.println("Print new array of String Side Diagonal Elements #1.2");
        StringArrayTests.printStringArray(sideElements);

        System.out.println("");

        //create new double array
        double[] doubleSideElements = new double[sideElements.length];

        System.out.println("");

        System.out.println("If String word == double number then put it into doubleSideElements array #10:");
        doubleSideElements = StringArrayTests.checkIfDoubleAndReturn(sideElements);

        System.out.println("");

        //print result (double numbers in doubleSideElements)
        System.out.println("Print double array which contain double Side Elements (Main #2)");
        Main.printDoubleArray(doubleSideElements);

        System.out.println("\n");

        //create new String array
        String[] stringSideElements = new String[sideElements.length];

        System.out.println("If String word != double number then put it into stringSideElements array #11:");
        stringSideElements = StringArrayTests.checkIfStringAndReturnString(sideElements);

        //print result(String words in stringSideElements)
        System.out.println("\nPrint String array wich contain words Side Elements #1.2");
        StringArrayTests.printStringArray(stringSideElements);

        System.out.println("\n\n***********************************************\n");

        System.out.println("Work to find Straight Diagonal elements: ");

        //find Straight Diagonal elements and put it into new String Array #8
        String[] straightElements = StringArrayTests.findStraightDiagonalElements(array);

        //print String array
        System.out.println("\nPrint new array of String Straight Diagonal Elements #1.2");
        StringArrayTests.printStringArray(straightElements);

        System.out.println("");

        //create new double array
        double[] doubleStraightElements = new double[straightElements.length];

        System.out.println("");

        System.out.println("If String word == double number put it into doubleStraightElements array #10:");
        doubleStraightElements = StringArrayTests.checkIfDoubleAndReturn(straightElements);

        System.out.println("");

        System.out.println("Print double array which contain double Straight Elements (Main#2)");
        Main.printDoubleArray(doubleStraightElements);

        //create new String array
        String[] stringStraightElements = new String[straightElements.length];

        System.out.println("\n");

        System.out.println("If String word != double number then put it into stringStraightElements array #11:");
        stringStraightElements = StringArrayTests.checkIfStringAndReturnString(straightElements);

        System.out.println("");

        //print result(String words in stringStraightElements)
        System.out.println("Print String array which contain words Straight Elements #1.2");
        StringArrayTests.printStringArray(stringStraightElements);

        System.out.println("");

        //compare Side Diagonal and Straight Diagonal
        System.out.println("\nCompare two String Array #9");
        System.out.println(StringArrayTests.isArraysTheSame(sideElements, straightElements));

        System.out.println("\n***********************************************\n");

        //Print StringBuilder
        System.out.println("StringBuilder with stringSideElements");
        StringArrayTests.printStringBuilderElement(stringSideElements);

        System.out.println("");

        System.out.println("StringBuilder with stringStraightElements #14");
        StringArrayTests.printStringBuilderElement(stringStraightElements);

        System.out.println("");

        //Rounding double values: if >= 1.7 -> 2; if <= 1.7 -> 1.0  (method #15)
        double[] roundDoubleSideElements = StringArrayTests.roundDoubleNumbers(doubleSideElements);
        double[] roundDoubleStraightElements = StringArrayTests.roundDoubleNumbers(doubleStraightElements);

        System.out.println("Print roundDoubleSideElements (Main#2)");
        Main.printDoubleArray(roundDoubleSideElements);

        System.out.println("\n");

        System.out.println("Print roundDoubleStraightElements (Main#2)");
        Main.printDoubleArray(roundDoubleStraightElements);

        System.out.println("\n");

        System.out.println("Print String Binary Array (first version) #1.1:");
        StringArrayTests.printStringBinaryArray(array);




    }//main ends

    //Main #1
    public static boolean isArraysTheSame(String[] array1, String[] array2){
        boolean result = false;

        if(array1 == null || array2 == null)
           return  result;

        if(array1.length != array2.length)
            return result;

        for(int i = 0; i < array1.length; i++){
            if(array1[i] != array2[i])
                return result;
            else {
                result = true;
            }
        }
        return result;
    }

    //Main#2
    public static void printDoubleArray(double[] array){
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }

}//class ends
