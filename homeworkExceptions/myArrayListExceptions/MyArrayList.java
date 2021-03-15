package homeworkExceptions.myArrayListExceptions;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;

public class MyArrayList<E> implements MyList<E> {

    //class fields
    private E[] values;

    //constructors
    public MyArrayList(){
        this.values = (E[]) new Object[0];
    }

    public MyArrayList(Collection<? extends E> col){
        this.values = (E[])new Object[col.size()];
        E[] temp = this.values;//E[])new Object[col.size()];
        col.toArray(temp);
        for(int i = 0; i < values.length; i++){
            values[i] = temp[i];
        }
    }

    public MyArrayList(E[] ar){
        this.values = (E[])new Object[ar.length];
        for(int i = 0; i < values.length; i++) {
            values[i] = ar[i];
        }
    }


    //methods
    //#1
    /**
     * @params int index - number of index in collection
     * @params E object - object which we want to put in
     * collection under the index
     * */
    @Override
    public void add(int index, E object){

        if(index < 0)
            throw new IndexException("Invalid index value: only positive numbers or zero");

        if(values.length == 0){
            if(index == 0){
                this.values = (E[])new Object[1];
                values[index] = object;
                return;
            }

            if(index > 0){
                this.values = (E[])new Object[index + 1];
                values[index] = object;
                MyArrayList.fillEmptySpaceInArray(this.values);
                return;
            }
        }

        if(index >= values.length){
            E[] temp = (E[])new Object[index + 1];
            for (int i = 0; i < values.length; i++){
                temp[i] = values[i];
            }
            MyArrayList.fillEmptySpaceInArray(this.values);
            temp[index] = object;
            this.values = temp;
            temp = null;
        }
    }

    //util method (used at least in method add(int index, E object) #1)
    /**
     * @params E[] array - array, which contains values of type E
     * and nulls.
     * Method replace nulls with the following values:
     * if E instance of String - "zero"
     * if E instance of Integer - 0
     * if E instance of Double or Float - 0
     * if E instance of Long - 0
     * if E instance of Character - '0'
     * */
    public static <E> E[] fillEmptySpaceInArray(E[] array){
        E temp = null;
        for(int i = 0; i < array.length; i++){
            if(array[i] != null){
                temp = array[i];
                break;
            }
        }

        for(int i = 0; i < array.length; i++){
            if(array[i] == null && temp instanceof String){
                array[i] = (E)"zero";
            }
            else if(array[i] == null && temp instanceof Integer){
                array[i] = (E)new Integer(0);
            }
            else if(array[i] == null && temp instanceof Double || array[i] instanceof Float){
                array[i] = (E)new Double(0);
            }
            else if(array[i] == null && temp instanceof Long){
                array[i] = (E)new Long(0);
            }
            else if(array[i] == null && temp instanceof Character){
                array[i] = (E)new Character('0');
            }
        }
        return array;
    }

    //#2
    /**
     * @param index - must be zero or positive number
     * if incorrect value of index method return null
     * otherwise returns value from collection under
     * the index
     * */

    @Override
    public E get(int index){
        E temp = null;
        if (this.values.length != 0){
            if(index >= 0 && index < this.values.length){
                temp = this.values[index];
            }else{
                System.out.println("Incorrect index value: must be zero or positive number,");
                System.out.println("the index must be within the bounds of the collection length.");
            }
        }
        return temp;
    }

    //#3
    /**
     * @param object - if this object is contained in a collection
     * then the first index of the entry into the collection
     * of this object is returned
     * if method return -1 -> there is no object in collection
     * if method returned >= 0 -> this is index of object in collection
     * */
    @Override
    public int indexOf(Object object) {
        int returnedIndex = -1;
        E[] temp = values;

        if(values.length != 0 && object != null){
            for(int i = 0; i < values.length; i++){
                if(object.equals(temp[i])){
                    returnedIndex = i;
                    break;
                }
            }
        }else{
            System.out.println("Collection is empty or incorrect parameter");
        }
        return returnedIndex;
    }

    //#4
    /**
     * @param - if this object is contained in a collection
     * then the last index of the entry into the collection
     * of this object is returned
     * if method return -1 -> there is no object in collection
     * if method returned >= 0 -> this is index of object in collection
     * */
    @Override
    public int lastIndexOf(Object object) {
        int returnedIndex = -1;
        E[] temp = values;

        if(values.length != 0 && object != null){
            for(int i = values.length - 1; i >= 0; i--){
                if(object.equals(temp[i])){
                    returnedIndex = i;
                }
            }
        }else{
            throw  new IncorrectParametrException("Incorrect parameter");
        }
        return returnedIndex;
    }

    //#5
    /**
     * returns <E> iterator
     * */
    @Override
    public MyListIterator<E> myListIterator() {
        MyListIterator<E> myListIterator = new MyListIterator<>(this.values);
        return myListIterator;
    }

    //#6
    /**
     * @param e1 - elements of E type
     * return MyList collection, please, cast return collection
     * to your type
     * */
    //@Override
    static <E> MyList<E> of(E ... e1){
        MyArrayList<E> myArrayList = new MyArrayList<>();
        myArrayList.values = (E[])new Object[e1.length];

        for(int i = 0; i < e1.length; i++){
            myArrayList.values[i] = e1[i];
        }

        return myArrayList;
    }

    //#7
    /**
     * @param index - zero or positive integer
     * @param object - object of the same class of collection is
     * */
    @Override
    public E set(int index, E object) {
        if(index >= 0 && index < this.values.length){
            if(object != null){
                this.values[index] = object;
            }
        }else if(index < 0){
            throw new IndexException("Invalid index value: only positive numbers or zero");
        }else {
            System.out.println("Incorrect index or object parameter");
        }
        return object;
    }

    //#8
    /**
     * Need to override this method !!!
     * */
   /* @Override
    public void sort(Comparator<? super E> comparator) { }*/


    //#9
    /**
     * @param start - zero or positive integer
     * @param end - zero or positive integer
     * start and end param must be within the
     * collection size
     * */
    @Override
    public MyList<E> subList(int start, int end) {
        E[] temp = (E[])new Object[end - start];
        MyArrayList<E> myArrayList = new MyArrayList<>();
        myArrayList.values = temp;
        temp = null;
        for(int i = start; i < end; i++){
            myArrayList.values[i] = this.values[i];
        }

        return myArrayList;
    }


    //override object methods
    @Override
    public String toString() {
        return "MyArrayList{" +
                "values=" + Arrays.toString(values) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyArrayList<?> that = (MyArrayList<?>) o;
        return Arrays.equals(values, that.values);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(values);
    }


}
