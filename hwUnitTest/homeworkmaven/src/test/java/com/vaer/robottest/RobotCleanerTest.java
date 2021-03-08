package com.vaer.robottest;

import com.vaer.robot.RobotCleaner;
import com.vaer.robot.RobotType;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

public class RobotCleanerTest {

    @Test
    public void greetingTest(){
        RobotCleaner robotCleaner = new RobotCleaner("Mr Proper");
        robotCleaner.greeting();
    }

    @Test
    public void getRobotTypeTest(){
        RobotCleaner robotCleaner = new RobotCleaner("Mr Proper");
        RobotType robotType = robotCleaner.getRobotType();
        assertThat(robotType, is(RobotType.ROBOT_CLEANER));
    }
}
