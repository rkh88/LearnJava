package task30;

import java.util.Date;

public class Item {

    private Sender sender;
    private Sendee sendee;
    private int id;
    private Date sendingDate;
    private Date receivingDate;
    private int weight;
    private int price;
    private ShippingWay shippingWay;

    public Item(Sender sender, Sendee sendee, int id, Date sendingDate, Date receivingDate, int weight, int price, ShippingWay shippingWay) {
        this.sender = sender;
        this.sendee = sendee;
        this.id = id;
        this.sendingDate = sendingDate;
        this.receivingDate = receivingDate;
        this.weight = weight;
        this.price = price;
        this.shippingWay = shippingWay;
    }

    public Sender getSender() {
        return sender;
    }

    public void setSender(Sender sender) {
        this.sender = sender;
    }

    public Sendee getSendee() {
        return sendee;
    }

    public void setSendee(Sendee sendee) {
        this.sendee = sendee;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getSendingDate() {
        return sendingDate;
    }

    public void setSendingDate(Date sendingDate) {
        this.sendingDate = sendingDate;
    }

    public Date getReceivingDate() {
        return receivingDate;
    }

    public void setReceivingDate(Date receivingDate) {
        this.receivingDate = receivingDate;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public ShippingWay getShippingWay() {
        return shippingWay;
    }

    public void setShippingWay(ShippingWay shippingWay) {
        this.shippingWay = shippingWay;
    }

    @Override
    public String toString(){
        return "Item [sender = " + getSender() +
                "sendee = " + getSendee() +
                "id = " + getId() +
                "sendingDate = " + getSendingDate() +
                "receivingDate = " + getReceivingDate() +
                "weight = " + getWeight() +
                "price = " + getPrice() +
                "shippingWay = " + getShippingWay() +
                "]";



    }

}
