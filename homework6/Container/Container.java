package Container;

import java.util.Objects;

public abstract class Container {

    //class fields
    private ContainerForm form = ContainerForm.NO_FORM;
    private double height = 100.0;
    private double diagonal = 20.0;
    private WaterType waterType = WaterType.NO_WATER;
    //private boolean isContainerEmpty = true;

    //constructors
    public  Container(){}

    public Container(ContainerForm form, double height, double diagonal){
        this.form = form;
        this.height = height;
        this.diagonal = diagonal;
    }

    public Container(ContainerForm form, double height, double diagonal, WaterType waterType){
        this(form, height, diagonal);
        this.waterType = waterType;
    }

    //getters
    public ContainerForm getForm(){
        return this.form;
    }

    public double getHeight() {
        return this.height;
    }

    public double getDiagonal() {
        return this.diagonal;
    }

    public WaterType getWaterType(){
        return this.waterType;
    }

    //setters
    public void setWaterType(WaterType waterType){
        this.waterType = waterType;
    }

    //methods
    public boolean isContainerEmpty(){
        boolean result;
        if(waterType == WaterType.LIGHT || waterType == WaterType.HEAVY)
            result = false;
        else
            result = true;

        return result;
    }

    public void fillContainer(WaterType waterType){
        this.waterType = waterType;
    }

    //abstract methods
    public abstract double countVolume();

    //object methods
    @Override
    public String toString() {
        return "Container {" +
                "form=" + form +
                ", height=" + height +
                ", diagonal=" + diagonal +
                ", waterType=" + waterType +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Container container = (Container) o;
        return Double.compare(container.height, height) == 0 && Double.compare(container.diagonal, diagonal) == 0 && form == container.form && waterType == container.waterType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(form, height, diagonal, waterType);
    }
}//class ends
