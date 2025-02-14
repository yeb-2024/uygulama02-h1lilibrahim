package org.example;

import javax.swing.*;
import java.awt.*;

public class girişsayfası {
    JFrame frame;
    JTextField kullanıcıadı;
    JTextField şifre;

    public girişsayfası(){
        JPanel panelüst = new JPanel();
        panelüst.setLayout(new FlowLayout(FlowLayout.RIGHT));
        JLabel labelust = new JLabel("kullanıcı adı");

        kullanıcıadı = new JTextField();
        kullanıcıadı.setPreferredSize(new Dimension(200,40));

        panelüst.add(labelust);
        panelüst.add(kullanıcıadı);

        JPanel panelalt = new JPanel();
        panelalt.setLayout(new FlowLayout(FlowLayout.RIGHT));
        JLabel labelalt = new JLabel("kullanıcı adı");

        şifre = new JTextField();
        şifre.setPreferredSize(new Dimension(200,40));

        panelalt.add(labelalt);
        panelalt.add(şifre);

        frame = new JFrame("giriş sayfası");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,300);
        frame.setLayout(new GridLayout(3,1));


        frame.add(panelüst);
        frame.add(panelalt);
        frame.setVisible(true);
    }
}
