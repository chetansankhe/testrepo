import java.io.IOException;
import java.util.Properties;

import com.techcanvass.operations.readobjects;

public class executetest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		readobjects  myobj = new readobjects ();
		
		Properties p = myobj.getobjectRepository();
		
		System.out.println(p.getProperty("url"));
		System.out.println(p.getProperty("Email"));
		
				
		
		
		
		
		
		
		
	}

}
