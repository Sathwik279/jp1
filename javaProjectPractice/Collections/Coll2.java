package Collections;

import java.util.*;

public class Coll2 {
    public static void main(String[] args) {
        // lets create objects of these two classes and add to a collection
        // lets start with the simole and that too an arraylist
        Vector<Dummy> v1 = new Vector<>();
        Dummy d = new Dummy(1, "sathwik", true);
        Dummy d2 = new Dummy(2, "ajay", false);
        Dummy d3 = new Dummy(3, "santosh", true);
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
        // now added few objects to our vectors
        // System.out.println("v2 contains f2 " + v2.contains(f2));
        // System.out.println("v2 coantains all " + v2.containsAll(v2));
        // System.out.println("v2 contains v1 " + v2.containsAll(v1));
        // creating a new array to stroe objects of type Dummy
        // Dummy[] s = new Dummy[5];
        // v1.copyInto(s);
        // for (Dummy r : s) {
        //     System.out.println(r);
        // }
        // // cathced the object before clearing the vector
        // Object cloneDummy = v1.clone();
        // v1.clear();
        //instead of creating an array and copying elements we can directly enumerate over teh elements in the vector
        // for (Enumeration<Dummy> e = v1.elements(); e.hasMoreElements();) {
        //     System.out.println(e.nextElement());
        //     System.out.println(v1.elementAt(0));
        // }

        // v1.forEach(System.out::println);
        // v1.forEach(element->System.out.println(element));//this is same as the above comment
    //     v1.forEach(element->{
    //     System.out.println(element.incCount(4));
    // System.out.println(element);});

    // System.out.println(v1.hashCode());
    // }

    //creating an iterator
    Iterator <Dummy> dum = v1.iterator();
    while(dum.hasNext())
    {
        Dummy element = dum.next();
        element.incCount(1);
        System.out.println(element);

    }

    v1.removeIf(n->(n.flag==false));

    
   v1.forEach((element)->{System.out.println(element);});
    }
}

class Dummy {
    // initializing the constructor capabilities........
    Dummy(int count, String name, boolean flag) {
        this.count = count;
        this.name = name;
        this.flag = flag;
    }

    public int count;
    public String name;
    public boolean flag;

    public int incCount(int count)
    {
        this.count +=count;
        return this.count;
    }

    @Override
    public String toString() {
        return "count : " + count + " name : " + name + " flag : " + flag;
    }
}

class Dummy2 {
    public int count2 = 4;
    public String name2 = "ajay";
    public boolean flag2 = true;

    public String toString() {
        return "count2 : " + count2 + " name2 : " + name2 + " flag2 : " + flag2;
    }
}