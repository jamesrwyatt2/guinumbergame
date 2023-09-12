package guidemo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow extends JFrame {
    private JCheckBox hardModeCheckBox;
    private JButton submitGuessButton;
    private JPanel mainPanel;
    private JTextField textField1;
    private JLabel inputLabel;

    public MainWindow() {
        setContentPane(mainPanel);
        setTitle("Number Guessing Game");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300,200);
        setLocationRelativeTo(null);
        setVisible(true);

        submitGuessButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String results = "Your guess is ";
                if(hardModeCheckBox.isSelected()) {
                    if (textField1.getText().equals("8")) {
                        results += "correct";
                    } else {
                        results += "incorrect";
                    }

                } else {
                    if (textField1.getText().equals("3")) {
                        results += "correct";
                    } else {
                        results += "incorrect";
                    }
                }
                JOptionPane.showMessageDialog(MainWindow.this, results);
            }
        });
        hardModeCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(hardModeCheckBox.isSelected()) {
                    inputLabel.setText("Input a number 1 - 10");
                } else {
                    inputLabel.setText("Input a number 1 - 5");
                }
            }
        });
    }


    public static void main(String[] args) {
        new MainWindow();
    }
}
