package HandlingInputStreams.Input;

//these are the charachter readers
import java.io.Reader;
import java.io.FileReader;
import java.io.File;
import java.io.FileNotFoundException;

public class In {

    public static void main(String[] args) throws FileNotFoundException {
        try {

            File f1 = new File("D:\\JavaProject\\dummy.txt");
            System.out.println("The file " + f1.exists());
            FileReader r1 = new FileReader(f1);
            System.out.println("The stream is  " + r1.ready());
            int c;
            while ((c = r1.read()) != -1) {
                System.out.print((char) c);
            }
            r1.close();
           

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
