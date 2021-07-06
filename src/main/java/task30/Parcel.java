package task30;

import java.util.Date;

public class Parcel extends Item {

    private int volume;

    public Parcel(Sender sender, Sendee sendee, int id, Date sendingDate, Date receivingDate, int weight, int price, ShippingWay shippingWay, int volume) {
        super(sender, sendee, id, sendingDate, receivingDate, weight, price, shippingWay);
        this.volume = volume;
    }

    @Override
    public String toString(){
        return "Parcel [sender = " + getSender() +
                "sendee = " + getSendee() +
                "id = " + getId() +
                "sendingDate = " + getSendingDate() +
                "receivingDate = " + getReceivingDate() +
                "weight = " + getWeight() +
                "price = " + getPrice() +
                "shippingWay = " + getShippingWay() +
                "volume = " + getVolume() +
                "]";



    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
