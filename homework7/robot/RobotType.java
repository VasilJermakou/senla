package homework7.robot;

public enum RobotType {

    ROBOT_GUARD("My goal is your safety"),
    ROBOT_CLEANER("Everywhere is pure where i am"),
    ROBOT_ENGINEER("If I'm near everything will work");

    private String message;

    private RobotType(String message){
        this.message = message;
    }

    public String getMessage(){
        return this.message;
    }
}
