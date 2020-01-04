package help;
import java.util.*;

public class people2 implements Runnable {
	message c;
	Scanner input = new Scanner(System.in);
	
	String[] d2 = new String[50]; {
		for(int i = 0; i< d2.length;i++) {
			d2[i] = input.nextLine();
		}
		System.out.println(d2[0]);
	}
	public people2(message ch) {
		this.c = ch;
		new Thread(this,"Question").start();
	}
	public void run() {
		System.out.println("A: ");
		for(int i = 0; i< d2.length; i++) {
			System.out.println("A: ");
			c.Ask(d2[i]);
		}
	}
	
}
