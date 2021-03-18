package StreamAPIPractice;

import java.util.*;
import java.util.stream.Collectors;

public class StreamAPIPractice {

    public static void main(String[] args) {

        /**
         * Создаем объект процессор. У него есть название модели, тактовая частота.
         * Создать коллекцию в которую поместить 10 разных процессоров.
         * Выполнить над коллекцией все методы которые написаны в презентации.
         * Для вывода использовать любые терминальные методы.
         * Результат работы каждого метода вывести на экран. так как мы делали.
         * Задание просто практика.
         * Конечно для сортировки использовать компаратор (отсортировать по частоте).
         * */

        //NB: методы streamAPI не меняют исходную коллекцию!

        //https://habr.com/ru/company/luxoft/blog/270383/

        Processor proc1 = new Processor("AMD", 1.6);
        Processor proc2 = new Processor("Celeron", 1.8);
        Processor proc3 = new Processor("Intel", 2.2);
        Processor proc4 = new Processor("Pentium II", 1.6);
        Processor proc5 = new Processor("Pentium III", 1.8);
        Processor proc6 = new Processor("AMD", 1.4);
        Processor proc7 = new Processor("Celeron", 1.9);
        Processor proc8 = new Processor("Intel", 2.0);
        Processor proc9 = new Processor("Pentium IV", 3.2);
        Processor proc10 = new Processor("AMD", 2.4);

        List<Processor> processors = new ArrayList<>();

        processors.add(proc1);
        processors.add(proc2);
        processors.add(proc3);
        processors.add(proc4);
        processors.add(proc5);
        processors.add(proc6);
        processors.add(proc7);
        processors.add(proc8);
        processors.add(proc9);
        processors.add(proc10);


        System.out.println(processors);

        System.out.println("\nmap() intermediate ====================");
        /* преобразует каждый элемент стрима как указано в лямбда выражении */

        List<Integer> list1 = new ArrayList<>();
        list1  = processors.stream()
                .map((Processor p) -> p.getModel().length())
                .collect(Collectors.toList());

        int [] arr1 = {5, 8, 3, 4, 2};

        int[] arr2 = Arrays.stream(arr1)
                .map(i -> {if(i % 2 == 0){
                    i = i / 2;
                }
                    return i; })
                .toArray();

        for (int i = 0; i < arr2.length; i++)
            System.out.print(arr2[i] + " ");

        System.out.println("\nfilter() intermediate ====================");
        /* отфильтровывает записи, возвращает только записи, соответствующие условию */

        processors.stream()
                .filter( (Processor p) -> p.getProcessorFrequency() == 1.8 )
                .forEach( processor -> System.out.println(processor) );

        System.out.println("\nforEach() terminal ====================");
        /* применяет функцию лямбды к каждому элементу */

        processors.stream().forEach( (Processor p) -> System.out.println(p.getModel()) );

        System.out.println("\nreduce() terminal ====================");
        /* позволяет выполнять агрегатные функции на всей коллекцией и возвращать один результат */

        Processor superCPU = processors.stream().reduce( (p1, p2) -> { double result = 0;
            result = p1.getProcessorFrequency() + p2.getProcessorFrequency();
            return  new Processor("SuperCPU", result);
        } ).get();

        System.out.println(superCPU);

        //variant 2
        List<String> list2 = new ArrayList<>();
        for(Processor p : processors)
            list2.add(p.getModel());

        StreamAPIPractice.printList(list2);

        System.out.println("\nsorted() intermediate ====================");
        /* позволяет сортировать значения либо в натуральном порядке, либо задавая Comparator */

        /*List<Processor> list3 = processors.stream()
                .sorted( (p1, p2) -> p1.getModel().length() - p2.getModel().length())
                .collect(Collectors.toList());*/

        List<Processor> list3 = processors.stream()
                .sorted( (p1, p2) -> p1.getModel().compareTo(p2.getModel()))
                .collect(Collectors.toList());

        StreamAPIPractice.printList(list3);

        System.out.println("\ndistinct() intermediate ====================");
        /* возвращает стрим без дубликатов */

        List<Processor> list4 = processors.stream().distinct().collect(Collectors.toList());
        StreamAPIPractice.printList(list4);

        System.out.println("\ncount() terminal ====================");
        /* возвращает количество элементов в стриме (возвращает long) */

        System.out.println(processors.stream().count());
        long count = processors.stream().filter( (Processor p) -> p.getModel()
                .equalsIgnoreCase("AMD"))
                .count();
        System.out.println("count = " + count);

        System.out.println("\npeek() intermediate ====================");
        /* как и метод forEach принимает Consumer но возвращает не void a stream */
        count = processors.stream().filter( (Processor p) -> p.getProcessorFrequency() == 1.8 )
                .peek(System.out::println)
                .count();
        System.out.println("count = " + count);

        System.out.println("\nflatMap() intermediate ====================");
        /* используется тогда, когда нужно поработать с элементами элементов коллекции (коллекция содержит другие коллекции) */

        List<Processor> lowCPU = processors.stream().filter( (Processor p) ->
                p.getProcessorFrequency() == 1.8 || p.getProcessorFrequency() == 1.6 ).collect(Collectors.toList());

        List<Processor> highCPU = processors.stream().filter( (Processor p) ->
                p.getProcessorFrequency() > 1.9 ).collect(Collectors.toList());

        List<CPUContainer> listCPUContainer = new ArrayList<>();
        CPUContainer lowCPUContainer = new CPUContainer(lowCPU);
        CPUContainer highCPUContainer = new CPUContainer(highCPU);

        listCPUContainer.add(lowCPUContainer);
        listCPUContainer.add(highCPUContainer);

        System.out.println("flatMap() #1");
        listCPUContainer.stream().flatMap( (CPUContainer c) -> c.getProcessors().stream())
                .forEach( processor -> System.out.println(processor));

        System.out.println("flatMap() #2");
        List<Processor> firstResult = listCPUContainer.stream().flatMap( (CPUContainer c) -> c.getProcessors().stream())
                .filter( (Processor p) -> p.getProcessorFrequency() == 1.8 ).collect(Collectors.toList());
        StreamAPIPractice.printList(firstResult);

        System.out.println("flatMap() #3");
        List<Processor> secondResult = listCPUContainer.stream().flatMap( (CPUContainer c) -> c.getProcessors().stream())
                .filter( (Processor p) -> p.getProcessorFrequency() > 1.9 ).collect(Collectors.toList());
        StreamAPIPractice.printList(secondResult);

        System.out.println("\n collect: groupingBy() and partitioningBy  ====================");
        /*  */
        Map<Double, List<Processor>> map1 = processors.stream().map( (Processor p) -> {
            p.setProcessorFrequency(p.getProcessorFrequency() + 0.5);
            return p; })
                .collect(Collectors.groupingBy( (Processor p) -> p.getProcessorFrequency() ));

        for(Map.Entry<Double, List<Processor>> entry : map1.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        Map<Boolean, List<Processor>> map2 = processors.stream().collect(Collectors.partitioningBy( processor -> processor.getProcessorFrequency() > 1.9 ));

        for(Map.Entry<Boolean, List<Processor>> entry : map2.entrySet())
            System.out.println(entry.getKey() + " : " + entry.getValue());

        System.out.println("\nfindFirs() terminal ====================");
        /* возвращает возвращает первый элемент стрима */

        Optional<Processor> optional = processors.stream().filter( (Processor p) -> p.getModel().equalsIgnoreCase("AMD") ).findFirst();
        System.out.println(optional);

        System.out.println("\nmin() and max() methods terminal ====================");
        /* возвращает  минимальный и максимальный объект в коллекции*/

        Processor minProc = processors.stream().min( (p1, p2) -> p1.getModel().length() - p2.getModel().length()).get();
        System.out.println(minProc);

        Processor maxProc = processors.stream().max( (p1, p2) -> p1.getModel().length() - p2.getModel().length()).get();
        System.out.println(maxProc);

        System.out.println("\nlimit() intermediate ====================");
        /* ограничивает количество элементов в стриме */
        processors.stream().limit(2).forEach( (Processor p) -> System.out.println(p));

        System.out.println("\nskip() intermediate ====================");
        /* пропускает первые элементы стрима */

        processors.stream().skip(2).forEach( (Processor p) -> System.out.println(p) );

        System.out.println("\nmapToInt() intermediate ====================");
        /* возвращает стрим интов */

        List<Integer> intList = processors.stream().mapToInt( (Processor p) -> p.getModel().length())
                .boxed()
                .collect(Collectors.toList());

        StreamAPIPractice.printList(intList);

    }//main ends

    /* static methods */
    public static <E> void printNumFromArray(E[] arr){
        for(int i = 0; i < arr.length; i++)
            System.out.println(arr[i] + " ");
    }

    public static <E> void printList(List<E> list){
        for(E element : list)
            System.out.println(element);
    }

}//class ends
