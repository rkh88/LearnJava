package demostatic;
public class Client {

    public static int  count = 0;

    public Client(){
        count++;
    }
    public static void main(String[] args) {
        Client cl = new Client();
        Client cl1 = new Client();
        Client cl2 = new Client();
        System.out.println(Client.count);

        System.out.println(Math.max(4,3));

    }
}
