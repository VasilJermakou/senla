package senla.loops;

import java.util.Objects;

public class Cat {

    //class fields
    String catName = "Garfild";
    int catAge = 5;

    //constructor by default
    public Cat(){
        System.out.println("Default constructor");
    }

    //constructor with param
    public Cat(String name, int age){
        this.catName = name;
        this.catAge = age;
        System.out.println("Constructor with param");
    }

    //getters & setters
    public String getCatName() {
        return catName;
    }

    public int getCatAge() {
        return catAge;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public void setCatAge(int catAge) {
        this.catAge = catAge;
    }

    //override toString()
    @Override
    public String toString() {
        return "Cat {" +
                "catName='" + catName + '\'' +
                ", catAge=" + catAge +
                '}';
    }

    //override equals()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return catAge == cat.catAge && Objects.equals(catName, cat.catName);
    }

    //override hashCode()
    @Override
    public int hashCode() {
        return Objects.hash(catName, catAge);
    }

}//class ends
