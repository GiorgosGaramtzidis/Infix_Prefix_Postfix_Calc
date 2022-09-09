package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static org.example.PrefixToInfix.convert;
import static org.example.PrefixToPostfix.preToPost;

public class prefixConvertor extends JFrame {
    private JPanel prefixPanel;
    private JButton homeButton;
    private JButton clearButton;
    private JButton exitButton;
    private JButton infoButton;
    private JTextField Input;
    private JTextField Output;
    private JButton convertToInfixButton;
    private JButton convertToPostfixButton;

    public prefixConvertor() {
        add(prefixPanel);
        setSize(800,400);
        setTitle("CONVERTOR");

        homeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Home f = new Home();
                f.setVisible(true);
                prefixPanel.setVisible(false);
                dispose();
            }
        });
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Input.setText(null);
                Output.setText(null);
            }
        });
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = new JFrame("EXIT");
                if(JOptionPane.showConfirmDialog(frame,"Confirm if you want to EXIT","EXIT",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
                    System.exit(0);
                }
            }
        });
        convertToInfixButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = Input.getText();
                String temp = convert(input);
                if(temp.equals("true")){
                    JFrame frame = new JFrame("ERROR");
                    if(JOptionPane.showConfirmDialog(frame,"Wrong Input, please use only prefix equations","ERROR",JOptionPane.CANCEL_OPTION)==JOptionPane.CANCEL_OPTION) {
                        prefixPanel.setVisible(true);
                    }
                }
                else {
                    Output.setText(temp);
                }
            }
        });
        convertToPostfixButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = Input.getText();
                String temp = preToPost(input);
                if(temp.equals("true")){
                    JFrame frame = new JFrame("ERROR");
                    if(JOptionPane.showConfirmDialog(frame,"Wrong Input, please use only prefix equations","ERROR",JOptionPane.CANCEL_OPTION)==JOptionPane.CANCEL_OPTION) {
                        prefixPanel.setVisible(true);
                    }
                }
                else {
                    Output.setText(temp);
                }
            }
        });
        infoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                prefixInfo f = new prefixInfo();
                f.setVisible(true);
                prefixPanel.setVisible(false);
                dispose();
            }
        });
    }
}
