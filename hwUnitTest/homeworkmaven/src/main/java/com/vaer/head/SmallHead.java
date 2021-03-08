package com.vaer.head;

import java.util.Objects;

public class SmallHead implements Head{

    //class fields
    private HeadType headType;

    //constructor
    public SmallHead(){
        this.headType = HeadType.SMALL_HEAD;
    }

    //methods
    @Override
    public void printHeadType() {
        System.out.println(this.headType.getMessage());
    }

    @Override
    public String toString() {
        return "SmallHead{" +
                "headType=" + headType +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SmallHead smallHead = (SmallHead) o;
        return headType == smallHead.headType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(headType);
    }
}
