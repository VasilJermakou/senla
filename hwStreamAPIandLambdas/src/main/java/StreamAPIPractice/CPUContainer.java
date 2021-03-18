package StreamAPIPractice;

import java.util.List;
import java.util.Objects;

public class CPUContainer {

    /* class fields */
    private List<Processor> processors;

    /* constructor */
    public CPUContainer(List<Processor> processors){
        this.processors = processors;
    }

    /* getter */
    public List<Processor> getProcessors(){
        return this.processors;
    }

    /* Object methods */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CPUContainer that = (CPUContainer) o;
        return Objects.equals(processors, that.processors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(processors);
    }

    @Override
    public String toString() {
        return "CPUContainer{" +
                "processors=" + processors +
                '}';
    }

}//class ends
