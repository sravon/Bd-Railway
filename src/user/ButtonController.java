package user;
import javax.swing.*;

import railway.Menu;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class ButtonController {
    static String name;
    static String password;
    public void printUP(String userUI,String passUI) {
       // System.out.println(userUI + " " + passUI);

        try
        {
            File file1=new File("/Users/abdurrahmankazi/Desktop/userinformation/user.txt");
            //creates a new file instance

            FileReader fr1 =new FileReader(file1);   //reads the file


            BufferedReader br1 =new BufferedReader(fr1);  //creates a buffering character input stream

            StringBuffer sb1=new StringBuffer();    //constructs a string buffer with no characters

            String line1,line2;
            while((line1 = br1.readLine())!=null)
            {
                sb1.append(line1);

               // sb1.append("\n");

            }
            name = sb1.toString();
            fr1.close();
            File file2 =new File("/Users/abdurrahmankazi/Desktop/userinformation/password.txt");
            FileReader fr2 =new FileReader(file2);
            BufferedReader br2 =new BufferedReader(fr2);
            StringBuffer sb2=new StringBuffer();
            while((line2 = br2.readLine())!=null)
            {
                sb2.append(line2);

               // sb2.append("\n");

            }
            password = sb2.toString();
            fr2.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }

        String[] user1 = name.split(" ");
        String[] pass1 = password.split(" ");
        for (int i = 0; i < user1.length; i++) {

            if((user1[i].equals(userUI)) && (pass1[i].equals(passUI))) {
                
                new Menu();
                break;
                

            }/*else if((user1[user1.length - 1] != (userUI)) && (pass1[pass1.length - 1] != (passUI))){
                JOptionPane.showMessageDialog(null, "Invalid Information");
            }
*/
        }

    }

 }

