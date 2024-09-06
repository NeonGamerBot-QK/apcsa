import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;

/**
 * A GUI class to run the Magpie class.
 * Requires javax.swing and java.awt
 * @author Kim Hermans
 * @August 2024
 */

public class MagpieGUIRunner5 
{
    private JFrame frame;
    private JPanel chatPanel, menuPanel, mainPanel, replyPanel, buttonPanel;
    private JTextField replyTextField;
    private JTextPane chatTextArea;
    private JScrollPane scroll;
    private JButton submitButton;
    private JRadioButton originalRadioButton, customRadioButton;
    private ButtonGroup options;
    private Magpie5 magpie;
    
    public MagpieGUIRunner5()
    {
        magpie = new Magpie5();
        frame = new JFrame();
        frame.setSize(780, 500);
        frame.setTitle("Magpie Chatbot");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        chatPanel = new JPanel(new BorderLayout());
        chatTextArea = new JTextPane();
        chatTextArea.setText("--------------Welcome to Magpie Chatbot ------------------");
        chatTextArea.setEditable(false);
        scroll = new JScrollPane(chatTextArea);
        scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        chatPanel.add(scroll, BorderLayout.CENTER);
        
        GridBagConstraints c = new GridBagConstraints();
        replyPanel = new JPanel();
        replyTextField = new JTextField(60);
        replyTextField.setSize(400, 10);
        replyTextField.addKeyListener(new EnterSubmitListener());
        replyPanel.setLayout(new GridBagLayout());
        replyPanel.add(replyTextField,c );//, BorderLayout.CENTER);
        
        submitButton = new JButton("Reply");
        submitButton.addActionListener(new ReplyButtonListener());
        buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridBagLayout());
        buttonPanel.add(submitButton, c);
        
        menuPanel = new JPanel();
        menuPanel.setLayout(new GridBagLayout());
       
        originalRadioButton = new JRadioButton("Original");
        customRadioButton = new JRadioButton("Custom");
        
        options = new ButtonGroup();
        options.add(originalRadioButton);
        options.add(customRadioButton);
        originalRadioButton.setSelected(true);
        
        c.gridx = 0; 
        c.gridy = 0;
        menuPanel.add(originalRadioButton, c);
        c.gridy = 1;
        menuPanel.add(customRadioButton, c);
        
        mainPanel = new JPanel();
        fillLayout();
       
        frame.add(mainPanel);
        frame.setVisible(true);
    }
    
    public void fillLayout()
    {
        mainPanel.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.BOTH;
        c.weightx = 85;
        c.weighty = 85;
        c.gridx = 0;
        c.gridy = 0;
        mainPanel.add(chatPanel, c);
        c.weightx = 15;
        c.gridx = 1;
        mainPanel.add(menuPanel, c);
        c.weightx = 85;
        c.weighty = 15;
        c.gridx = 0; 
        c.gridy = 1;
        mainPanel.add(replyPanel, c);
        c.weightx = 15;
        c.weighty = 15;
        c.gridx = 1;
        mainPanel.add(buttonPanel, c);
    }
    
    class ReplyButtonListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) 
        {
            String chat = chatTextArea.getText() + "\n" + "Me: " + replyTextField.getText() + "\n" + "Magpie: " ;
            if(originalRadioButton.isSelected())
                chat += magpie.getResponse(replyTextField.getText());
            else
                chat += magpie.getCustomResponse(replyTextField.getText());
            chatTextArea.setText(chat);
            replyTextField.setText("");
        }
    }
    
    class EnterSubmitListener implements KeyListener
    {
        @Override
        public void keyTyped(KeyEvent e) {}

        @Override
        public void keyPressed(KeyEvent e) 
        {
            if(e.getKeyCode() == KeyEvent.VK_ENTER)
            {
                    submitButton.doClick();
            }
        }

        @Override
        public void keyReleased(KeyEvent e) {}
    }
    public static void main(String [] args)
    {
        MagpieGUIRunner5 init = new MagpieGUIRunner5();
    }
}
