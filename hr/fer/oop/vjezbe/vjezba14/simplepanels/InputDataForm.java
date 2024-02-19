package hr.fer.oop.vjezbe.vjezba14.simplepanels;

import javax.swing.*;
import java.awt.*;

public class InputDataForm extends JPanel {
    JLabel name = new JLabel("Name:", SwingConstants.RIGHT);
    JTextField field = new JTextField();
    JTextField addressField = new JTextField();
    JCheckBox vaccinated = new JCheckBox("vaccinated");
    JLabel address = new JLabel("Address:", SwingConstants.RIGHT);

    public InputDataForm() {
        setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
        setLayout(new GridLayout(3, 2, 5, 5));
        add(name);
        add(field);
        add(new JLabel());
        add(vaccinated);
        add(address);
        add(addressField);
    }
}
