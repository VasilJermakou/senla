package homework8;

import java.util.Collection;
import java.util.Comparator;
import java.util.ListIterator;

public interface MyList<E> {

    //METHODS

    /**
    * добавляет в список по индексу index объект object.
    **/
    void add(int index, E object);

    /**
     * добавляет в список по индексу index все элементы
     * коллекции col. Если в результате добавления список
     * был изменен, то возвращается true, иначе false.
     **/
    //boolean addAll(int index, Collection<? extends E> col);

    /**
     * возвращает объект из списка по индексу index.
     **/
    E get(int index);

    /**
     * возвращает индекс первого вхождения объекта object
     * в список. Если объект не найден, то возвращается -1.
     **/
    int indexOf(Object object);

    /**
     * возвращает индекс последнего вхождения объекта object
     * в список. Если объект не найден, то возвращается -1.
     **/
    int lastIndexOf(Object object);

    /**
     * возвращает объект ListIterator для обхода элементов списка.
     **/
    MyListIterator<E> myListIterator();

    /**
     * создает из набора элементов объект List.
     **/
    static <E> MyList<E> of(E ... e1){
        return null;
    }

    /**
     * присваивает значение объекта object элементу,
     * который находится по индексу index.
     **/
    E set(int index, E object);

    /**
     * сортирует список с помощью компаратора comparator.
     * */
    //void sort(Comparator<? super E> comparator);

    /**
     * возвращает List, начальный индекс start,
     * конечный индекс end.
     **/
    MyList<E> subList(int start, int end);

}
