package StreamAPIPracticeTests;

import StreamAPIPractice.CPUContainer;
import StreamAPIPractice.Processor;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

import java.util.ArrayList;
import java.util.List;

public class CPUContainerTest {

    /**
     * Methods name writes in conception WhenSmtThenResultIsSmt
     * Methods body writes in conception AAA (arrange, act, assert)
     * */

    private CPUContainer cpuContainer;
    private List<Processor> processors;
    private List<Processor> resultList;

    //create new CPUContainer object and init variables
    @Before
    public void beforeMethod(){
        processors = new ArrayList<>();
        processors.add(new Processor("TestModel", 1.0));
        this.cpuContainer = new CPUContainer(processors);
    }

    //reinit variables
    @After
    public void afterMethod(){
        this.resultList = null;
    }

    @Test
    public void getProcessorsTest(){
        this.resultList = cpuContainer.getProcessors();
        assertThat(resultList, is(cpuContainer.getProcessors()));
    }

    @Test
    public void equalsTest(){
        CPUContainer cpuContainer2 = new CPUContainer(processors);
        boolean result = this.cpuContainer.equals(cpuContainer2);
        assertThat(result, is(true));
    }

    @Test
    public void hashCodeTest(){
        int result = this.cpuContainer.hashCode();
        assertThat(result, is(result));
    }

    @Test
    public void toStringTest(){
        String result = cpuContainer.toString();
        assertThat(result, is("CPUContainer{processors=[Processor{model='TestModel', processorFrequency=1.0}]}"));
    }
}
