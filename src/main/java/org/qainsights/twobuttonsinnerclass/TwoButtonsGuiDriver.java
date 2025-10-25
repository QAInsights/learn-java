package org.qainsights.twobuttonsinnerclass;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;

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
        
        OkButtonListener okButtonListener = new OkButtonListener();
        okButton.addActionListener(okButtonListener);

        CancelButtonListener cancelButtonListener = new CancelButtonListener();
        cancelButton.addActionListener(cancelButtonListener);

        jFrame.getContentPane().add(BorderLayout.EAST, okButton);
        jFrame.getContentPane().add(BorderLayout.SOUTH, cancelButton);

        jFrame.setSize(300, 300);
        jFrame.setVisible(true);        

    }

    class OkButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            okButton.setText("OK clicked " + ++okCounter);
        }

    }

    class CancelButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            cancelButton.setText("Cancel Clicked " + ++cancelCounter);            
        }
        
    }   
}
