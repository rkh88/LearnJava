package clientgui;

import javax.swing.*;

public class WindowFrame  extends JFrame {

    public WindowFrame(Client client){
        setSize(client.width(), client.height());
        setVisible(true);
        getRootPane().setBackground(client.color());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new WindowFrame(new ClientA());
    }
}
