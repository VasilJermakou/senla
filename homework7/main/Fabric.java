package homework7.main;

import homework.ex7.body.Body;
import homework.ex7.head.Head;
import homework.ex7.robot.*;

public class Fabric <T1>{

    public Robot createInstance(Robot robot, T1 element){

        if(robot.getRobotType() == RobotType.ROBOT_GUARD){
                if(element instanceof Head){
                    Head head = (Head) element;
                    ((RobotGuard) robot).setHead(head);
                }

                if(element instanceof Body){
                    Body body = (Body) element;
                    ((RobotGuard) robot).setBody(body);
                }
        }

        if(robot.getRobotType() == RobotType.ROBOT_CLEANER){
            if(element instanceof Head){
                Head head = (Head) element;
                ((RobotCleaner) robot).setHead(head);
            }

            if(element instanceof Body){
                Body body = (Body) element;
                ((RobotCleaner) robot).setBody(body);
            }
        }

        if(robot.getRobotType() == RobotType.ROBOT_ENGINEER){
            if(element instanceof Head){
                Head head = (Head) element;
                ((RobotEngineer) robot).setHead(head);
            }

            if(element instanceof Body){
                Body body = (Body) element;
                ((RobotEngineer) robot).setBody(body);
            }
        }

        return robot;
    }

}
