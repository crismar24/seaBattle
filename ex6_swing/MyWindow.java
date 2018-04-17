package ex6_swing;

import javax.swing.*;
import java.awt.*;

//awt -> swing -> javaFx

public class MyWindow extends JFrame {
    public MyWindow() throws HeadlessException {
        setSize(400,300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Java Dive");
//        JButton jButton = new JButton("learn Java");
        add(new JButton("learn Java Center"), BorderLayout.CENTER);
        add(new JButton("learn Java Sout"), BorderLayout.SOUTH);
        add(new JButton("learn Java East"), BorderLayout.EAST);
        add(new JButton("learn Java West"), BorderLayout.WEST);
        add(new JButton("learn Java North"), BorderLayout.NORTH);

        setVisible(true);
    }
}
