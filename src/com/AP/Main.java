package com.AP;
//
import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {

////
////        // Datu bāze
////        DataBase database = new DataBase();
////        database.insert();
////        database.select();
////        database.delete();
////        database.update();
//
//        // ToDologs
        JFrame frame = new JFrame(); // izveido app logu
        frame.setTitle("TO-DO list"); // loga nosaukums
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // iziet no app
        frame.setAutoRequestFocus(false); // nevar mainīt loga izmērus

        frame.setSize(420, 600); // loga izmēri
        frame.setVisible(true); // izveido redzmu logu
        frame.getContentPane().setBackground(Color.white); // nomaina fona krasu
//
        JTextField textField = new JTextField();
        textField.setBounds(60,70, 300,40);
        textField.setText(" ");
//
//
        JButton button = new JButton("Saglabāt");
        button.setBackground(Color.gray);
        button.setBounds(50,100,90,30);


        frame.add(button); //pievienot pogu logam
        frame.add(textField); //pievienot teksta lauku logam


    MyFrame MyFrame = new MyFrame();
    MyFrame.Myframe();

    }
}





