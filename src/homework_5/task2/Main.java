package homework_5.task2;

import javax.swing.*;
import java.awt.*;

class Frame extends JFrame{
    public Frame() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(300, 300);
        Canvas c = new Canvas();
        add(c);
    }
}

public class Main{
    public static void main(String[] args) {
        new Frame().setVisible(true);
    }
}
