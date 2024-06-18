package enums.Exercise;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private Date moment;
    private OrderStatusProduct status;
    private Client client;
    private final List<OrderItem> items = new ArrayList<OrderItem>();
    private final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Order() {

    }
    public Order(Date moment, OrderStatusProduct status, Client client){
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatusProduct getStatus() {
        return status;
    }

    public void setStatus(OrderStatusProduct status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
    public void addItem(OrderItem item){
        items.add(item);
    }
     public void removeItem(OrderItem item){
        items.remove(item);
     }

     public double total(){
        double sum = 0;
        for(OrderItem it: items){
            sum += it.subTotal();
        }
        return sum;
     }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Order moment: ");
        sb.append(sdf.format(moment)).append("\n");
        sb.append("Order Status: ");
        sb.append(status).append("\n");
        sb.append("Client: ");
        sb.append(client).append("\n");
        sb.append("Order items: \n");
        for(OrderItem it: items){
            sb.append(it).append("\n");
        }
        sb.append("Total price: $");
        sb.append(String.format("%.2f", total()));
        return sb.toString();


    }
}
