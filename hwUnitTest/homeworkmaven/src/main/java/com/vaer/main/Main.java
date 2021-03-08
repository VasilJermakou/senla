package com.vaer.main;

import com.vaer.body.Body;
import com.vaer.body.CarboneBody;
import com.vaer.body.IronBody;
import com.vaer.body.PlasticBody;
import com.vaer.head.Head;
import com.vaer.head.LargeHead;
import com.vaer.head.MiddleHead;
import com.vaer.head.SmallHead;
import com.vaer.robot.RobotCleaner;
import com.vaer.robot.RobotEngineer;
import com.vaer.robot.RobotGuard;

public class Main {

    public static void main(String[] args) {

        /**
         * HomeWork #7
         * Create two factories for the production of robots (there can be three variants of robots),
         * each robot can have three variants of heads. The first plant makes robot bodies,
         * the second plant makes robot heads. Create a robot object that has a head and body.
         * The robot also has a name.
         * Display the created robots (of different types) to the console with the names of the parts
         * that were created. Use enumerations, interfaces, overriding method toString().
         * Use generics and nested classes as desired.
         * */

        //creating robot
        RobotGuard guardRobot = new RobotGuard("Verter");
        guardRobot.greeting();
        //System.out.println(guardRobot.toString());

        //creating head
        Head smallHead = new SmallHead();

        //creating head factory
        Fabric<Head> headFabric = new Fabric<>();
        RobotGuard finalizedRobotGuard1 = (RobotGuard) headFabric.createInstance(guardRobot, smallHead);
        finalizedRobotGuard1.getHead().printHeadType();

        //creating body
        Body plasticBody = new PlasticBody();

        //creating body factory
        Fabric<Body> bodyFabric = new Fabric<>();
        finalizedRobotGuard1 = (RobotGuard) bodyFabric.createInstance(guardRobot, plasticBody);
        finalizedRobotGuard1.getBody().printBodyType();

        System.out.println("========================================");

        //creating robots
        RobotCleaner cleanerRobot = new RobotCleaner("Mr. Proper");
        RobotEngineer engineerRobot = new RobotEngineer("MaxWell");

        //creating heads
        Head middleHead = new MiddleHead();
        Head largeHead = new LargeHead();


        //creating bodies
        Body ironBody = new IronBody();
        Body carboneBody = new CarboneBody();

        //assembly of robots using factories
        RobotCleaner finalizedRobotCleaner1 = (RobotCleaner)headFabric.createInstance(cleanerRobot, middleHead);
        RobotEngineer finalizedRobotEngineer1 = (RobotEngineer)headFabric.createInstance(engineerRobot, largeHead);
        finalizedRobotCleaner1 = (RobotCleaner)bodyFabric.createInstance(cleanerRobot, ironBody);
        finalizedRobotEngineer1 = (RobotEngineer)bodyFabric.createInstance(engineerRobot, carboneBody);


        //print messages of instances
        finalizedRobotCleaner1.greeting();
        finalizedRobotCleaner1.getBody().printBodyType();
        finalizedRobotCleaner1.getHead().printHeadType();

        System.out.println("========================================");

        finalizedRobotEngineer1.greeting();
        finalizedRobotEngineer1.getBody().printBodyType();
        finalizedRobotEngineer1.getHead().printHeadType();

    }
}
