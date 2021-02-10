package Container;

public class ConeContainer extends Container {

    //constructors
    public ConeContainer(){
        super();
    }

    public ConeContainer(double height, double diagonal){
        super(ContainerForm.CONE, height, diagonal);
    }

    public ConeContainer(double height, double diagonal, WaterType waterType){
        super(ContainerForm.CONE, height, diagonal, waterType);
    }

    //methods
    @Override
    public double countVolume(){
        double circleRadius = (super.getDiagonal() / 2);
        double circleSquare = Math.pow(circleRadius, 2) * Math.PI;
        double coneVolume = (super.getHeight() / 3) * circleSquare;
        return coneVolume;
    }

}//class ends
