package Container;

public class TestContainer {

    public static void main(String[] args) {

        SquareContainer squareContainer = new SquareContainer();
        System.out.println(squareContainer.isContainerEmpty());
        System.out.println(squareContainer.getForm());
        System.out.println(squareContainer.getDiagonal());
        System.out.println(squareContainer.getHeight());

        System.out.println("-------------------");

        SquareContainer squareContainer1 = new SquareContainer(50,20);
        System.out.println(squareContainer1.getForm());
        System.out.println(squareContainer1.getHeight());
        System.out.println(squareContainer1.getDiagonal());
        System.out.println(squareContainer1.getWaterType());

        System.out.println("-------------------");

        SquareContainer squareContainer2 = new SquareContainer(20,20,WaterType.HEAVY);
        System.out.println(squareContainer2.getForm());
        System.out.println(squareContainer2.getHeight());
        System.out.println(squareContainer2.getDiagonal());
        System.out.println(squareContainer2.getWaterType());
        System.out.println(squareContainer2.countVolume());

        System.out.println("-------------------");

        CylinderContainer cylinderContainer = new CylinderContainer();
        System.out.println(cylinderContainer.isContainerEmpty());
        System.out.println(cylinderContainer.getForm());
        System.out.println(cylinderContainer.getDiagonal());
        System.out.println(cylinderContainer.getHeight());
        System.out.println(cylinderContainer.countVolume());

        System.out.println("-------------------");

        CylinderContainer cylinderContainer1 = new CylinderContainer(60, 20, WaterType.LIGHT);
        System.out.println(cylinderContainer1.isContainerEmpty());
        System.out.println(cylinderContainer1.getForm());
        System.out.println(cylinderContainer1.getDiagonal());
        System.out.println(cylinderContainer1.getHeight());
        System.out.println(cylinderContainer1.countVolume());
        System.out.println(cylinderContainer1.getWaterType());
        cylinderContainer1.fillContainer(WaterType.HEAVY);
        System.out.println(cylinderContainer1.getWaterType());

        System.out.println("-------------------");

        ConeContainer coneContainer = new ConeContainer();
        System.out.println(coneContainer.isContainerEmpty());
        System.out.println(coneContainer.getForm());
        System.out.println(coneContainer.getDiagonal());
        System.out.println(coneContainer.getHeight());
        System.out.println(coneContainer.countVolume());

        System.out.println("-------------------");

        ConeContainer coneContainer1 = new ConeContainer(70, 20, WaterType.HEAVY);
        System.out.println(coneContainer1.isContainerEmpty());
        System.out.println(coneContainer1.getForm());
        System.out.println(coneContainer1.getDiagonal());
        System.out.println(coneContainer1.getHeight());
        System.out.println(coneContainer1.countVolume());
        System.out.println(coneContainer1.getWaterType());
        coneContainer1.fillContainer(WaterType.LIGHT);
        System.out.println(coneContainer1.getWaterType());

        System.out.println("-------------------");
        Container container = new ConeContainer(65,20,WaterType.LIGHT);
        System.out.println(container.countVolume());
        container = new SquareContainer(75,20, WaterType.HEAVY);
        System.out.println(container.countVolume());







    }//main ends
}//class ends
