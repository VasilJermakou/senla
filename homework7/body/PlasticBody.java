package homework7.body;

import java.util.Objects;

public class PlasticBody implements Body {

    //class fields
    private BodyType bodyType;

    //constructor
    public PlasticBody(){
        this.bodyType = BodyType.PLASTIC_BODY;
    }

    //methods
    @Override
    public void printBodyType() {
        System.out.println(this.bodyType.getMessage());
    }

    @Override
    public String toString() {
        return "PlasticBody{" +
                "bodyType=" + bodyType +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PlasticBody that = (PlasticBody) o;
        return bodyType == that.bodyType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(bodyType);
    }
}
