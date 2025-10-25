package org.qainsights.guidemo;

import java.awt.event.*;
import javax.swing.*;

public class GuiDriver implements ActionListener  {

    private JFrame jFrame;
    private JButton jButton; // instance variable
    private JButton resetButton;

    private int counter;


    public static void main(String[] args) {

        GuiDriver g = new GuiDriver();
        g.go();
    }

    private void go() {
        jFrame = new JFrame();
        jButton = new JButton("OK"); // local variable
        resetButton = new JButton("Reset");

         // Add both buttons to the frame
        JPanel panel = new JPanel();
        panel.add(jButton);
        panel.add(resetButton);



        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.getContentPane().add(panel);
 

        jButton.addActionListener(this);
        resetButton.addActionListener(this);


        jFrame.setSize(300, 300);
        jFrame.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        jButton.setText("Clicked " + ++counter);

        if ("Reset".equals(e.getActionCommand())){
            System.out.println("Reset");
            jButton.setText("OK");
            counter = 0;
        }
    }

    

}
