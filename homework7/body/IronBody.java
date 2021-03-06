package homework7.body;

import java.util.Objects;

public class IronBody implements Body {

    //class fields
    private BodyType bodyType;

    //constructor
    public IronBody(){
        this.bodyType = BodyType.IRON_BODY;
    }

    //methods
    @Override
    public void printBodyType() {
        System.out.println(this.bodyType.getMessage());
    }

    @Override
    public String toString() {
        return "IronBody{" +
                "bodyType=" + bodyType +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IronBody ironBody = (IronBody) o;
        return bodyType == ironBody.bodyType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(bodyType);
    }
}
