package help;
import java.util.*;

public class message {
	boolean flag = false;
	
	public synchronized void Ask(String sms) {
		if(flag) {
			try {
				wait();
			}catch(InterruptedException e) {
				System.out.println(e);
			}
		}
	}
	
	public synchronized void reply(String sms) {
		if(flag) {
			try {
				wait();
			}catch(InterruptedException e) {
				System.out.println(e);
			}
		}
		System.out.println(sms);
		flag = false;
		notify();
	}
	
}
