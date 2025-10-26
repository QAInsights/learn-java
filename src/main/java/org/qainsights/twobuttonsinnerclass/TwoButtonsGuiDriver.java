package org.qainsights.twobuttonsinnerclass;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TwoButtonsGuiDriver {

    private JButton okButton;
    private JButton cancelButton;
    private int okCounter;
    private int cancelCounter;


    public static void main(String[] args) {
        TwoButtonsGuiDriver twoButtonsGuiDriver = new TwoButtonsGuiDriver();
        twoButtonsGuiDriver.display();
    }


    private void display() {

        JFrame jFrame = new JFrame();
        okButton = new JButton("OK");
        cancelButton = new JButton("Cancel");

        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

         // Add both buttons to the frame
        JPanel panel = new JPanel();
        panel.add(okButton);
        panel.add(cancelButton);
        
        okButton.addActionListener(event -> {
            okButton.setText("OK Clicked " + ++okCounter);
            okButton.setBackground(Color.BLUE);
        });

        cancelButton.addActionListener(event -> cancelButton.setText("Cancel clicked " + ++cancelCounter));

        jFrame.getContentPane().add(BorderLayout.EAST, okButton);
        jFrame.getContentPane().add(BorderLayout.SOUTH, cancelButton);

        jFrame.setSize(300, 300);
        jFrame.setVisible(true);

    }

     
}
