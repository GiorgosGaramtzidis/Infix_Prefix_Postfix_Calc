package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class postfixInfo extends JFrame {

    private JPanel postfixInfoPanel;
    private JTextArea textArea1;
    private JButton CLOSEButton;

    public postfixInfo() {
        add(postfixInfoPanel);
        setSize(600,500);
        setTitle("CONVERTOR");
        CLOSEButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                postfixConvertor f = new postfixConvertor();
                f.setVisible(true);
                postfixInfoPanel.setVisible(false);
                dispose();
            }
        });
    }
}
