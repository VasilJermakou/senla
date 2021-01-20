package homework2.rainbow;

public class RainbowVersion2 {

    //default constructor
    public RainbowVersion2(){}

    //methods
    public void showOneColor(RainbowColors rainbowColors){
        switch (rainbowColors){
            case RED :
                System.out.print("red ");
                break;
            case ORANGE :
                System.out.print("orange ");
                break;
            case YELLOW :
                System.out.print("yellow ");
                break;
            case GREEN :
                System.out.print("green ");
                break;
            case BLUE :
                System.out.print("blue ");
                break;
            case INDIGO :
                System.out.print("indigo ");
                break;
            case PURPLE :
                System.out.print("purple ");
                break;
            default :
                System.out.print("Incorrect value!!!");
        }
    }

    public void showTwoColors(RainbowColors rainbowColors1, RainbowColors rainbowColors2 ){

        showOneColor(rainbowColors1);

        switch (rainbowColors2){
            case RED :
                System.out.println("red ");
                break;
            case ORANGE :
                System.out.println("orange ");
                break;
            case YELLOW :
                System.out.println("yellow ");
                break;
            case GREEN :
                System.out.println("green ");
                break;
            case BLUE :
                System.out.println("blue ");
                break;
            case INDIGO :
                System.out.println("indigo ");
                break;
            case PURPLE :
                System.out.println("purple ");
                break;
            default :
                System.out.println("Incorrect value ");
        }
    }

    //enum
    public enum RainbowColors{
        RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, PURPLE;
    }

    @Override
    public String toString() {
        return "Rainbow{}";
    }

}//class ends

