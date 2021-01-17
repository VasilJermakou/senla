package homework1;

public class Main {

    //static primitive variables
    public static byte staticSimpleByteNum = -10;
    public static short staticSimpleShortNum = -10_000;
    public static int staticSimpleIntNum = -1_000_000;
    public static long staticSimpleLongNum = -1_000_000_000L;
    public static float staticSimpleFloatNum = -150.50f;
    public static double staticSimpleDoubleNum = -100_000.50d;
    public static char staticSimpleChar = 'C';
    public static boolean staticSimpleBoolean = false;

    //static Wrapper class variables
    public static Byte staticObjectByteNum = -20;
    public static Short staticObjectShortNum = -20_000;
    public static Integer staticObjectIntegerNum = -20_000_000;
    public static Long staticObjectLongNum = -20_000_000_000L;
    public static Float staticObjectFloatNum = -200.50f;
    public static Double staticObjectDoubleNum = -200_000.50d;
    public static Character staticObjectCharacter = 'D';
    public static Boolean staticObjectBoolean = true;


    //main method
    public static void main(String[] args) {

        /*
        *       HomeWork #1
        * */

        /**
         *   byte      1 byte - 128 /127
         *   short     2 byte - 32 768 / 32 767
         *   int       4 byte - 2 147 483 648 / 2 147 483 647
         *   long      8 byte - 9 223 372 036 854 775 808 / 9 223 372 036 854 775 807
         *   float     4 byte  fractional values
         *   double    8 byte  fractional values
         *   char      2 byte  ASCII values
         *   boolean   1 byte  true / false value
         * */

        //create Number object
        Number number1 = new Number();

        //print default values (primitives & Wrapper class numbers)
        System.out.println(number1.getSimpleByteNum());  //10
        System.out.println(number1.getSimpleShortNum()); //10_000
        System.out.println(number1.getSimpleIntNum());   //1_000_000
        System.out.println(number1.getSimpleLongNum());  //1_000_000_000
        System.out.println(number1.getSimpleFloatNum()); //100.5
        System.out.println(number1.getSimpleDoubleNum());//100_000.5
        System.out.println(number1.getSimpleChar());     //A
        System.out.println(number1.getSimpleBoolean());  //false

        System.out.println("**************************");

        System.out.println(number1.getObjectByteNum());   //15
        System.out.println(number1.getObjectShortNum());  //15_000
        System.out.println(number1.getObjectIntegerNum());//15_000_000
        System.out.println(number1.getObjectLongNumber());//15_000_000_000
        System.out.println(number1.getObjectFloatNum());  //150.5
        System.out.println(number1.getObjectDoubleNum()); //150_000.5
        System.out.println(number1.getObjectCharacter()); //B
        System.out.println(number1.getObjectBoolean());   //true

        System.out.println("**************************");

        System.out.println(Main.staticSimpleByteNum);     //-10
        System.out.println(Main.staticSimpleShortNum);    //-10_000
        System.out.println(Main.staticSimpleIntNum);      //-1_000_000
        System.out.println(Main.staticSimpleLongNum);     //-1_000_000_000
        System.out.println(Main.staticSimpleFloatNum);    //-150.50
        System.out.println(Main.staticSimpleDoubleNum);   //-100_000.50
        System.out.println(Main.staticSimpleChar);        //C
        System.out.println(Main.staticSimpleBoolean);     //false

        System.out.println("**************************");

        System.out.println(Main.staticObjectByteNum);     //-20
        System.out.println(Main.staticObjectShortNum);    //-20_000
        System.out.println(Main.staticObjectIntegerNum);  //-20_000_000
        System.out.println(Main.staticObjectLongNum);     //-20_000_000_000
        System.out.println(Main.staticObjectFloatNum);    //-200.50
        System.out.println(Main.staticObjectDoubleNum);   //-200_000.50
        System.out.println(Main.staticObjectCharacter);   //D
        System.out.println(Main.staticObjectBoolean);     //true

        System.out.println("**************************");

        //different math operations with variables

        int intTemp = number1.getSimpleShortNum() + number1.getSimpleByteNum();
        System.out.println("intTemp =" + intTemp);  //100_10

        byte byteTemp = 0;
        //byteTemp = number1.getSimpleByteNum() + number1.getSimpleShortNum();     //ошибка, переполнение

        intTemp = number1.getSimpleIntNum() + number1.getSimpleShortNum();
        System.out.println("intTemp = " + intTemp); //1_010_000

        intTemp = number1.getSimpleIntNum() + (int)number1.getSimpleLongNum();
        System.out.println("intTemp = " + intTemp); //casting to int -> 1_001_000_000

        intTemp = (int)number1.getSimpleFloatNum() + (int)number1.getSimpleDoubleNum();
        System.out.println("intTemp = " + intTemp); //100_100, casting to inе with data loss

        double doubleTemp = number1.getSimpleIntNum() + number1.getSimpleByteNum();
        System.out.println("doubleTemp =" + doubleTemp); //1_000_000.0

        //intTemp = number1.getSimpleIntNum() + number1.getSimpleBoolean();       //ошибка, неправильный тип данных

        char charTemp = 'a';
        //charTemp = number1.getSimpleChar() + (char) number1.getSimpleByteNum(); //ошибка, неправильный тип данных

        charTemp = (char)(number1.getSimpleChar() + (char)'J');
        System.out.println("charTemp = " + charTemp); //symbol at ASCII table with number 139 (A = 65 + J = 74)

        charTemp = (char)(number1.getSimpleChar() - 10);
        System.out.println("charTemp = " + charTemp);  // '7' -> ('A' at ASCII = 65, - 10 -> '7' at ASCII = 55)

        boolean booleanTemp = false;
        //booleanTemp = number1.getSimpleBoolean() + 1; //ошибка компиляции

        //booleanTemp = false + true; //ошибка, оператор + нельзя применять к boolean переменным

        //booleanTemp = number1.getSimpleBoolean() + number1.getObjectBoolean();  //ошибка, оператор + нельзя применять к boolean переменным

        booleanTemp = number1.getObjectBoolean();
        System.out.println("booleanTemp = " + booleanTemp);  //true -> unboxing

        intTemp = number1.getSimpleIntNum() + Main.staticSimpleIntNum;
        System.out.println("intTemp = " + intTemp); // 1_000_000 - 1_000_000

        Main.staticSimpleIntNum = Main.staticSimpleIntNum + number1.getSimpleIntNum();
        System.out.println("staticSimpleIntNum = " + Main.staticSimpleIntNum); // 0  -> -1_000_000 + 1_000_000
        Main.staticSimpleIntNum = - 1_000_000;

        //static int dontCreatebleVar = 0;
        //System.out.println(dontCreatebleVar + Main.staticSimpleIntNum);       //we can not create static variables in methods

        System.out.println(number1.getObjectIntegerNum() * number1.getObjectIntegerNum()); //15_000_000 * 15_000_000 = -451_735_552   -> переполнение, int by default

        long longTemp = ((long)number1.getObjectIntegerNum() * (long)number1.getObjectIntegerNum());
        System.out.println("longTemp = " + longTemp); //225_000_000_000_000 // make casting to long


    }//main ends
}//class ends



class Number{

    //class variables

    //primitive variables
    private byte simpleByteNum = 10;
    private short simpleShortNum = 10_000;
    private int simpleIntNum = 1_000_000;
    private long simpleLongNum = 1_000_000_000L;
    private float simpleFloatNum = 100.50f;
    private double simpleDoubleNum = 100_000.50d;
    private char simpleChar = 'A';
    private boolean simpleBoolean = false;

    //Wrapper Class variables
    private Byte objectByteNum = 15;
    private Short objectShortNum = 15_000;
    private Integer objectIntegerNum = 15_000_000;
    private Long objectLongNumber = 15_000_000_000L;
    private Float objectFloatNum = 150.50f;
    private Double objectDoubleNum = 150_000.50d;
    private Character objectCharacter = 'B';
    private Boolean objectBoolean = true;

    //constructor without parameters
    public Number(){
        System.out.println("Number object created");
    }

    //getters & setters for primitives
    public byte getSimpleByteNum(){
        return this.simpleByteNum;
    }

    public void setSimpleByteNum(byte num){
        this.simpleByteNum = num;
    }

    public short getSimpleShortNum(){
        return this.simpleShortNum;
    }

    public void setSimpleShortNum(short num){
        this.simpleShortNum = num;
    }

    public int getSimpleIntNum(){
        return this.simpleIntNum;
    }

    public void setSimpleIntNum(int num){
        this.simpleIntNum = num;
    }

    public long getSimpleLongNum(){
        return this.simpleLongNum;
    }

    public void setSimpleLongNum(long num){
        this.simpleLongNum = num;
    }

    public float getSimpleFloatNum(){
        return this.simpleFloatNum;
    }

    public void setSimpleFloatNum(float num){
        this.simpleFloatNum = num;
    }

    public double getSimpleDoubleNum(){
        return this.simpleDoubleNum;
    }

    public void setSimpleDoubleNum(double num){
        this.simpleDoubleNum = num;
    }

    public char getSimpleChar(){
        return this.simpleChar;
    }

    public void setSimpleChar(char ch){
        this.simpleChar = ch;
    }

    public boolean getSimpleBoolean(){
        return this.simpleBoolean;
    }

    public void setSimpleBoolean(boolean b){
        this.simpleBoolean = b;
    }

    //getters & setters for Wrapper class variables

    public Byte getObjectByteNum(){
        return this.objectByteNum;
    }

    public void setObjectByteNum(Byte objectByteNum){
        this.objectByteNum = objectByteNum;
    }

    public Short getObjectShortNum(){
        return this.objectShortNum;
    }

    public void setObjectShortNum(Short objectShortNum){
        this.objectShortNum = objectShortNum;
    }

    public Integer getObjectIntegerNum(){
        return this.objectIntegerNum;
    }

    public void setObjectIntegerNum(Integer objectIntegerNum){
        this.objectIntegerNum = objectIntegerNum;
    }

    public Long getObjectLongNumber(){
        return this.objectLongNumber;
    }

    public void setObjectLongNumber(Long objectLongNumber){
        this.objectLongNumber = objectLongNumber;
    }

    public Float getObjectFloatNum(){
        return this.objectFloatNum;
    }

    public void setObjectFloatNum(Float objectFloatNum){
        this.objectFloatNum = objectFloatNum;
    }

    public Double getObjectDoubleNum(){
        return this.objectDoubleNum;
    }

    public void setObjectDoubleNum(Double objectDoubleNum){
        this.objectDoubleNum = objectDoubleNum;
    }

    public Character getObjectCharacter(){
        return this.objectCharacter;
    }

    public void setObjectCharacter(Character objectCharacter){
        this.objectCharacter = objectCharacter;
    }

    public Boolean getObjectBoolean(){
        return this.objectBoolean;
    }

    public void setObjectBoolean(Boolean objectBoolean){
        this.objectBoolean = objectBoolean;
    }

    //override toString method
    @Override
    public String toString() {
        return "Number{" +
                "simpleByteNum=" + simpleByteNum +
                ", simpleShortNum=" + simpleShortNum +
                ", simpleIntNum=" + simpleIntNum +
                ", simpleLongNum=" + simpleLongNum +
                ", simpleFloatNum=" + simpleFloatNum +
                ", simpleDoubleNum=" + simpleDoubleNum +
                ", simpleChar=" + simpleChar +
                ", simpleBoolean=" + simpleBoolean +
                ", objectByteNum=" + objectByteNum +
                ", objectShortNum=" + objectShortNum +
                ", objectIntegerNum=" + objectIntegerNum +
                ", objectLongNumber=" + objectLongNumber +
                ", objectFloatNum=" + objectFloatNum +
                ", objectDoubleNum=" + objectDoubleNum +
                ", objectCharacter=" + objectCharacter +
                ", objectBoolean=" + objectBoolean +
                '}';
    }
}//class ends