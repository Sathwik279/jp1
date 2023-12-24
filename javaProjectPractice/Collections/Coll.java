package Collections;
import java.util.*;
public class Coll {
    public static void main(String[] args) {
        //lets create objects of these two classes and add to a collection
        //lets start with the simole and that too an arraylist
        Vector<Dummy> v1 =new Vector<>();
        Dummy d = new Dummy(1,"sathwik",true);
        Dummy d2 = new Dummy(2,"ajay",false);
        Dummy d3 = new Dummy(3,"santosh",true);
        v1.add(d);
        v1.add(d2);
        v1.add(d3);
        Vector<Dummy2> v2 = new Vector<>();
        Dummy2 f = new Dummy2();
        Dummy2 f2 = new Dummy2();
        Dummy2 f3 = new Dummy2();
        v2.add(f);
        v2.add(f2);
        v2.add(f3);
        //now added few objects to our vectors 
        System.out.println("v2 contains f2 "+v2.contains(f2));
        System.out.println("v2 coantains all "+v2.containsAll(v2));
        System.out.println("v2 contains v1 "+v2.containsAll(v1));
        //creating a new array to stroe objects of type Dummy
        Dummy[] s = new Dummy[5];
        v1.copyInto(s);
        for(Dummy r:s)
        {
            System.out.println(r);
        }


    }
}


class Dummy
{
    //initializing the constructor capabilities........
    Dummy(int count,String name,boolean flag)
    {
        this.count=count;
        this.name = name;
        this.flag= flag;
    }
    public int count;
    public String name;
    public boolean flag;

    @Override
    public String toString()
    {
        return "count : "+count+" name : "+name+" flag : "+flag;
    }
}
class Dummy2
{
    public int count2 =4;
    public String name2 ="ajay";
    public boolean flag2 = true;
     public String toString()
    {
        return "count2 : "+count2+" name2 : "+name2+" flag2 : "+flag2;
    }
}