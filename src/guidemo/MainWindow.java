package guidemo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow extends JFrame {
    private JCheckBox hardModeCheckBox;
    private JButton submitGuessButton;
    private JPanel mainPanel;
    private JTextField textField1;

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
                if(textField1.getText().equals("3")){
                    results+="correct";
                } else {
                    results+="incorrect";
                }
                JOptionPane.showMessageDialog(MainWindow.this, results);
            }
        });
    }


    public static void main(String[] args) {
        new MainWindow();
    }
}
