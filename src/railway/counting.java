package railway;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class counting extends Menu{
	
	private JFrame frame3;
	private JLabel strain;
	private JLabel tseat;
	private JLabel sold;
	private JLabel aseat;
	private JComboBox strainC;
	private JTextField tseatT;
	private JTextField soldT;
	private JTextField aseatT;
	private JButton home;
	private JButton submit;
	private JButton clear;
	private JButton previous;

	public counting() {
		frame3 = new JFrame();
		strain = new JLabel("Select Train");
		tseat = new JLabel("Total Seat");
		sold = new JLabel("Sold Out");
		aseat = new JLabel("Available Seat");
		
		CounterCheck c= new CounterCheck(null,null,null,null);
		c.writeToFile2();
		
		String [] option1 = new String[]{"NONE","Subarna Express","Parabat Express","Turna Express","Lalmoni Express","Nill Shagor","Silkcity Express","DHUMKETU","CHITRA","Padma Express","Chittra Express",
				 "SHUNDARBAN","MOHANAGAR","Ekota Express","Rangpur Express","Agnibina Exxpress"};
		strainC= new JComboBox(option1);
		tseatT = new JTextField();
		soldT =new  JTextField();
		aseatT = new JTextField();
		
		
		
		if(strainC.getSelectedItem().toString().equals("Subarna Express")){
			tseatT = new JTextField();
			soldT =new  JTextField();
			aseatT = new JTextField();
		}
		
		
		home= new JButton("Home");
		 
		 home.addActionListener(new ActionListener ()
		 {
			 public void actionPerformed(ActionEvent e) {
				frame3.setVisible(false);
				 frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				 
				 frame.setVisible(true);
				 
			 }
		 });
		 
		 
		 
		 submit= new JButton("SUBMIT");
		 submit.addActionListener(new ActionListener ()
		 {
			 public void actionPerformed(ActionEvent e) {
				 String y1 = tseatT.getText();
				 String y2 = soldT.getText();
				 String y3 = aseatT.getText();
				
						
				 String x1 = strainC.getSelectedItem().toString();
				
				
				 CounterCheck c = new CounterCheck(y1,y2,y3,x1);
					System.out.println(c);
				 
			 }
		 });
		 
		 
		 
		 clear =new JButton("CLEAR");
		 clear.addActionListener(new ActionListener ()
		 {
			 public void actionPerformed(ActionEvent e) {
					strainC.setSelectedIndex(0);
			 }
		 });
		 
		 
		 previous = new JButton("<");
		 previous.addActionListener(new ActionListener ()
		 {
			 private JComponent frame2;

			public void actionPerformed(ActionEvent e) {
				 
				//reservation fr2 = new reservation();
			
				 frame3.setVisible(false);
				 frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				 
				 
				//frame2.setVisible(true);
				new reservation();
				//frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
				 
				 
			 }
		 });
		 
		 
		
		
		GridLayout g = new GridLayout(3,2);
		 frame3.setLayout(g);
		 
		 frame3.add(strain);
		 frame3.add(strainC);
		 
		 frame3.add(tseat);
		 frame3.add(tseatT);
		 
		 frame3.add(sold);
		 frame3.add(soldT);
		 
		 frame3.add(aseat);
		 frame3.add(aseatT);
		 
		 frame3.add(home);
		 frame3.add(submit);
		 frame3.add(clear);
		 frame3.add(previous);
		 
		 frame.setVisible(false);
		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame3.setVisible(true);
			frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame3.setSize(500, 260);
			frame3.setLocation(200, 200);
			frame3.setTitle("COUNTER CHECK");
		 
		
	}
}
