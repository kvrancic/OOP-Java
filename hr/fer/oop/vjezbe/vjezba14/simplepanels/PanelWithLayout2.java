package hr.fer.oop.vjezbe.vjezba14.simplepanels;

import javax.swing.*;
import java.awt.*;

public class PanelWithLayout2 extends JPanel {
    JButton[] buttons = new JButton[5];

    public PanelWithLayout2() {
        setLayout(new GridLayout(1,0));
        for(int i = 0; i < buttons.length; i++){
            add(i % 2 == 0 ?
                    add(buttons[i] = new JButton("Button" + i)) :
                    add(buttons[i] = new JButton("Button" + i + " is very very long"))
                    );
        }
    }
}
