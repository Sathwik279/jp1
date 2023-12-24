package HandlingInputStreams.Input;

import java.io.File;

public class Example2 {
    public static void main(String[] args) throws Exception {

        File f1 = new File("D:\\JavaProject\\sathwik.txt");

        // boolean onCreate = f1.renameTo(new File("D:\\JavaProject\\hello\\ajay.txt"));
        // System.out.println(onCreate);

        boolean onModify = f1.setReadOnly();
        // for (String s : onModify) {
        // System.out.println(s);
        // }
        System.out.println(onModify);
    }
}
