package Collections;
import java.util.*;

class KeyValue
{
    public static void main(String[] args) {
        //lets create some key value pairs
        HashMap<Integer,String> s1 = new HashMap<>();
        s1.put(199,"sathwik");
        s1.put(45,"ajay");
        for(Map.Entry m:s1.entrySet())
        {
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}