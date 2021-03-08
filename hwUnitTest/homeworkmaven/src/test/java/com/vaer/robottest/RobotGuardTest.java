package com.vaer.robottest;

import com.vaer.robot.RobotGuard;
import com.vaer.robot.RobotType;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

public class RobotGuardTest {

    @Test
    public void greetingTest(){
        RobotGuard robotGuard = new RobotGuard("Terminator");
        robotGuard.greeting();
    }

    @Test
    public void getRobotTypeTest(){
        RobotGuard robotGuard = new RobotGuard("Terminator");
        RobotType robotType = robotGuard.getRobotType();
        assertThat(robotType, is(RobotType.ROBOT_GUARD));
    }
}
