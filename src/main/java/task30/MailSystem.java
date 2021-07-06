package task30;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MailSystem {

    private String name;
    private List<Item> itemList = new ArrayList<>();
    private List<Letter> letterList = new ArrayList<>();
    private List<Parcel> parcelList = new ArrayList<>();
    private List<Person> personList = new ArrayList<>();
    private List<Sender> senderList = new ArrayList<>();
    private List<Sendee> sendeeList = new ArrayList<>();

    public MailSystem(String name, List<Letter> letterList, List<Parcel> parcelList) {
        this.name = name;
        this.letterList = letterList;
        this.parcelList = parcelList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Letter> getLetterList() {
        return letterList;
    }

    public void setLetterList(List<Letter> letterList) {
        this.letterList = letterList;
    }

    public List<Parcel> getParcelList() {
        return parcelList;
    }

    public void setParcelList(List<Parcel> parcelList) {
        this.parcelList = parcelList;
    }

    public void addLetter(Sender sender, Sendee sendee, int id, Date sendingDate, Date receivingDate, int weight, int price, ShippingWay shippingWay){
        Letter letter = new Letter(sender,sendee, id, sendingDate, receivingDate, weight, price, shippingWay);
        itemList.add(letter);
        letterList.add(letter);
    }

    public void addParcel(Sender sender, Sendee sendee, int id, Date sendingDate, Date receivingDate, int weight, int price, ShippingWay shippingWay, int volume){
        Parcel parcel = new Parcel (sender, sendee, id, sendingDate, receivingDate, weight, price, shippingWay, volume);
        itemList.add(parcel);
        parcelList.add(parcel);
    }

    public void printLetterList() {

        for (int i = 0; i < letterList.size(); i++) {
            System.out.println(toString(letterList.get(i)));
        }
    }

    public void printParcelList() {

        for (int i = 0; i < parcelList.size(); i++) {
            System.out.println(toString(parcelList.get(i)));
        }
    }

    public void printItemList(){

        for (int i = 0; i < itemList.size(); i++) {
            System.out.println(toString(itemList.get(i)));

        }
    }

    public Letter getLetterById(int id){
        for (int i = 0; i < letterList.size(); i++) {
            if(letterList.get(i).getId() == i){
                return letterList.get(i);
                System.out.println(toString(letterList.get(i)));
            }
        }
        return null;

    }

    public Parcel getParcelById(int id){
        for (int i = 0; i < parcelList.size(); i++) {
            if(parcelList.get(i).getId() == i){
                return parcelList.get(i);
                System.out.println(toString(parcelList.get(i)));
            }
        }
        return null;
    }

    public void addSender(String address, String name, String tel){
        Sender sender = new Sender(address, name, tel);
        senderList.add(sender);
    }

    public void addSendee(String address, String name, String tel){
        Sendee sendee = new Sendee(address, name, tel);
        sendeeList.add(sendee);
    }



    public List<Letter> getLetterBySenderName(String name){
        private List<Letter> lettersByName = new ArrayList<>();
        for (int i = 0; i < letterList.size(); i++) {
            if(name == letterList.get(i).getSender().getName()){
                lettersByName.add(letterList.get(i));
            }
            return lettersByName;
        }
        return null;
    }

    public void printLetterBySenderName(String name){
        private List<Letter> lettersByName = new ArrayList<>();
        for (int i = 0; i < letterList.size(); i++) {
            if(name == letterList.get(i).getSender().getName()){
                lettersByName.add(letterList.get(i));
            }
        }
        for (int i = 0; i < lettersByName.size(); i++) {
            System.out.println(toString(lettersByName.get(i)));
        }

    }

    public List<Parcel> getParcelBySenderName(String name){
        private List<Parcel> parcelsByName = new ArrayList<>();
        for (int i = 0; i < parcelList.size(); i++) {
            if(name == parcelList.get(i).getSender().getName()){
                parcelsByName.add(letterList.get(i));
            }
            return parcelsByName;
        }
        return null;
    }

    public void printParcelBySenderName(String name){
        private List<Parcel> parcelsByName = new ArrayList<>();
        for (int i = 0; i < parcelList.size(); i++) {
            if(name == parcelList.get(i).getSender().getName()){
                parcelsByName.add(parcelList.get(i));
            }
        }
        for (int i = 0; i < parcelsByName.size(); i++) {
            System.out.println(toString(parcelsByName.get(i)));
        }

    }


    public List<Letter> getLetterBySendeeName(String name){
        private List<Letter> lettersByName = new ArrayList<>();
        for (int i = 0; i < letterList.size(); i++) {
            if(name == letterList.get(i).getSendee().getName()){
                lettersByName.add(letterList.get(i));
            }
            return lettersByName;
        }
        return null;
    }

    public void printLetterBySendeeName(String name){
        private List<Letter> lettersByName = new ArrayList<>();
        for (int i = 0; i < letterList.size(); i++) {
            if(name == letterList.get(i).getSendee().getName()){
                lettersByName.add(letterList.get(i));
            }
        }
        for (int i = 0; i < lettersByName.size(); i++) {
            System.out.println(toString(lettersByName.get(i)));
        }

    }

    public List<Parcel> getParcelBySendeeName(String name){
        private List<Parcel> parcelsByName = new ArrayList<>();
        for (int i = 0; i < parcelList.size(); i++) {
            if(name == parcelList.get(i).getSendee().getName()){
                parcelsByName.add(letterList.get(i));
            }
            return parcelsByName;
        }
        return null;
    }

    public void printParcelBySendeeName(String name){
        private List<Parcel> parcelsByName = new ArrayList<>();
        for (int i = 0; i < parcelList.size(); i++) {
            if(name == parcelList.get(i).getSendee().getName()){
                parcelsByName.add(parcelList.get(i));
            }
        }
        for (int i = 0; i < parcelsByName.size(); i++) {
            System.out.println(toString(parcelsByName.get(i)));
        }

    }






}
