package railway;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class reservation extends Menu{
	
	private JFrame frame2;
	private JLabel strain,stpoint,destination,sclass,fareL,name,phn,age;
	private JComboBox strainC,sclassC,destinationC,stpointC;
	
	private JTextField fareT,ageT,nseat,nameT,phnT;
	private JFrame mainFrame;
	private JButton home;
	private JButton submit;
	private JButton previous;
	private JButton clear;
	
	

	public reservation() {
		super();
		
		//mainFrame = super.frame;
		frame2 = new JFrame();
		
		 strain = new JLabel("SELECT TRAIN");
		 destination = new JLabel("DESTINATION");
		 stpoint = new JLabel("START TRAVELING ");
		 sclass = new JLabel("Class");
		 fareL = new JLabel("FARE");
		 name= new JLabel("NAME");
		 phn = new JLabel("CONTRACT NUMBER");
		 age = new JLabel("AGE");
		 
		 String [] option1 = new String[]{"NONE","Subarna Express","Parabat Express","Turna Express","Lalmoni Express","Nill Shagor","Silkcity Express","DHUMKETU","CHITRA","Padma Express","Chittra Express",
				 "SHUNDARBAN","MOHANAGAR","Ekota Express","Rangpur Express","Agnibina Express"};
		 strainC = new JComboBox(option1);
		 String[] option2 = new String[]{"NONE","RAJSHAHI","NATORE","TANGAIL","DHAKA","ISHWARDI","CHATMOHOR","RANGPUR","KHULNA","NILPHAMARY"};
		 destinationC = new JComboBox(option2);
		 String[] option3 = new String[]{"NONE","RAJSHAHI","DHAKA","RANGPUR","KHULNA","NILPHAMARY","NATOR"};
		 stpointC = new JComboBox(option3);
		 String[] option4 = new String[]{"NONE","FIRST","SECOND","THIRD"};
		 sclassC = new JComboBox(option4);
		 
		 fareT= new JTextField();
		 nseat = new JTextField();
		 nameT = new JTextField();
		 phnT = new JTextField();
		 ageT = new JTextField();
		 
		 home= new JButton("Home");
		 home.addActionListener(new ActionListener ()
		 {
			 public void actionPerformed(ActionEvent e) {
				frame2.setVisible(false);
				 frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				 
				 frame.setVisible(true);
				 
			 }
		 });
		 
		 
		 submit = new JButton("SUBMIT");
		 submit.setBackground(Color.white);
		 submit.setForeground(Color.red);
		 submit.addActionListener(new ActionListener ()
		 {
			 public void actionPerformed(ActionEvent e) {
				 String y1 = nameT.getText();
				 String y2 = phnT.getText();
				 String y3 = ageT.getText();
				 String y4 = fareT.getText();
						
				 String x1 = strainC.getSelectedItem().toString();
				 String x2 = destinationC.getSelectedItem().toString();
				 String x3 = stpointC.getSelectedItem().toString();
				 String x4 = sclassC.getSelectedItem().toString();
				
				 Person p = new Person(y1,y2,y3,y4,x1,x2,x3,x4);
					System.out.println(p);
					
					addPerson(p);
					
					writeToFile();
				 
			 }
		 });
		 
		 
		 clear = new JButton("CLEAR");
		 clear.addActionListener(new ActionListener ()
		 {
			 public void actionPerformed(ActionEvent e) {
				 fareT.setText("");
				 nameT.setText("");
				 nseat.setText("");
				 phnT.setText("");
				 ageT.setText("");
				 
					strainC.setSelectedIndex(0);
					destinationC.setSelectedIndex(0);
					stpointC.setSelectedIndex(0);
					sclassC.setSelectedIndex(0);
				 
			 }
		 });
		 
		
		 previous = new JButton("<");
		 previous.addActionListener(new ActionListener ()
		 {
			 public void actionPerformed(ActionEvent e) {
				 
				 frame.setVisible(true);
				 
				 
				 
				frame2.setVisible(false);
				frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
				 
				 
			 }
		 });
		 
		 
		 GridLayout g = new GridLayout(5,2);
		 frame2.setLayout(g);
		 
		 frame2.add(strain);
		 frame2.add(strainC);
		 
		 frame2.add(name);
		 frame2.add(nameT);
		 
		 frame2.add(destination);
		 frame2.add(destinationC);
		 
		 frame2.add(phn);
		 frame2.add(phnT);
		 
		 frame2.add(stpoint);
		 frame2.add(stpointC);
		 
		 frame2.add(fareL);
		 frame2.add(fareT);
		 
		 frame2.add(sclass);
		 frame2.add(sclassC);
		 
		 
		 frame2.add(age);
		 frame2.add(ageT);
		 
		 frame2.add(home);
		 frame2.add(submit);
		 frame2.add(clear);
		 frame2.add(previous);
		 
		frame2.setVisible(true);
			frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame2.setSize(500, 260);
			frame2.setLocation(200, 200);
			frame2.setTitle("RESERVATION");	
	}
}
