package task30;

public class Person {

    private String address;
    private String name;
    private String tel;

    public Person(String address, String name, String tel) {
        this.address = address;
        this.name = name;
        this.tel = tel;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @Override
    public String toString(){
        return "Sender [address = " + getAddress() +
                "name = " + getName() +
                "tel = " + getTel() +
                "]";



    }

}
