import java.util.Arrays;

public class StringArrayTests {

    //class fields
    public String [][] words = null;

    //default constructor
    public StringArrayTests(){
        this.words = new String[3][3];

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                words[i][j] = "ZERO";
            }
        }
    }

    //constructor with params
    public StringArrayTests(String [][] array){
        this.words = array;
    }

    //overriding equals()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StringArrayTests that = (StringArrayTests) o;
        return Arrays.equals(words, that.words);
    }

    //overriding hashCode()
    @Override
    public int hashCode() {
        return Arrays.hashCode(words);
    }

    //******************************************************
    //methods
    //******************************************************

    //#1
    public void printStringBinaryArray(){
        for(int i = 0; i < words.length; i++){
            for(int j = 0; j < words[i].length; j++){
                System.out.print(words[i][j] + "  ");
            }
            System.out.print("\n");
        }
    }

    //#1.1
    public static void printStringBinaryArray(String [][] array){
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                System.out.print(array[i][j] + "  ");
            }
            System.out.print("\n");
        }
    }

    //#1.2
    public static  void printStringArray(String[] array){
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }

    //#2
    public static String[][] createStringBinaryArray(int lineSizeOfArray, int columnSizeOfArray){
        String[][] StringArray = new String[lineSizeOfArray][columnSizeOfArray];
        return StringArray;
    }

    //#3
    public static String[][] fillInRandomStringBinaryArray(String[][] array){
        double randomNum = 0;
        String stringNum = "";
        for(int i = 0; i < array.length; i++){
            //generate random double number
            randomNum = ((Math.random() * 10) + 1);
            randomNum = Math.round(randomNum);
            stringNum = Double.toString(randomNum);
            for(int j = 0; j <array[i].length; j++){
                array[i][j] = stringNum;
            }
        }
        return array;
    }

    //#4
    //Find size of array (line size & column size)
    public static int[] findSizesOfBinaryStringArray(String[][] array){
        int [] resultArray = {0, 0};
        int lineSizeArray = 0;
        int columnSizeArray = 0;

        for(int i = 0; i< array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                lineSizeArray = array.length;
                columnSizeArray = array[i].length;
                break;
            }
        }
        resultArray[0] = lineSizeArray;
        resultArray[1] = columnSizeArray;

        return  resultArray;
    }

    //#5
    /* Example of Side Diagonal
     *    0 0 1
     *    0 1 0
     *    1 0 0
     */
    public static void printSideDiagonal(String[][] array){
        //find out size of line & size of column of array
        int [] sizeArray = findSizesOfBinaryStringArray(array);
        int lineSizeArray = sizeArray[0];
        int columnSizeArray = sizeArray[1];

        //print Side Diagonal
        int linePrintIndex = 0;
        int columnPrintIndex = columnSizeArray - 1;

        for (int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                if(i == linePrintIndex && j == columnPrintIndex){
                    System.out.print(array[i][j] + " ");
                }else{
                    System.out.print(0 + " ");
                }
            }
            linePrintIndex++;
            columnPrintIndex--;
            System.out.println("\n");
        }
    }

    //#6
    /* Example of Straight Diagonal
     *    1 0 0
     *    0 1 0
     *    0 0 1
     */
    public static void printStraightDiagonal(String[][] array){

        int printIndex = 0;

        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                if(j == printIndex){
                    System.out.print(array[i][j] + " ");
                }else{
                    System.out.print(0 + " ");
                }
            }
            printIndex++;
            System.out.println("\n");
        }
    }

    //#7
    public static String[] findSideDiagonalElements(String[][] array){

        String[] diagonalElements;

        //find out size of line & size of column of array
        int [] sizeArray = findSizesOfBinaryStringArray(array);
        int lineSizeArray = sizeArray[0];
        int columnSizeArray = sizeArray[1];

        //find size of diagonalElements
        if(lineSizeArray > columnSizeArray)
            diagonalElements = new String[columnSizeArray];
        else
            diagonalElements = new String[lineSizeArray];

        //find Side Diagonal elements
        int linePrintIndex = 0;
        int columnPrintIndex = columnSizeArray - 1;

        for (int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                if(i == linePrintIndex && j == columnPrintIndex)
                    diagonalElements[i] = array[i][j];
            }
            linePrintIndex++;
            columnPrintIndex--;
        }

        return diagonalElements;
    }

    //#8
    public static String[] findStraightDiagonalElements(String[][] array){
        String[] diagonalElements;

        //find out size of line & size of column of array
        int [] sizeArray = findSizesOfBinaryStringArray(array);
        int lineSizeArray = sizeArray[0];
        int columnSizeArray = sizeArray[1];

        //find size of diagonalElements
        if(lineSizeArray > columnSizeArray)
            diagonalElements = new String[columnSizeArray];
        else
            diagonalElements = new String[lineSizeArray];

        //find StraightElementIndex
        int StraightElementIndex = 0;

        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                if(j == StraightElementIndex)
                    diagonalElements[i] = array[i][j];
            }
            StraightElementIndex++;
        }
        return diagonalElements;
    }

    //#9
    //chek is 2 String arrays equal
    public static boolean isArraysTheSame(String[] array1, String[] array2){
        boolean result = false;

        if(array1 == null || array2 == null)
            return result;

        if(array1.length != array2.length)
            return result;

        for(int i = 0; i < array1.length; i++){
            if(array1[i].equals(array2[i]))
                result = true;
            else {
                result = false;
            }
        }
        return result;
    }

    //#10
    //check String array; if String element == double number, put it into new double array
    public static double[] checkIfDoubleAndReturn(String[] array){
        //array that will be returned as a method result
        double[] doubleValues = new double[array.length];

        int letter = 0;
        double doubleNum = 0.0;
        boolean flag = true;

        //check if element == double
        for(int i = 0; i< array.length; i++){
            letter = StringArrayTests.returnASCINumberOfChar(array[i],0);
            System.out.println("letter in outer loop = " + letter);

            if(StringArrayTests.isASCINumber(letter)){
                System.out.println("Its a word, first letter in ASCI number is = " + letter);
                flag = false;
            }

            //put double in doubleValues array
            if(flag){
                doubleNum = Double.parseDouble(array[i]);
                doubleValues[i] = doubleNum;
            }
            flag = true;
        }
        return doubleValues;
    }

    //#11
    //check String array; if String element != double number, put it into new String array
    public static String[] checkIfStringAndReturnString(String[] array){
        //array that will be returned as a method result
        String[] stringValues = new String[array.length];

        int letter = 0;

        for(int i = 0; i < array.length; i++){
            letter = StringArrayTests.returnASCINumberOfChar(array[i], 0);
            System.out.println("letter in outer loop " + letter);

            if(StringArrayTests.isASCINumber(letter)){
                System.out.println("Its a word, first letter in ASCI number is = " + letter);
                stringValues[i] = array[i];
            }
        }
        return stringValues;
    }

    //#12
    public static int returnASCINumberOfChar(String word, int indexOfWord){
        //ASCI code numbers from A-Z to a-z
        int[] asciCodeNumbers = {65, 66 ,67, 68, 69, 70, 71, 72, 73, 74, 75,
                                 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86,
                                 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103,
                                 104, 105, 106, 107, 108, 109, 110, 111, 112, 113,
                                 114, 115, 116, 117, 118, 119, 120, 121, 122};

        int returnValue = word.charAt(indexOfWord);
        return returnValue;
    }

    //#13
    public static boolean isASCINumber(int number){
        //ASCI code numbers from A-Z to a-z
        int[] asciCodeNumbers = {65, 66 ,67, 68, 69, 70, 71, 72, 73, 74, 75,
                                 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86,
                                 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103,
                                 104, 105, 106, 107, 108, 109, 110, 111, 112, 113,
                                 114, 115, 116, 117, 118, 119, 120, 121, 122};
        boolean flag = false;

        for(int i = 0; i < asciCodeNumbers.length; i++){
            if(number == asciCodeNumbers[i]){
                flag = true;
                break;
            }
        }
        return flag;
    }

    //#14
    public static void printStringBuilderElement(String[] array){
        StringBuilder sb = new StringBuilder("");
        String temp = "";
        String separator = ", ";

        //concat Strings to StringBuilder using substring()
        for(int i = 0; i < array.length; i++){
            if(array[i] != null){
                temp = array[i].substring(2,4);
                sb.append(temp);
                sb.append(separator);
            }
        }

        System.out.println(sb);
    }

    //#15
    public static double[] roundDoubleNumbers(double[] array){
        double[] roundDoubleNumbers = new double[array.length];

        for(int i = 0; i < array.length; i++){
            if(array[i] > 1.7){
                roundDoubleNumbers[i] = Math.round(array[i]);
            }
            else{
                roundDoubleNumbers[i] = Math.floor(array[i]);
            }
        }
        return  roundDoubleNumbers;
    }

    //#16
    public  static String[][] createRandomWordsAndNumbers(String [][] array){
        String cutString = "";

        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                if (j == 0 || j % 3 == 0){
                    cutString = generateStringNumber();
                    cutString = cutString.substring(0, 7);
                    array[i][j] = cutString;
                }else {
                    array[i][j] = generateRandomString(6);
                }
            }
        }

        return array;
    }

    //#17
    public static String generateStringNumber(){
        double randomNum = 0.0;
        String randomWord = "";

        randomNum = (Math.random() * 10) + 1;
        randomWord = Double.toString(randomNum);

        return randomWord;
    }

    //#18
    public static String generateRandomString(int stringLength){
        StringBuilder randomString = new StringBuilder("");
        String returnString = "";
        int rand = 0;
        char ch = 'a';

        int[] asciCodeNumbers = {65, 66 ,67, 68, 69, 70, 71, 72, 73, 74, 75,
                76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86,
                87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103,
                104, 105, 106, 107, 108, 109, 110, 111, 112, 113,
                114, 115, 116, 117, 118, 119, 120, 121, 122};

        for(int i = 0; i < stringLength; i++){
            rand = (int)(Math.random() * 52);
            //System.out.println("rand = " + rand);
            ch = (char)asciCodeNumbers[rand];
            //System.out.println("ch = " + ch);
            randomString.append(ch);
        }
        returnString = randomString.toString();
        return returnString;
    }

}
