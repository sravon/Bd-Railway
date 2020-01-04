package help;

import help.message;
import help.people;
import help.people2;
import help.people3;

public class Main {
	public static void main(String[] args) {
		message ms = new message();
		new people(ms);
		new people2(ms);
		new people3(ms);
	}
}
