package com.vaer.bodytest;

import com.vaer.body.IronBody;
import org.junit.Test;

public class IronBodyTest {

    @Test
    public void printBodyTypeTest(){
        IronBody ironBody = new IronBody();
        ironBody.printBodyType();
    }
}
