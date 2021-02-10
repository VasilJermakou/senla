package Container;

public class CylinderContainer extends Container {

    //constructors
    public  CylinderContainer(){
        super();
    }

    public CylinderContainer(double height, double diagonal){
        super(ContainerForm.CYLINDER, height, diagonal);
    }

    public CylinderContainer(double height, double diagonal, WaterType waterType){
        super(ContainerForm.CYLINDER, height, diagonal, waterType);
    }

    //methods
    @Override
    public double countVolume(){
        double circleRadius = (super.getDiagonal() / 2);
        double circleSquare = Math.pow(circleRadius, 2) * Math.PI;
        double cylinderVolume = circleSquare * super.getHeight();
        return cylinderVolume;
    }

}
