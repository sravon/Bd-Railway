package help;

import java.util.Scanner;

public class people3 implements Runnable {
	message c;
	Scanner input = new Scanner(System.in);
	
	String[] d3 = new String[50]; {
		for(int i = 0; i< d3.length;i++) {
			d3[i] = input.nextLine();
		}
		System.out.println(d3[0]);
	}
	public people3(message ch) {
		this.c = ch;
		new Thread(this,"Question").start();
	}
	public void run() {
		System.out.println("A: ");
		for(int i = 0; i< d3.length; i++) {
			System.out.println("A: ");
			c.Ask(d3[i]);
		}
	}
	
}
