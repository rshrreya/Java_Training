

import java.io.FileWriter;
import java.io.IOException;

 
public class WriteToFile 
{
	public static void main(String [] args) throws IOException 
	{
	    String fileContent = "Hi!!! This is shreya";
	     
	    FileWriter fileWriter = new FileWriter("/Users/shrrudre/Documents/demo/demo3.txt");
	    fileWriter.write(fileContent);
	    fileWriter.close();
	}
}