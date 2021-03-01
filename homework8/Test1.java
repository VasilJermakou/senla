package homework8;

import java.util.*;

public class Test1 {
    public static void main(String[] args) {

        Integer[] intArray = new Integer[3];
        intArray[0] = 1;
        intArray[1] = 2;
        intArray[2] = 3;

        String[] stringArray = new String[3];
        stringArray[0] = "One";
        stringArray[1] = "Two";
        stringArray[2] = "Three";

        MyArrayList<Integer> integers = new MyArrayList<>(intArray);
        System.out.println(integers.toString());

        MyArrayList<String> strings = new MyArrayList<>(stringArray);
        System.out.println(strings.toString());

        MyArrayList<String> testString = new MyArrayList<>();
        System.out.println(testString.toString());

        testString.add(3, "One");
        System.out.println(testString.toString());
        testString.add(0, "first");
        System.out.println(testString.toString());

        MyArrayList<Integer> testInteger = new MyArrayList<>();
        System.out.println(testInteger.toString());

        testInteger.add(2, 3);
        System.out.println(testInteger.toString());
        testInteger.add(0, 1);
        System.out.println(testInteger.toString());
        System.out.println("\nget(index) testing:");
        System.out.println(testInteger.get(5));
        System.out.println(testInteger.toString());

        //#3 test

        System.out.println("#3 test  ==================");

        MyArrayList<String> testString2 = new MyArrayList<>();
        testString2.add(0,"One");
        testString2.add(1,"Three");
        testString2.add(2,"Three");
        System.out.println(testString2.toString());
        int result = testString2.indexOf("Three");
        System.out.println(result);

        //#4 test

        System.out.println("#4 test  ==================");

        MyArrayList<String> testString3 = new MyArrayList<>();
        testString3.add(0,"One");
        //testString3.add(1,"Three");
        //testString3.add(2,"Three");
        //testString3.add(3,"Three");
        System.out.println(testString3.toString());
        result = testString3.lastIndexOf("Three");
        System.out.println(result);

        //#5 test

        System.out.println("#5 test  ==================");

        List<String> lis = new ArrayList<>();
        lis.add("One");
        lis.add("Two");
        lis.add("Three");
        System.out.println(lis.toString());

        Iterator<String> stringIterator = lis.listIterator();
        while (stringIterator.hasNext()){
            System.out.println(stringIterator.next());
        }

        System.out.println("Testing myListIterator");

        MyArrayList<String> testString4 = new MyArrayList<>();
        testString4.add(0,"One");
        testString4.add(1,"Two");
        testString4.add(2,"Three");

        MyListIterator<String> myListIterator = testString4.myListIterator();
        while (myListIterator.hasNext()){
            System.out.println(myListIterator.next());
        }

        //#7 test

        System.out.println("#7 test  ==================");
        System.out.println(testString4.toString());
        testString4.set(2, "overflow");
        System.out.println(testString4.toString());


        //#8 test !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

        System.out.println("#8 test  ==================");

        MyArrayList<Integer> intList = new MyArrayList<>();
        intList.add(0, 1);
        intList.add(1, 3);
        intList.add(2, 2);

        System.out.println(intList.toString());
        //intList.sort((a,b) -> a.compareTo(b));
        System.out.println(intList.toString());

        List<String > lst = new ArrayList<>();
        lst.add("A");
        lst.add("C");
        lst.add("B");
        System.out.println(lst.toString());
        lst.sort((a, b) -> a.compareTo(b));
        System.out.println(lst.toString());

        //#6

        System.out.println("#6 test  ==================");

        MyArrayList<String> strm = (MyArrayList<String>) MyArrayList.of("One", "Two");
        System.out.println(strm.toString());

        //#9
        System.out.println("#9 test  ==================");

        MyArrayList<Integer> intList2 = new MyArrayList<>();
        intList2.add(0, 1);
        intList2.add(1, 2);
        intList2.add(2, 3);
        System.out.println(intList2.toString());
        MyArrayList<Integer> intList3 = (MyArrayList<Integer>) intList2.subList(0,2);
        System.out.println(intList3.toString());

        System.out.println("BubbleSort test  ==================");
        Integer[] in = new Integer[5];
        in[0] = 1;
        in[1] = 3;
        in[2] = 2;
        in[3] = 5;
        in[4] = 4;

        Test1.printArray(in);
        Test1.bubbleSort(in);
        System.out.println("\n");
        Test1.printArray(in);



    }//main ends

    public static Integer[] bubbleSort(Integer[] arr){
        Integer[] temp = arr;
        int n = arr.length;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n-i - 1; j++){
                if(temp[j] > temp[j + 1]){
                    int box = temp[j];
                    temp[j] = temp[j + 1];
                    temp[j + 1] = box;
                }
            }
        }

        return temp;
    }

    public static <E extends Number> void printArray(E[] arr){
        for(E e : arr)
            System.out.print(e + " ");
    }
}
