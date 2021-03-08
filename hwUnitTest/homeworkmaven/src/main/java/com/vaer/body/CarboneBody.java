package com.vaer.body;

import java.util.Objects;

public class CarboneBody implements Body {

    //class fields
    private BodyType bodyType;

    //constructor
    public CarboneBody(){
        this.bodyType = BodyType.CARBONE_BODY;
    }

    //methods
    @Override
    public void printBodyType() {
        System.out.println(this.bodyType.getMessage());
    }

    @Override
    public String toString() {
        return "CarboneBody{" +
                "bodyType=" + bodyType +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarboneBody that = (CarboneBody) o;
        return bodyType == that.bodyType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(bodyType);
    }
}
