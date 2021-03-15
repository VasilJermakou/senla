package homeworkExceptions.myArrayListExceptions;

public class MyListIterator<E> implements MyIterator<E> {

    //class fields
    private E[] objects;
    private int index = 0;

    //constructor
    public MyListIterator(E [] objects){
        this.objects = objects;
    }

    @Override
    public boolean hasNext() {
        return index < objects.length;
    }

    @Override
    public E next() {
        return objects[index++];
    }
}
