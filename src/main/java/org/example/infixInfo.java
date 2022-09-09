package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class infixInfo extends JFrame{
    private JPanel infoPanel;
    private JTextArea infixΗΑλλιώςΕνδοθεματικηTextArea;
    private JButton closeButton;

    public infixInfo(){
        add(infoPanel);
        setSize(600,500);
        setTitle("CONVERTOR");
        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                infixConvertor f = new infixConvertor();
                f.setVisible(true);
                infoPanel.setVisible(false);
                dispose();
            }
        });
    }


}
