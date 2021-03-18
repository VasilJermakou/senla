package StreamAPIPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdasPractice {

    public static void main(String[] args) {

        // #1 Predicate example, using lambda
        System.out.println("#1 Predicate example, using lambda");

        //create list
        List<Processor> processors = new ArrayList<>();

        //create Processor objects
        Processor processor1 = new Processor("Celeron", 1.6);
        Processor processor2 = new Processor("Intel", 1.8);
        Processor processor3 = new Processor("Celeron", 1.4);
        Processor processor4 = new Processor("Pentium III", 2.4);
        Processor processor5 = new Processor("AMD", 2.4);
        Processor processor6 = new Processor("Intel", 2.0);

        //add processors to list
        processors.add(processor1);
        processors.add(processor2);
        processors.add(processor3);
        processors.add(processor4);
        processors.add(processor5);
        processors.add(processor6);

        //System.out.println(processors);

        //examples of Predicate and lambda
        System.out.println("examples of Predicate and lambda");
        LambdasPractice.cpuFilter(processors, (Processor p) -> p.getProcessorFrequency() > 1.6);
        System.out.println("================");
        LambdasPractice.cpuFilter(processors, (Processor p) -> p.getProcessorFrequency() == 2.4);
        System.out.println("================");
        LambdasPractice.cpuFilter(processors, (Processor p) -> p.getModel().equalsIgnoreCase("Celeron"));

        //method removeIf(Predicate<>)
        System.out.println("method removeIf(Predicate<>)");
        processors.removeIf((Processor p) -> { return p.getModel().length() < 5;});
        System.out.println(processors);     //remove AMD
        processors.add(processor5);         //add AMD

        //Collections.sort(List, Predicate<>)
        System.out.println("Collections.sort(List, Predicate<>)");
        Collections.sort(processors, (p1, p2) -> p1.getModel().length() - p2.getModel().length() );
        System.out.println(processors);

        // and(), or() methods
        System.out.println("and(), or() methods: ");
        Predicate<Processor> pr1 = processor -> processor.getProcessorFrequency() > 1.6;
        Predicate<Processor> pr2 = processor -> processor.getModel().equalsIgnoreCase("Intel");

        LambdasPractice.cpuFilter(processors, pr1.and(pr2));
        LambdasPractice.cpuFilter(processors, pr1.or(pr2));

        System.out.println("******************************");

        System.out.println("#2 Supplier example, using lambda");

        ArrayList<Processor> processors2 = LambdasPractice.createListProcessor(6, () -> new Processor("AMD", 2.0));
        System.out.println(processors2);

        System.out.println("******************************");

        System.out.println("#3 Consumer example, using lambda and method foreach()");

        processors.forEach((Processor proc) -> System.out.println(proc));

        System.out.println("******************************");

        System.out.println("#4 Function example, using lambda");

        Function<Processor, Double> func = (Processor proc) -> {double temp = proc.getProcessorFrequency();
            temp = temp + 0.5;
            proc.setProcessorFrequency(temp);
            return proc.getProcessorFrequency(); };

    }//main ends

    /* static methods */
    //#1
    public static void cpuFilter(List<Processor> list, Predicate<Processor> pr){
        for(Processor p : list){
            if(pr.test(p))
                System.out.println(p);
        }
    }

    //#2
    public static ArrayList<Processor> createListProcessor(int numberOfElements, Supplier<Processor> supplier){
        ArrayList<Processor> processors = new ArrayList<>();
        for(int i = 0; i < numberOfElements; i++)
            processors.add(supplier.get());

        return processors;
    }

}//class ends
