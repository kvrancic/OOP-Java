package hr.fer.oop.vjezbe.vjezba14.emailclient;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class EmailClient extends JFrame {
    private JButton mailButton = new JButton("Send e-mail");
    private JButton clearButton = new JButton("Clear Message");

    public EmailClient() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(200, 200, 400, 480);

        setTitle("E - mail client");
        setLayout(new BorderLayout());
        JPanel panel = (JPanel) this.getContentPane();
        panel.setBorder(BorderFactory.createEmptyBorder(8,8,8,8));
        panel.setLayout(new BorderLayout());

        JPanel northPanel = new JPanel();
        northPanel.setLayout(new BorderLayout());

        JPanel fieldPanel = new JPanel();
        fieldPanel.setLayout(new GridLayout(0,1));
        fieldPanel.add(new JTextField());
        fieldPanel.add(new JTextField());
        fieldPanel.add(new JTextField());
        fieldPanel.add(new JTextField());

        JPanel labelField = new JPanel();
        labelField.setLayout(new GridLayout(0, 1));
        labelField.add(new JLabel("From:", SwingConstants.RIGHT));
        labelField.add(new JLabel("To:", SwingConstants.RIGHT));
        labelField.add(new JLabel("Subject:", SwingConstants.RIGHT));
        labelField.add(new JLabel("Message:", SwingConstants.RIGHT));

        northPanel.add(fieldPanel, BorderLayout.CENTER);
        northPanel.add(labelField, BorderLayout.WEST);
        panel.add(northPanel, BorderLayout.NORTH);
        panel.add(new JTextField(), BorderLayout.CENTER);

        JPanel southPanel = new JPanel();
        southPanel.add(mailButton);
        southPanel.add(clearButton);
        panel.add(southPanel, BorderLayout.SOUTH);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(EmailClient::new);
    }
}
