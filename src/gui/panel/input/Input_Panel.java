package gui.panel.input;

import game.Game;
import game.WhichScene;
import gui.panel.Panel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static game.WhichScene.THE_ENTITY;

public class Input_Panel extends Panel implements ActionListener {
    private final JTextField textField;
    private InputListener inputListener;

    public Input_Panel(GridBagConstraints gbc){
        super();

        textField = new JTextField();
        textField.addActionListener(this);
        textField.setBackground(Color.black);
        textField.setForeground(new Color(0x00FF35));
        textField.setFont(new Font("Jetbrains Mono", Font.PLAIN,20));
        textField.setCaretColor(Color.green);

        this.add(textField, BorderLayout.CENTER);


        gbc.gridx = 1; // Column 0
        gbc.gridy = 1; // Row 1
        gbc.gridwidth = 1; // Span 1 columns
        gbc.gridheight = 1; // Span 1 row
        gbc.weightx = 1; // Equal horizontal space across both columns
        gbc.weighty = 0.01; // Small vertical space
        gbc.fill = GridBagConstraints.BOTH; // Fill both horizontal and vertical space
        gbc.insets = new Insets(10,10,10,10);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        String input = textField.getText();
        System.out.println("Nitype ug : " + input);

        if (inputListener != null) {
            inputListener.onInputReceived(input);
        }

        if(input.equals("exit this")) System.exit(0);

        textField.setText("");
    }

    public void setInputListener(InputListener inputListener) {
        this.inputListener = inputListener;
    }

}
