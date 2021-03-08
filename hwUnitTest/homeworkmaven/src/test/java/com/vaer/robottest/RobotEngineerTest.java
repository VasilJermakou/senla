package com.vaer.robottest;

import com.vaer.robot.RobotEngineer;
import com.vaer.robot.RobotType;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

public class RobotEngineerTest {

    @Test
    public void greetingTest(){
        RobotEngineer robotEngineer = new RobotEngineer("Verter");
        robotEngineer.greeting();
    }

    @Test
    public void getRobotTypeTest(){
        RobotEngineer robotEngineer = new RobotEngineer("Verter");
        RobotType robotType = robotEngineer.getRobotType();
        assertThat(robotType, is(RobotType.ROBOT_ENGINEER));
    }
}
