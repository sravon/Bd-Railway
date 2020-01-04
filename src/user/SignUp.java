package user;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.*;

public class SignUp {
    private JFrame frame;
    JLabel title,username,fname,lname,email, password,repass,show;
    JTextField finput,linput,emailin,user,repassIn, pass;
    JButton btn;
    public SignUp() {
        frame = new JFrame("Create A Account");
        frame.setSize(410,354);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel pnl = new JPanel(new GridBagLayout());

        frame.getContentPane().add(pnl,BorderLayout.NORTH);

        GridBagConstraints c = new GridBagConstraints();
        c.insets = new Insets(10,10,10,10);

        fname = new JLabel("Firstname: ");
        c.gridx = 0;
        c.gridy = 1;
        pnl.add(fname,c);

        finput = new JTextField(10);
        c.gridx = 1;
        c.gridy = 1;
        pnl.add(finput,c);

        lname = new JLabel("Lastname: ");
        c.gridx = 0;
        c.gridy = 2;
        pnl.add(lname,c);

        linput = new JTextField(10);
        c.gridx = 1;
        c.gridy = 2;
        pnl.add(linput,c);

        username = new JLabel("Username");
        c.gridx = 0;
        c.gridy = 3;
        pnl.add(username,c);

        user = new JTextField(10);
        c.gridx = 1;
        c.gridy = 3;
        pnl.add(user,c);

        email = new JLabel("Email: ");
        c.gridx = 0;
        c.gridy = 4;
        pnl.add(email,c);

        emailin = new JTextField(10);
        c.gridx = 1;
        c.gridy = 4;
        pnl.add(emailin,c);

        password = new JLabel("password");
        c.gridx = 0;
        c.gridy = 5;
        pnl.add(password,c);

        pass = new JTextField(10);
        c.gridx = 1;
        c.gridy = 5;
        pnl.add(pass,c);

        repass = new JLabel("Re-password");
        c.gridx = 0;
        c.gridy = 6;
        pnl.add(repass,c);

        repassIn = new JTextField(10);
        c.gridx = 1;
        c.gridy = 6;
        pnl.add(repassIn,c);

        JPanel pt = new JPanel(new FlowLayout());
        frame.add(pt);

        btn = new JButton("SignUp");
        //how = new JButton("show");
        pt.add(btn);
        //pt.add(show);

        Btnhandler handle = new Btnhandler();
        btn.addActionListener(handle);
        //.addActionListener(handle);

    }
    private class Btnhandler implements ActionListener
    {
        public void actionPerformed (ActionEvent e)
        {
            String username = user.getText();
            String password = pass.getText();
            if(e.getSource() == btn) {
               // show.setText(username + " " + password);
                try {
                    userFileRewriting(username);
                    passwordFileRewriting(password);
                } catch (IOException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }
                frame.setVisible(false);
                frame.getDefaultCloseOperation();
                new Login();
            }
        }
    }
    public void userFileRewriting(String name) throws IOException {
        String textToAppend = " "+ name;

        BufferedWriter writer = new BufferedWriter(
                new FileWriter("/Users/abdurrahmankazi/Desktop/userinformation/user.txt", true)  //Set true for append mode
        );
        // writer.newLine();   //Add new line
        writer.write(textToAppend);
        writer.close();
    }
    public void passwordFileRewriting(String password) throws IOException {
        String textToAppend = " "+ password;

        BufferedWriter writer = new BufferedWriter(
                new FileWriter("/Users/abdurrahmankazi/Desktop/userinformation/password.txt", true)  //Set true for append mode
        );
        // writer.newLine();   //Add new line
        writer.write(textToAppend);
        writer.close();
    }
}

