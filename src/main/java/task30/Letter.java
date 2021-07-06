package task30;

import java.util.Date;

public class Letter extends Item{

    public Letter(Sender sender, Sendee sendee, int id, Date sendingDate, Date receivingDate, int weight, int price, ShippingWay shippingWay) {
        super(sender, sendee, id, sendingDate, receivingDate, weight, price, shippingWay);
    }

    @Override
    public String toString(){
        return "Letter [sender = " + getSender() +
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
