package launcher;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Utils {

public static String loadFileAsString(String path)	{
	
	StringBuffer builder = new StringBuffer();
	
	try{
		InputStream input = Worlds.class.getResourceAsStream("/worlds/world1.txt");
		BufferedReader br = new BufferedReader(new InputStreamReader(input));	
		String line;
		
		while((line = br.readLine()) != null)
			builder.append(line + "\n");
		    br.close();
		
	}catch(IOException e) {
		
		e.printStackTrace();
	}
	return builder.toString();
	
	
}
	

public static int parseInt(String number) {
try {	
	return Integer.parseInt(number);
}catch(NumberFormatException e){
		e.printStackTrace();
		return 0;
}


}
	
	
	
}
