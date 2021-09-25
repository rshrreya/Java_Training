import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
 
public class WriteObject {
 
    private static final String filepath="/Users/shrrudre/Documents/demo/demo3.txt";
 
    public static void main(String args[]) {
 
        WriteObject objectIO = new WriteObject();
 
        Student student = new Student("shreya","rudresh",21);
        objectIO.WriteObjectToFile(student);
    }
 
    public void WriteObjectToFile(Object serObj) {
 
        try {
 
            FileOutputStream fileOut = new FileOutputStream(filepath);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(serObj);
            objectOut.close();
            System.out.println("The Object  was succesfully written to a file");
 
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}