package help;
import java.util.*;

public class people implements Runnable {
	message c;
	Scanner input = new Scanner(System.in);
	
	String[] d1 = new String[50]; {
		for(int i = 0; i< d1.length;i++) {
			d1[i] = input.nextLine();
		}
		System.out.println(d1[0]);
	}
	public people(message ch) {
		this.c = ch;
		new Thread(this,"Question").start();
	}
	public void run() {
		System.out.println("A: ");
		for(int i = 0; i< d1.length; i++) {
			System.out.println("A: ");
			c.Ask(d1[i]);
		}
	}
	
}
