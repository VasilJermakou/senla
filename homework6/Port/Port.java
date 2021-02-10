package Port;

import Container.*;
import Deck.*;
import Ship.*;

import java.util.Arrays;

public class Port {

    //class fields
    private Ship[] ships;

    //constructor
    private Port(){
        this.ships = new Ship[10];
    }

    private Port(Ship ship){
        this.ships = new Ship[10];
        this.ships[0] = ship;
    }

    private Port(Ship[] ships){
        this.ships = new Ship[10];
        for(int i = 0; i < ships.length; i++){
            this.ships[i] = ships[i];
        }
    }

    //factory methods
    public static Port createPort(){
        Port port = new Port();
        return port;
    }

    public static Port createPort(Ship ship){
        Port port = new Port(ship);
        return port;
    }

    public  static Port createPort(Ship[] ships){
        Port port = new Port(ships);
        return port;
    }

    //getters
    public Ship[] getShips() {
        return ships;
    }

    //methods
    // m = p * V     -> m - масса, p - плотность, -> V - объем
    public static double countTheMassOfWater(Ship[] ships){
        double totalWaterMass = 0.0;
        double tempCounter = 0.0;
        double tempVolume = 0.0;
        int densityOfWater = 0;

        for (int i = 0; i < ships.length; i++){
            if(ships[i] != null){
                tempVolume = ships[i].getDeck().getContainers()[i].countVolume();
                densityOfWater = ships[i].getDeck().getContainers()[i].getWaterType().getWaterValue();
                tempCounter = tempVolume * densityOfWater;
                totalWaterMass += tempCounter;
            }
        }

        return totalWaterMass;
    }

    //object methods
    @Override
    public String toString() {
        return "Port{" +
                "ships=" + Arrays.toString(ships) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Port port = (Port) o;
        return Arrays.equals(ships, port.ships);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(ships);
    }


}//class ends
