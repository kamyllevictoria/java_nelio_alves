package enums.entitiesI;

import enums.entitiesEnums.OrderStatus;

import java.util.Date;

public class Order {
    private Integer id;
    private Date moment;
    private OrderStatus staus;

    public Order(Integer id, Date moment, OrderStatus status) {
        this.id = id;
        this.moment = moment;
        this.staus = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getMoment() {
        return moment;
    }

    public OrderStatus getStaus() {
        return staus;
    }

    public void setStaus(OrderStatus staus) {
        this.staus = staus;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }
}
