package clientgui;

import java.awt.*;

public class ClientA  implements Client{
    @Override
    public int width() {
        return 400;
    }

    @Override
    public int height() {
        return 200;
    }

    @Override
    public Color color() {
        return Color.cyan;
    }
}
