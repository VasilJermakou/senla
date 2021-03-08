package com.vaer.head;

import java.util.Objects;

public class MiddleHead implements Head{

    //class fields
    private HeadType headType;

    //constructor
    public MiddleHead(){
        this.headType = HeadType.MIDDLE_HEAD;
    }

    //methods
    @Override
    public void printHeadType() {
        System.out.println(this.headType.getMessage());
    }

    @Override
    public String toString() {
        return "MiddleHead{" +
                "headType=" + headType +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MiddleHead that = (MiddleHead) o;
        return headType == that.headType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(headType);
    }
}
