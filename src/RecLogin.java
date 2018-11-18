import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputMethodEvent;
import java.awt.event.InputMethodListener;

public class RecLogin {
    public  JTextField username = new JTextField();
    public  JButton loginButton  = new JButton("Login");
    public  JPasswordField passwordField1 = new JPasswordField();
    public  JPanel panel1 = new JPanel();

    public RecLogin() {
        panel1.add(username);
        panel1.add(passwordField1);
        panel1.add(loginButton);
        
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JFrame frame = new JFrame("RecSite");
                frame.setContentPane(new RecSite().panel1);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setVisible(true);
            }
        });
        username.addInputMethodListener(new InputMethodListener() {
            @Override
            public void inputMethodTextChanged(InputMethodEvent inputMethodEvent) {
                JTextField txtInput = new JTextField("");
                String userame=username.getText();
            }

            @Override
            public void caretPositionChanged(InputMethodEvent inputMethodEvent) {

            }
        });
        passwordField1.addInputMethodListener(new InputMethodListener() {
            @Override
            public void inputMethodTextChanged(InputMethodEvent inputMethodEvent) {
                JTextField txtInput = new JTextField("");
                String password=passwordField1.getText();
            }

            @Override
            public void caretPositionChanged(InputMethodEvent inputMethodEvent) {

            }
        });

    }
}
