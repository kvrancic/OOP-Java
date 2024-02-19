package hr.fer.oop.vjezbe.vjezba14.scoreboards;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Scoreboard extends JFrame {
    private JButton resetButton = new JButton("Reset");
    private JButton redPoint = new JButton("New point for red");
    private JButton bluePoint = new JButton("New point for blue");
    private JLabel blueLabel = new JLabel("0", SwingConstants.CENTER);
    private JLabel redLabel = new JLabel("0", SwingConstants.CENTER);

    public Scoreboard(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Scoreboard");
        setBounds(200, 200, 500, 200);


        setLayout(new BorderLayout());
        add(resetButton, BorderLayout.NORTH);

        JPanel scorePanel = new JPanel(new GridLayout(1,0, 4, 4));
        redLabel.setBackground(Color.RED);
        redLabel.setOpaque(true);
        blueLabel.setBackground(Color.BLUE);
        blueLabel.setOpaque(true);
        scorePanel.add(redLabel);
        scorePanel.add(blueLabel);
        add(scorePanel, BorderLayout.CENTER);

        JPanel pointPanel = new JPanel();
        pointPanel.add(redPoint);
        pointPanel.add(bluePoint);
        add(pointPanel, BorderLayout.SOUTH);

        redPoint.addActionListener(e -> redLabel.setText(String.valueOf(Integer.parseInt(redLabel.getText()) + 1)));
        bluePoint.addActionListener(e -> blueLabel.setText(String.valueOf(Integer.parseInt(blueLabel.getText()) + 1)));
        resetButton.addActionListener(e -> {
            blueLabel.setText(String.valueOf(0));
            redLabel.setText(String.valueOf(0));
        });


        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Scoreboard::new);
    }
}
