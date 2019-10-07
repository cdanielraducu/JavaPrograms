package com.example.awtSample;

import java.awt.*;
import java.awt.Frame;
import java.awt.event.*;

public class MyWindow extends Frame {
    public MyWindow(String title){
        super(title);
        setSize(500, 140);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Font sansSerifLarge =new Font("SansSerif", Font.BOLD, 18);
        Font sansSerifSmall = new Font("SansSerif",Font.BOLD, 12);
        g.setFont(sansSerifLarge);
        g.drawString("Pizza Daniel si alex pute",60,60);
        g.setFont(sansSerifSmall);
        g.drawString("by Pizza Daniel himself",60,100);
    }
}
