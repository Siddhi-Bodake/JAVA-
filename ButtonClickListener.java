import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame {
    private JTextField displayField;
    private JButton[] buttons;

    private String[] buttonLabels = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", "C", "=", "+"
    };

    private String input = "";

    public Calculator() {
        setTitle("Simple Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        displayField = new JTextField();
        displayField.setEditable(false);
        displayField.setHorizontalAlignment(SwingConstants.RIGHT);
        add(displayField, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4));

        buttons = new JButton[buttonLabels.length];

        for (int i = 0; i < buttonLabels.length; i++) {
            buttons[i] = new JButton(buttonLabels[i]);
            buttonPanel.add(buttons[i]);
            buttons[i].addActionListener(new ButtonClickListener());
        }

        add(buttonPanel, BorderLayout.CENTER);

        setSize(300, 400);
        setVisible(true);
    }

    private class ButtonClickListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String command = ((JButton) e.getSource()).getText();
            if (!command.equals("=") && !command.equals("C")) {
                input += command;
            } else if (command.equals("=")) {
                try {
                    input = evaluate(input);
                } catch (ArithmeticException ex) {
                    input = "Error";
                }
            } else {
                input = "";
            }
            displayField.setText(input);
        }
    }

    private String evaluate(String expression) {
        try {
            ScriptEngineManager manager = new ScriptEngineManager();
            ScriptEngine engine = manager.getEngineByName("JavaScript");
            return engine.eval(expression).toString();
        } catch (ScriptException e) {
            throw new ArithmeticException("Invalid Expression");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Calculator());
    }
}
