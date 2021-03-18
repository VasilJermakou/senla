package StreamAPIPracticeTests;

import StreamAPIPractice.Processor;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

public class ProcessorTest {

    /**
     * Methods name writes in conception WhenSmtThenResultIsSmt
     * Methods body writes in conception AAA (arrange, act, assert)
     * */

    private Processor processor;
    private String stringResult;
    private double doubleResult;

    //create new object of Processor and init variable
    @Before
    public void beforeMethod(){
        this.processor = new Processor("TestModel", 1.0);
        this.stringResult = "";
        this.doubleResult = 0;
    }

    //reinit variables after other methods work
    @After
    public void afterMethod(){
        this.stringResult = "";
        this.doubleResult = 0;
    }

    @Test
    public void getModelTest(){
        this.stringResult = processor.getModel();
        assertThat(stringResult, is("TestModel"));
    }

    @Test
    public void getProcessorFrequencyTest(){
        this.doubleResult = processor.getProcessorFrequency();
        assertThat(doubleResult, is(1.0));
    }

    @Test
    public void setProcessorFrequencyTest(){
        processor.setProcessorFrequency(2.0);
        this.doubleResult = processor.getProcessorFrequency();
        assertThat(doubleResult, is(2.0));
    }

    @Test
    public void equalsTest(){
        Processor processor2 = new Processor("TestModel", 1.0);
        boolean result = this.processor.equals(processor2);
        assertThat(result, is(true));
    }

    @Test
    public void hashCodeTest(){
        int result = processor.hashCode();
        assertThat(result, is(result));
    }

    @Test
    public void toStringTest(){
        this.stringResult = processor.toString();
        assertThat(stringResult, is("Processor{model='TestModel', processorFrequency=1.0}"));
    }

}//class ends
