package hwIOStream;

import java.time.LocalDate;
import java.util.Objects;

public class Goods {

    /* class fields */
    private static int goodsCounter = 0;
    private int ID;
    private String name;
    private LocalDate dateOfManufacture;

    /* constructor */
    public Goods(String name, LocalDate dateOfManufacture){
        Goods.goodsCounter++;
        this.ID = goodsCounter;
        this.name = name;
        this.dateOfManufacture = dateOfManufacture;
    }

    /* getters */
    public static int getGoodsCounter() {
        return goodsCounter;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDateOfManufacture() {
        return dateOfManufacture;
    }

    /* object methods */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Goods goods = (Goods) o;
        return ID == goods.ID && Objects.equals(name, goods.name) && Objects.equals(dateOfManufacture, goods.dateOfManufacture);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID, name, dateOfManufacture);
    }

    @Override
    public String toString() {
        return  " id=" + ID + "/" +
                "name=" + name + "/" +
                "dateOfManufacture=" + dateOfManufacture;
    }

}//class ends
