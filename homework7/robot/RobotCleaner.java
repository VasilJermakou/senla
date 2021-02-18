package homework7.robot;

import homework.ex7.body.Body;
import homework.ex7.head.Head;

import java.util.Objects;

public class RobotCleaner implements Robot {

    //class fields
    private Head head;
    private Body body;
    private String name;
    private RobotType robotType;

    //constructor
    public RobotCleaner(String name){
        this.name = name;
        this.robotType = RobotType.ROBOT_CLEANER;
    }

    //getters & setters
    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void greeting() {
        System.out.println("Greeting, everyone. My name is robot " + this.name + "!");
    }

    @Override
    public RobotType getRobotType() {
        return this.robotType;
    }

    @Override
    public String toString() {
        return "RobotCleaner{" +
                "head=" + head +
                ", body=" + body +
                ", name='" + name + '\'' +
                ", robotType=" + robotType +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RobotCleaner that = (RobotCleaner) o;
        return Objects.equals(head, that.head) && Objects.equals(body, that.body) && Objects.equals(name, that.name) && robotType == that.robotType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(head, body, name, robotType);
    }
}
