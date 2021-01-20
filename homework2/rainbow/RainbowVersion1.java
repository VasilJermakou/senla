package homework2.rainbow;

public class RainbowVersion1 {

    //class variables
    private final int RED = 1;
    private final int ORANGE = 2;
    private final int YELLOW = 3;
    private final int GREEN = 4;
    private final int BLUE = 5;
    private final int INDIGO = 6;
    private final int PURPLE = 7;

    //default constructor
    public RainbowVersion1(){}

    //getters
    public int getRED() {
        return RED;
    }

    public int getORANGE() {
        return ORANGE;
    }

    public int getYELLOW() {
        return YELLOW;
    }

    public int getGREEN() {
        return GREEN;
    }

    public int getBLUE() {
        return BLUE;
    }

    public int getINDIGO() {
        return INDIGO;
    }

    public int getPURPLE() {
        return PURPLE;
    }

    //methods
    public void showColor(int color){
        if(color == this.RED)
            System.out.print("red ");
        else if(color == this.ORANGE)
            System.out.print("orange ");
        else if(color == this.YELLOW)
            System.out.print("yellow ");
        else if(color == this.GREEN)
            System.out.print("green ");
        else if(color == this.BLUE)
            System.out.print("blue ");
        else if(color == this.INDIGO)
            System.out.print("indigo ");
        else if(color == this.PURPLE)
            System.out.print("purple ");
        else
            System.out.println("Incorrect value, enter number from 1 to 7!");
    }

    //overloading method showColor(int color)
    public void showColor(int color1, int color2){
        showColor(color1);
        switch (color2){
            case RED :
                System.out.println("- red ");
                break;
            case ORANGE :
                System.out.println("- orange ");
                break;
            case YELLOW :
                System.out.println("- yellow ");
                break;
            case GREEN :
                System.out.println("- green ");
                break;
            case BLUE :
                System.out.println("- blue ");
                break;
            case INDIGO :
                System.out.println("- indigo ");
                break;
            case PURPLE :
                System.out.println("- purple ");
                break;
            default :
                System.out.println("Incorrect value, enter number from 1 to 7!");
        }
    }

    //overriding toString()
    @Override
    public String toString() {
        return "RainbowVersion1{" +
                "RED=" + RED +
                ", ORANGE=" + ORANGE +
                ", YELLOW=" + YELLOW +
                ", GREEN=" + GREEN +
                ", BLUE=" + BLUE +
                ", INDIGO=" + INDIGO +
                ", PURPLE=" + PURPLE +
                '}';
    }
}//end class
