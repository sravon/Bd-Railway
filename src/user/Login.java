package user;
import java.awt.*;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;




public class Login {
    private JFrame frame;
    JLabel username, password;
    JTextField user, pass;
    JButton btn,signup;
    ButtonController mcc;
    public Login() {
        frame = new JFrame("Log In");
        frame.setSize(300,180);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel pnl = new JPanel(new GridBagLayout());
        frame.getContentPane().add(pnl,BorderLayout.NORTH);

        GridBagConstraints c = new GridBagConstraints();

        username = new JLabel("Username");
        c.gridx = 0;
        c.gridy = 0;
        pnl.add(username,c);

        user = new JTextField(10);
        c.gridx = 1;
        c.gridy = 0;
        pnl.add(user,c);

        password = new JLabel("password");
        c.gridx = 0;
        c.gridy = 1;
        pnl.add(password,c);

        pass = new JTextField(10);
        c.gridx = 1;
        c.gridy = 1;
        pnl.add(pass,c);

        JPanel pt = new JPanel(new FlowLayout());
        frame.add(pt);

        btn = new JButton("Log In");
        signup = new JButton("Sign Up");
        pt.add(btn);
        pt.add(signup);

        Btnhandler handle = new Btnhandler();
        btn.addActionListener(handle);
        signup.addActionListener(handle);
        mcc = new ButtonController();
    }

    private class Btnhandler implements ActionListener
    {

        public void actionPerformed (ActionEvent e)
        {
            String username = user.getText();
            String password = pass.getText();
            if(e.getSource() == btn) {
                mcc.printUP(username, password);
            }
            if(e.getSource() == signup) {
                frame.setVisible(false);
                frame.getDefaultCloseOperation();
                new SignUp();
            }
        }
    }
}
