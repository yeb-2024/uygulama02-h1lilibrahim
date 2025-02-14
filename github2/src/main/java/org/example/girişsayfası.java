package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class girişsayfası implements ActionListener {
    JFrame frame;
    JTextField kullanıcıadı;
    JTextField şifre;
    JButton button;

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
        JLabel labelalt = new JLabel("şifre");

        şifre = new JTextField();
        şifre.setPreferredSize(new Dimension(200,40));

        panelalt.add(labelalt);
        panelalt.add(şifre);

        button = new JButton();
        button.addActionListener(this);

        frame = new JFrame("giriş sayfası");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,300);
        frame.setLayout(new GridLayout(3,1));

        frame.add(button);
        frame.add(panelüst);
        frame.add(panelalt);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button){
            String kullanıcıadı = this.kullanıcıadı .getText().trim();
            String şifre = this.şifre.getText().trim();

            if (kullanıcıadı.isEmpty() || şifre.isEmpty()){
                JOptionPane.showMessageDialog(null,"lütfen tüm alanları doldur","hata",JOptionPane.ERROR_MESSAGE);

            }

        }
    }
}
