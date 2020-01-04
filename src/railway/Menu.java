package railway;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;

import help.Main;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Menu implements ActionListener{
	
	//WINDOW FRAME
	public JFrame frame;
	private JFrame frame4,frame5,frame6,frame7;
	private JButton reservation,counter,traininfo,fare,cancel,term;
	
	//RESERVATION'S INTERFACE
	//LABELS
	
	private JLabel  strain,destination,stpoint,sclass,fareL,name,phn,age;
	
	//RESERVATION'S JTEXTFIELDS
	private JTextField fareT,nseat,nameT,phnT,ageT;
	
	//RESERVATION'S JCOMBOBOX
	private JComboBox strainC,destinationC,stpointC,sclassC;
	
	//COUNTER CHECK INTERFACE
	//LEBELS
	private JLabel tseat,sold,aseat;
	
	//TEXTFIELDS
	private JTextField tseatT,soldT,aseatT;
	//TRAIN INFORMATION INTERFACE
	
	//Cancel reservation interface
	
	private JTextField srchT;
	private JButton srch;
	
	
	private Person[] persons;
	
	public Menu(){
		frame = new JFrame();
		
		reservation = new JButton("RESERVATION");
		 counter= new JButton("COUNTER CHECK");
		 traininfo = new JButton("TRAIN INFORMATION");
		 fare = new JButton("FARE");
		 cancel = new JButton("CANCEL RESERVATION");
		 term = new JButton("Help");
		 
		 reservation.addActionListener(this);
		 counter.addActionListener(this);
		 traininfo.addActionListener(this);
		 fare.addActionListener(this);
		 cancel.addActionListener(this);
		 term.addActionListener(this);
		 
		 GridLayout g = new GridLayout(3,2);
		 frame.setLayout(g);
		 
		 frame.add(reservation);
		 frame.add(counter);
		 frame.add(traininfo);
		 frame.add(fare);
		 frame.add(cancel);
		 frame.add(term);
		 
		 
		 frame.setVisible(true);
		 	
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setSize(500, 260);
			frame.setLocation(200, 100);
			frame.setTitle("বাংলাদেশ রেলওয়ে");
	}


	public void writeToFile(){ // write the student records from array to file
		try {
			File f = new File("\\Users\\abdurrahmankazi\\Desktop\\Project\\src\\Railway.txt");
			FileWriter fw = new FileWriter(f);
			
			for(int i = 0; i < persons.length; i++){
				if(persons[i] != null){
					fw.write("Name :" +persons[i].getName()); // write id in one line
					fw.write("\n");
					fw.write("Phone Number :"+persons[i].getPhn()); // write name in another line
					fw.write("\n");
					fw.write("Age :"+persons[i].getAge());
					fw.write("\n");
					fw.write("Train Name :"+persons[i].getStrain());
					fw.write("\n");
					fw.write("Destination :"+persons[i].getDestination());
					fw.write("\n");
					fw.write("Starting Point :"+persons[i].getStpoint());
					fw.write("\n");
					fw.write("Seat Class :"+persons[i].getSclass());
					fw.write("\n");
					fw.write("Fare :"+persons[i].getFare());
					fw.write("\n");
				}
			}
			
			fw.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public void readFromFile(){ // read the students records from file and store in an array
		try {
			File f = new File("/Users/abdurrahmankazi/Desktop/Project/src/Railway.txt");
			Scanner s = new Scanner(f);
			persons = new Person [50]; // since we don't know the exact number of records, initialize the array to a reasonably sized one
			int i = 0;
			
			while(s.hasNextLine()){
				String a = s.nextLine(); // read id;
				String b = s.nextLine();
				String c = s.nextLine();
				String d = s.nextLine();
				String e = s.nextLine();
				String g = s.nextLine();
				String h = s.nextLine();
				String j = s.nextLine();
				Person temp = new Person (a,b,c,d,e,g,h,j); // create Student object
				persons[i] = temp; // store in array
				i++;
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
 
	public void addPerson(Person p){ // adds the student object into array
		// find an available index first
		int index = 0;
		persons = new Person[50];
		
		for(int i = 0; i < persons.length; i++){
			if(persons[i] == null){ // location available
				index = i;
				break;
			}
		}
		
		if(index < persons.length){
			persons[index] = p;
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		if(e.getSource() == reservation){
				 frame.setVisible(false);
				 frame.getDefaultCloseOperation();
				 new reservation();	
		}
		
			
		if(e.getSource() == counter){
			new counting();
		}	
		if(e.getSource() == traininfo){
			frame4= new JFrame();
			
			GridLayout g =new GridLayout(1,1);
			frame4.setLayout(g);
			
			frame.setVisible(false);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame4.setVisible(true);
				frame4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame4.setSize(500, 260);
				frame4.setLocation(200, 200);
				frame4.setTitle("TRAIN INFORMATION");
		}	
		if(e.getSource() == fare){
			frame5= new JFrame();
			
			//GridLayout g= new GridLayout(1,1);
			//frame5.setLayout(g);
			
			frame.setVisible(false);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame5.setVisible(true);
			JPanel pnl = new JPanel(new GridBagLayout());
	        frame5.getContentPane().add(pnl,BorderLayout.NORTH);

	        GridBagConstraints c = new GridBagConstraints();
	        c.insets = new Insets(10,10,10,10);
	        
	        JLabel fname = new JLabel("First Class ");
	        c.gridx = 0;
	        c.gridy = 1;
	        pnl.add(fname,c);

	        JTextField finput = new JTextField(10);
	        finput.setText("800");
	        c.gridx = 1;
	        c.gridy = 1;
	        pnl.add(finput,c);

	        JLabel lname = new JLabel("Second Class");
	        c.gridx = 0;
	        c.gridy = 2;
	        pnl.add(lname,c);

	        JTextField linput = new JTextField(10);
	        linput.setText("500");
	        c.gridx = 1;
	        c.gridy = 2;
	        pnl.add(linput,c);

	        JLabel username = new JLabel("Third Class");
	        c.gridx = 0;
	        c.gridy = 3;
	        pnl.add(username,c);

	        JTextField user = new JTextField(10);
	        user.setText("300");
	        c.gridx = 1;
	        c.gridy = 3;
	        pnl.add(user,c);
	        
				frame5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame5.setSize(500, 260);
				frame5.setLocation(200, 200);
				frame5.setTitle("FARE");
			
			
		}	
		if(e.getSource() == cancel){
			frame6= new JFrame();
			
			srchT = new JTextField();
			srch = new JButton("Search");
			srch.addActionListener(new ActionListener ()
			 {
				 public void actionPerformed(ActionEvent e) {
						
				 }
			 });
			
			
			GridLayout g= new GridLayout(2,2);
			frame6.setLayout(g);
			
			
			frame6.add(srchT);
			frame6.add(srch);
			
			
			frame.setVisible(false);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame6.setVisible(true);
				frame6.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame6.setSize(500, 260);
				frame6.setLocation(200, 200);
				frame6.setTitle("CANCEL RESERVATION");
			
		}	
		if(e.getSource() == term){
			new Main();
		}
		
		
		}	
		
	
}
	



