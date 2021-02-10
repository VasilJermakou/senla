package Container;

public enum WaterType {

    //enum fields
    LIGHT(1000),
    HEAVY(2000),
    NO_WATER(0);

    private int waterValue;

    //enum private constructor
    private WaterType(int waterValue){
        this.waterValue = waterValue;
    }

    public int getWaterValue(){
        return this.waterValue;
    }

}
