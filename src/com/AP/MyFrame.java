package com.AP;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    JButton button;
    JTextField textField;


//    DefaultTableModel model = new DefaultTableModel();
//    JTable table = new JTable(model);

    public void Myframe() {

        this.setTitle("TO-DO list"); //sets title of frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of application
        this.setAutoRequestFocus(false); //prevent frame from being resized
        this.setSize(420, 600); // sets the x-dimension, y-dimension of frame
        this.setVisible(true); //make frame visible
        this.getContentPane().setBackground(Color.white); //change color of background

           button = new JButton("Saglabāt");
           button.addActionListener(this);

           textField = new JTextField();
           textField.setPreferredSize(new Dimension(240,40));

//        table = new JTable();
//        model.addColumn("Col1");
//        model.addRow(new Object[]{"textField.getText()"});

        this.add(button);
        this.add(textField);
//        this.add(table);
        this.pack();
    }

    public void actionPerformed(ActionEvent e) {

//        if (e.getSource() == button) {
//            String data = textField.getText();


        }

    }



