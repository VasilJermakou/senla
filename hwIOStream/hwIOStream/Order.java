package hwIOStream;

import java.time.LocalDate;
import java.util.Objects;

public class Order {

    /* class fields */
    private int goodsID;
    private LocalDate dateOfOrder;

    /* constructors */
    public Order(int goodsID, LocalDate dateOfOrder){
        this.goodsID = goodsID;
        this.dateOfOrder = dateOfOrder;
    }

    /* getters */
    public int getGoodsID() {
        return goodsID;
    }

    public LocalDate getDateOfOrder() {
        return dateOfOrder;
    }

    /* object methods */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return goodsID == order.goodsID && Objects.equals(dateOfOrder, order.dateOfOrder);
    }

    @Override
    public int hashCode() {
        return Objects.hash(goodsID, dateOfOrder);
    }

    @Override
    public String toString() {
        return "Order: " +
                " goodsID=" + goodsID +
                " dateOfOrder=" + dateOfOrder;
    }

}//class ends
