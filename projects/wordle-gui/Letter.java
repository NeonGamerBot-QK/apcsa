import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

public class Letter {

    private char letter = '_';
    private int status = 2; // -1 for not in word, 0 for wrong pos, 1 for right pos, 2 for inactive
    private JLabel label = new JLabel(Character.toString(this.letter), SwingConstants.CENTER);
    

    public Letter() {

        this.label.setText(Character.toString(this.letter).toUpperCase());
        this.label.setOpaque(true);
        this.label.setBackground(Color.GRAY);

        this.label.setPreferredSize(new Dimension(50, 50));
        this.label.setFont(new Font("Arial", Font.BOLD, 16));
        Border border = BorderFactory.createLineBorder(Color.LIGHT_GRAY);
        this.label.setBorder(border);
    }

    public void setLetter(char letter, int status) {
        this.letter = letter;
        this.status = status;
        this.label.setText(Character.toString(this.letter).toUpperCase());
        if (this.status == -1 | this.status == 2) {
            this.label.setBackground(Color.GRAY);
        } else if (status == 0) {
            this.label.setBackground(Color.YELLOW);
        } else if (status == 1) {
            this.label.setBackground(Color.GREEN);
        }
    }

    public char getLetter() {
        return this.letter;
    }

    public int getStatus() {
        return this.status;
    }

    public JLabel getLabel() {
        return this.label;
    }



}