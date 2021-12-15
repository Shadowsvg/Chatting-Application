package com.chat.application;

import javax.swing.*;
import java.awt.*;

public class Server extends JFrame {

    JPanel p1;

    Server(){                                // All coding of frame will be in constructor

        p1 = new JPanel();
        p1.setLayout(null);
        p1.setBackground(new Color(7, 94, 84));
        p1.setBounds(0, 0, 450, 70);
        add(p1);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("com/chat/application/icons/3.png"));
        Image i2 =  i1.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(5, 17, 30, 30);
        p1.add(l1);                                 // To add any element in frame

        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("com/chat/application/icons/1.png"));
        Image i5 =  i4.getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel l2 = new JLabel(i6);
        l2.setBounds(40, 5, 60, 60);
        p1.add(l2);

        Label l3 = new Label("Gaintonde");
        l3.setFont(new Font("SAN_SERIF", Font.PLAIN, 10));
        l3.setForeground(Color.WHITE);
        l3.setBounds(110, 15, 100, 20);
        p1.add(l3);

        


        getContentPane().setBackground(Color.YELLOW);
        setLayout(null);
        setSize(450, 650);
        setLocation(400, 150);
        setVisible(true);                    // by default false

    }

    public static void main(String[] args){
         new Server().setVisible(true);
    }
}
