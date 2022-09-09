package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class prefixInfo extends JFrame{
    private JTextArea textArea1;
    private JButton CLOSEButton;
    private JPanel infoPanel;

    public prefixInfo() {
        add(infoPanel);
        setSize(600,500);
        setTitle("CONVERTOR");
        CLOSEButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                prefixConvertor f = new prefixConvertor();
                f.setVisible(true);
                infoPanel.setVisible(false);
                dispose();
            }
        });
    }
}
