package lesson08;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.nio.ByteOrder;

public class SomeWindow extends JFrame {
    private JPanel display;

    public SomeWindow(){
        setTitle("MY WINDOW");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300, 300, 400, 400);

        Button redBtn = new Button("red");
        Button greenBtn = new Button("green");
        Button blueBtn = new Button("blue");


        display = new JPanel();
        display.setPreferredSize(new Dimension(120, 120));
        display.setBackground(Color.black);

        redBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setBackground(Color.RED);
            }
        });greenBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setBackground(Color.GREEN);
            }
        });blueBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setBackground(Color.BLUE);
            }
        });



        setLayout(new BorderLayout());
        add(redBtn, BorderLayout.NORTH);
        add(greenBtn, BorderLayout.SOUTH);
        add(blueBtn, BorderLayout.EAST);
        add(display, BorderLayout.CENTER);


        setVisible(true);
    }

}
