package HandlingInputStreams.Input;

import java.io.FileInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedInputStream;

public class Example3 {
    public static void main(String[] args) throws Exception {
        File f = new File("D:\\JavaProject\\sathwik.txt");
        // boolean onCreate = f.createNewFile();
        // System.out.println("file has been " + onCreate);
        BufferedInputStream onRead = new BufferedInputStream(new FileInputStream(f));
        // now lets write the thing that we got
        int c1;

        while ((c1 = onRead.read()) != -1) {
            String c2 = (char) c1 + "";
            System.out.print((c2));
        }

        // FileOutputStream onWrite = new FileOutputStream(f,true);

        // onWrite.write(5345);
        BufferedOutputStream onWrite = new BufferedOutputStream(new FileOutputStream(f, true));
        onWrite.write(4);
        onWrite.flush();
        onWrite.close();

    }
}

// we can convert the data read in the form of bytes into a string and print to
// the console......