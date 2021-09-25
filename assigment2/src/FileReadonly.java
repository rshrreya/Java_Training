import java.io.File;

public class FileReadonly {

		public static void main(String[] args) {
		      boolean flag;
		      try {
		         File file = new File("/Users/shrrudre/Documents/demo/demo2.txt");
		         file.createNewFile();
		         flag = file.setReadOnly();
		         //flag = file.canRead();
		         System.out.println("File is read-only?: " + flag);
		         flag = file.canWrite();
		         System.out.print("File is writable?: " + flag);
		      } catch(Exception e) {
		         e.printStackTrace();
		      }
		   }
}
