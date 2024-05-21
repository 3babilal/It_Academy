package Sprint1.examen2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Pedidos {
    private int id;
    private int lastid;
   // private final int idnumber;
    private Client client;
    private Repartidor repartidor;
    private List<Item> items = new ArrayList<Item>();
    private double totalPrice;
    private boolean delivery;
    public Pedidos(Client client, Repartidor repartidor, List<Item> items, int id, boolean delivery) {

        this.id = id;
        this.client = client;
        this.repartidor = repartidor;
        this.items = items;
        totalPrice = calculatePrice();
        this.delivery = delivery;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLastid() {
        return lastid;
    }

    public void setLastid(int lastid) {
        this.lastid = lastid;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Repartidor getRepartidor() {
        return repartidor;
    }

    public void setRepartidor(Repartidor repartidor) {
        this.repartidor = repartidor;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public boolean isDelivery() {
        return delivery;
    }

    public void setDelivery(boolean delivery) {
        this.delivery = delivery;
    }

    private double calculatePrice() {
        double price = 0;
        for (Item item : items){
            price += item.getPrice();
        }
        return price;
    }
   private int idCounter(){
        if(lastid == 0) {
            return id++;
        }
        else {
            return lastid++;
        }
    }
    @Override
    public String toString() {
        return "Pedidos{" +
                ", idnumber=" + this.id +
                ", client=" + client +
                ", repartidor=" + repartidor.getName() +
                ", items=" + items +
                ", totalPrice=" + totalPrice +
                '}';
    }
}
