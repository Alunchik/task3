package homework_5.task4;

import javax.swing.*;

class Frame extends JFrame{
    public void start(){
        String path = "kek.gif";
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JLabel label = new JLabel();
        ImageIcon gif = new ImageIcon(path);
        label.setIcon(gif);
        add(label);
        setSize(gif.getIconWidth(), gif.getIconHeight());
        setVisible(true);
    }
}

public class Main {
    public static void main(String[] args) {
        new Frame().start();
    }
}
