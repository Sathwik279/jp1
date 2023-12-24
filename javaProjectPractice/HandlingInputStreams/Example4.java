package HandlingInputStreams;

import java.io.*;

//handling the data input and output streams

public class Example4 {
    public static void main(String[] args) throws Exception {
        // File f = new File("D:\\JavaProject\\sathwik.txt");
        // final String dataFile = "invoicedata";
        // final double[] prices = { 19.99, 9.99, 15.99, 3.99, 4.99 };
        // final int[] units = { 12, 8, 13, 29, 50 };
        // final String[] descs = {
        // "Java T-shirt",
        // "Java Mug",
        // "Duke Juggling Dolls",
        // "Java Pin",
        // "Java Key Chain"
        // };
        // DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new
        // FileOutputStream(f, true)));
        // for (int i = 0; i < prices.length; i++) {
        // out.writeDouble(prices[i]);
        // out.writeInt(units[i]);
        // out.writeUTF(descs[i]);
        // }
        File nf = new File("D:\\JavaProject\\HandlingInputStreams\\Input\\primitives.txt");
        nf.createNewFile();
        Object ob = new Primitives();
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(nf, true));
        oos.writeObject(ob);
        // out.close();
        oos.close();
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(nf));
        Object parsed = ois.readObject();
        System.out.println(parsed);
    }
}

class Primitives implements Serializable {
    public int count = 89;
    public String name = "sathwik";
    public boolean flag = true;

    @Override
    public String toString() {
        String value = "count: " + count + " name : " + name + " Flag : " + flag;
        return value;
    }

}
