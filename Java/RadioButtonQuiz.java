import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RadioButtonQuiz extends JFrame implements ActionListener {

    private JRadioButton[][] options; // 2D Array to store radio buttons for each question
    private ButtonGroup[] buttonGroups; // Array to store ButtonGroups
    private JTextField nameField;
    private JButton submitButton;
    
    private final String[][] questions = {
        {"Who was the first President of India?", "Rajendra Prasad", "Jawaharlal Nehru"},
        {"Who was the first Prime Minister of India?", "Rajendra Prasad", "Jawaharlal Nehru"},
        {"In which year did India gain its independence from British rule?", "1950", "1947"},
        {"In which year did India become a republic?", "1950", "1947"},
        {"In which year did Rabindranath Tagore win the Nobel Prize in Literature?", "1913", "1912"},
        {"In which year was the Azad Hind Fauz formed?", "1942", "1943"}
    };
    
    private final int[] correctAnswers = {0, 1, 1, 0, 0, 0}; // Index of correct answer in each question

    public RadioButtonQuiz() {
        setTitle("Quiz Application");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 700);
        setLocationRelativeTo(null);
        setResizable(false);

        // Create panel with vertical layout for better structure
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        // Name input section
        JPanel namePanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        namePanel.add(new JLabel("Please enter your name: "));
        nameField = new JTextField(20);
        namePanel.add(nameField);
        panel.add(namePanel);

        // Initialize arrays
        options = new JRadioButton[questions.length][2];
        buttonGroups = new ButtonGroup[questions.length];

        // Add questions and radio buttons dynamically
        for (int i = 0; i < questions.length; i++) {
            JPanel questionPanel = new JPanel();
            questionPanel.setLayout(new BoxLayout(questionPanel, BoxLayout.Y_AXIS));
            questionPanel.setBorder(BorderFactory.createTitledBorder("Question " + (i + 1)));

            JLabel questionLabel = new JLabel(questions[i][0]);
            questionPanel.add(questionLabel);

            buttonGroups[i] = new ButtonGroup();

            for (int j = 0; j < 2; j++) {
                options[i][j] = new JRadioButton(questions[i][j + 1]);
                buttonGroups[i].add(options[i][j]);
                questionPanel.add(options[i][j]);
            }

            panel.add(questionPanel);
        }

        // Submit button
        submitButton = new JButton("Submit");
        submitButton.addActionListener(this);
        panel.add(submitButton);

        // Add panel to frame and make it visible
        add(panel);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int score = 0;
        
        // Calculate score
        for (int i = 0; i < questions.length; i++) {
            if (options[i][correctAnswers[i]].isSelected()) {
                score++;
            }
        }

        // Show result
        String name = nameField.getText().trim();
        if (name.isEmpty()) name = "User"; // Default name if empty

        JOptionPane.showMessageDialog(this, name + ", your score is: " + score + "/" + questions.length);

        // Reset form
        nameField.setText("");
        for (ButtonGroup group : buttonGroups) {
            group.clearSelection();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(RadioButtonQuiz::new); // Ensures proper thread handling
    }
}
