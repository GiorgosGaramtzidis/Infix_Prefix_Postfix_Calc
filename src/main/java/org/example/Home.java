package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Home extends JFrame {
    private JButton EXITButton;
    private JButton INFOButton;
    private JButton INFIXButton;
    private JButton PREFIXButton;
    private JButton POSTFIXButton;
    private JPanel homePanel;

    public Home() {
        add(homePanel);
        setSize(800,400);
        setTitle("CONVERTOR");
        EXITButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = new JFrame("EXIT");
                if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to EXIT", "EXIT", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
                    System.exit(0);
                }
            }
        });
        INFIXButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                infixConvertor f = new infixConvertor();
                f.setVisible(true);
                homePanel.setVisible(false);
                dispose();
            }
        });
        POSTFIXButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                postfixConvertor f = new postfixConvertor();
                f.setVisible(true);
                homePanel.setVisible(false);
                dispose();
            }
        });
        PREFIXButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                prefixConvertor f = new prefixConvertor();
                f.setVisible(true);
                homePanel.setVisible(false);
                dispose();
            }
        });
    }
}
