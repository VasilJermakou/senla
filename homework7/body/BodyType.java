package homework7.body;

public enum BodyType {

    //fields
    PLASTIC_BODY("Material clear from childhood"),
    IRON_BODY("Iron is never enough"),
    CARBONE_BODY("Lightweight and durable");

    private String message;

    //constructor
    private BodyType(String message){
        this.message = message;
    }

    //getter
    public String getMessage(){
        return this.message;
    }
}
