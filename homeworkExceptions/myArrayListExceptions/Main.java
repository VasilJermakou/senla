package homeworkExceptions.myArrayListExceptions;

public class Main {

    public static void main(String[] args) {

        MyArrayList<Integer> list1 = new MyArrayList<>();

        try{
            //#1 add()
            list1.add(0, 1);
            list1.add(1, 2);
            list1.add(2, 3);
            //list1.add(-1, 1);             // Invalid index value: only positive numbers or zero
            System.out.println(list1);

            //#4 lastIndexOf()
            int result = list1.lastIndexOf(3);
            System.out.println("Last index of 3 = " + result);  //2

            result = list1.lastIndexOf(null);
            System.out.println("Last index of 3 = " + result);  //Incorrect parameter

            System.out.println(list1);

        }catch (IndexException | IncorrectParametrException exception){
            System.out.println("Ups, Huston, we have a problem ... \n" + exception);
        }

    }//main ends
}//class ends
