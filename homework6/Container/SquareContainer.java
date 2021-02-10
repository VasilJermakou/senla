package Container;

public class SquareContainer extends Container {

    //constructors
    public SquareContainer(){
        super();
    }

    public SquareContainer(double height, double diagonal){
        super(ContainerForm.SQUARE, height, diagonal);
    }

    public SquareContainer(double height, double diagonal, WaterType waterType){
        super(ContainerForm.SQUARE, height, diagonal, waterType);
    }

    //methods
    @Override
    public double countVolume(){
        double result = super.getDiagonal() / Math.sqrt(2);
        result = Math.pow(result, 3);
        return  result;
    }

}//class ends
