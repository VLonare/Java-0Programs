package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class BookDriver {

	public static void main(String[] args) {
		ArrayList lib = new ArrayList<>();
		
		lib.add(new Books("CCC",1249,450));
		lib.add(new Books("ICS",1279,390));
		lib.add(new Books("DOS",1380,256));
		lib.add(new Books("AWSN",1440,390));
		
		Collections.sort(lib);
	}
	
}
