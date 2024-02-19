package hr.fer.oop.vjezbe.vjezba14.simplepanels;

import javax.swing.*;
import java.awt.*;

public class PanelWithLayout3 extends JPanel {

    JButton[] buttons = new JButton[5];

    public PanelWithLayout3() {
        setLayout(new GridLayout(0,2));
        for(int i = 0; i < buttons.length; i++){
            add(i != 1 ?
                    add(buttons[i] = new JButton("Button" + i)) :
                    add(buttons[i] = new JButton("Button" + i + " is very very long?"))
            );
        }
    }

}
