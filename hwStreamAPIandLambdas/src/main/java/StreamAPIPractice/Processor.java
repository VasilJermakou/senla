package StreamAPIPractice;

import java.util.Objects;

public class Processor {

    /**
     * Создаем объект процессор. У него есть название модели, тактовая частота.
     * Создать коллекцию в которую поместить 10 разных процессоров.
     * Выполнить над коллекцией все методы которые написаны в презентации.
     * Для вывода использовать любые терминальные методы.
     * Результат работы каждого метода вывести на экран. так как мы делали.
     * Задание просто практика.
     * Конечно для сортировки использовать компаратор (отсортировать по частоте).
     * */

    /* class fields */
    private String model;
    private double processorFrequency;

    /* constructor */
    public Processor(String model, double processorFrequency){
        this.model = model;
        this.processorFrequency = processorFrequency;
    }

    /* getters & settor*/
    public String getModel(){
        String result = this.model;
        return  result;
    }

    public double getProcessorFrequency(){
        double result = this.processorFrequency;
        return result;
    }

    public void setProcessorFrequency(double processorFrequency){
        this.processorFrequency = processorFrequency;
    }

    /* Object methods */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Processor processor = (Processor) o;
        return Double.compare(processor.processorFrequency, processorFrequency) == 0 && Objects.equals(model, processor.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, processorFrequency);
    }

    @Override
    public String toString() {
        return "Processor{" +
                "model='" + model + '\'' +
                ", processorFrequency=" + processorFrequency +
                '}';
    }

}//class ends
