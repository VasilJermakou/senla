package com.vaer.robot;

import com.vaer.body.Body;
import com.vaer.head.Head;

import java.util.Objects;

public class RobotEngineer implements Robot{

    //class fields
    private Head head;
    private Body body;
    private String name;
    private RobotType robotType;

    //constructor
    public RobotEngineer(String name){
        this.name = name;
        this.robotType = RobotType.ROBOT_ENGINEER;
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
        return "RobotEngineer{" +
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
        RobotEngineer that = (RobotEngineer) o;
        return Objects.equals(head, that.head) && Objects.equals(body, that.body) && Objects.equals(name, that.name) && robotType == that.robotType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(head, body, name, robotType);
    }
}
