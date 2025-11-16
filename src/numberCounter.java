import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class numberCounter extends JFrame {
    private JTextField userInput;
    private JButton countButton;
    private JPanel mainPanel;
    private JLabel resultText;

    public numberCounter(String title) {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setLocation(650, 500);
        this.setContentPane(mainPanel);
        this.pack();
        countButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                List<Integer> numbers = new ArrayList<>();
                String input = userInput.getText();
                int size = input.length();

                char[] array = new char[size];
                array = input.toCharArray();

                for(char c : array) {
                    if(Character.isDigit(c)) {
                        int n = c - '0';
                        numbers.add(n);
                    }
                }

                if(numbers.size()==0) {
                    resultText.setText("None");
                } else {
                    resultText.setText(numbers.size() + "");
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new numberCounter("Kim's Number Counter");

    }

}
