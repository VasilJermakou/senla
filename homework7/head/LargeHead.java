package homework7.head;

import java.util.Objects;

public class LargeHead implements Head {

    //class fields
    private HeadType headType;

    //constructor
    public LargeHead(){
        this.headType = HeadType.LARGE_HEAD;
    }

    //methods
    @Override
    public void printHeadType() {
        System.out.println(this.headType.getMessage());
    }

    @Override
    public String toString() {
        return "LargeHead{" +
                "headType=" + headType +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LargeHead largeHead = (LargeHead) o;
        return headType == largeHead.headType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(headType);
    }
}
