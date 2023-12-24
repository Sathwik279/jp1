package TicketBooking;

import java.util.*;
import java.util.stream.*;
import java.util.regex.*;
import java.io.*;

//lets read data and store using an object and normal text format first before that lets store using collections....
class User implements Serializable {
    String name;
    int age, month, year, day;
    String dob;
    String passportNumber; // we take this number as input from user.....
    String passportCheck = "^[1-4][0-9]{5}$";
    int cls;

    static {
        // initializing static variables in here.....
        int month = 0, year = 0, day = 0;
        String name = "";
        int age = 0;
        String dob = "" + month + "-" + year + "-" + day;
        String passportNumber = "";
    }

    public String toString() {
        return "Name : " + name + " age : " + age + " dob : " + day + "-" + month + "-" + year + " valid customer";

    }
}

public class TicketBooking extends Thread {
    // tickets are of two types 1.economy class 2.gold class

    // need to store the data of the user booking the ticket
    // bio details
    // the data consists of 1.name 2.age 3.date of birth 4.passport number(including
    // its validation)..
    // contact details
    // need to store his contact deails mobile number and email address

    // using streams and collections we are going to wirte this data to a file and
    // name it data and retrive it based on a reference number given to the user...

    // variables to hold user details
    // this is used to check the
    // the passport number first digit is bw 0-4 and the remainign 5 digits can be
    // of any digit bw 0-9
    // number.....

    public static void passportValidator(User u) {
        System.out.println("enter a passport number");
        Scanner sc = new Scanner(System.in);
        Pattern p = Pattern.compile(u.passportCheck);
        Matcher m = p.matcher(sc.nextLine());
        if (m.matches()) {
            System.out.println("You are good to go");
            return;
        } else {
            System.out.println("Invalid passport number TRY AGAIN!!!");
            passportValidator(u);
            return;
        }
    }

    // overriding the run method in the //Thread class
    // @Override
    // public void run() {
    public void init() {
        try {
            Scanner sc = new Scanner(System.in);
            // System.out.println("Please register your self for Initializing ticket booking
            // interface");
            // System.out.println("Please Enter your name : ");
            // name = sc.nextLine();
            // System.out.println("Please enter your age : ");
            // age = sc.nextInt();
            // System.out.println("Reading your date of birth please be patient ");
            // Thread.sleep(500);

            // System.out.println("Reinitializing the database ....");
            // System.out.print(".");
            // Thread.sleep(500);
            // System.out.print(".");
            // Thread.sleep(500);
            // System.out.print(".");
            // Thread.sleep(500);
            // System.out.print(".");
            // Thread.sleep(100);
            // System.out.print(".");
            // Thread.sleep(100);
            // System.out.print(".");
            // Thread.sleep(100);

            // System.out.println();
            // System.out.println("Enter day : ");
            // day = sc.nextInt();
            // System.out.println("Enter month");
            // month = sc.nextInt();
            // System.out.println("Enter year");
            // year = sc.nextInt();
            // String trash = sc.nextLine();
            // System.out.println("Exiting the dob database....");
            // System.out.print(".");
            // Thread.sleep(500);
            // System.out.print(".");
            // Thread.sleep(500);
            // System.out.print(".");
            // Thread.sleep(500);
            // System.out.print(".");
            // Thread.sleep(100);
            // System.out.print(".");
            // Thread.sleep(100);
            // System.out.print(".");
            // Thread.sleep(100);

            // // now lets validate the passport number using the regex that we know//

            // System.out.println("Initializing passport checking interface please
            // StandBy..");

            // System.out.print("*");
            // Thread.sleep(1000);
            // System.out.print("*");
            // Thread.sleep(1000);
            // System.out.print("*");
            // Thread.sleep(1000);
            // System.out.print("*");
            // Thread.sleep(1000);
            // System.out.print("*");
            // Thread.sleep(1000);
            // System.out.print("*");
            // Thread.sleep(1000);

            // System.out.println();

            // passportValidator();
            // System.out.println("DeInitializing passport checking interface please
            // StandBy..");

            // System.out.print("*");
            // Thread.sleep(1000);
            // System.out.print("*");
            // Thread.sleep(1000);
            // System.out.print("*");
            // Thread.sleep(1000);
            // System.out.print("*");
            // Thread.sleep(1000);
            // System.out.print("*");
            // Thread.sleep(1000);
            // System.out.print("*");
            // Thread.sleep(1000);

            // // now details are ok and the user can book the ticket
            // System.out.println("enter 1 for economy 2 for gold");
            // int choice2 = sc.nextInt();
            // String ticket;
            // switch (choice2) {
            // case 1:
            // ticket = "eco";
            // break;
            // case 2:
            // ticket = "gold";
            // break;
            // }
            // System.out.println("ticket has been booked successfully");

            // } catch (Exception e) {
            // System.out.println(e);
            // }

            // now my goal is to take input by creating an object for the user class and
            // inserting this object to a collection and iterate over this collection to
            // write to a file and at the same time write as an obejct to a file using io
            // streams

            ArrayList<User> users = new ArrayList<>();

            User u = new User();
            users.add(u);
            // now lets iterate over the iterms in arraylist and perform operatiosn

            users.forEach((obj) -> {
                try {
                    // System.out.println("please enter your name");
                    // String trash1 = sc.nextLine();
                    System.out.println("Please register your self for Initializing ticket booking interface");
                    System.out.println("Please Enter your name : ");
                    obj.name = sc.nextLine();
                    System.out.println("Please enter your age : ");
                    obj.age = sc.nextInt();
                    System.out.println("Reading your date of birth please be patient ");
                    Thread.sleep(500);

                    System.out.println("Reinitializing the database ....");
                    System.out.print(".");
                    Thread.sleep(500);
                    System.out.print(".");
                    Thread.sleep(500);
                    System.out.print(".");
                    Thread.sleep(500);
                    System.out.print(".");
                    Thread.sleep(100);
                    System.out.print(".");
                    Thread.sleep(100);
                    System.out.print(".");
                    Thread.sleep(100);

                    System.out.println();
                    System.out.println("Enter day : ");
                    obj.day = sc.nextInt();
                    System.out.println("Enter month");
                    obj.month = sc.nextInt();
                    System.out.println("Enter year");
                    obj.year = sc.nextInt();
                    String trash = sc.nextLine();
                    System.out.println("Exiting the dob database....");
                    System.out.print(".");
                    Thread.sleep(500);
                    System.out.print(".");
                    Thread.sleep(500);
                    System.out.print(".");
                    Thread.sleep(500);
                    System.out.print(".");
                    Thread.sleep(100);
                    System.out.print(".");
                    Thread.sleep(100);
                    System.out.print(".");
                    Thread.sleep(100);

                    // now lets validate the passport number using the regex that we know//

                    System.out.println("Initializing passport checking interface please StandBy..");

                    System.out.print("*");
                    Thread.sleep(1000);
                    System.out.print("*");
                    Thread.sleep(1000);
                    System.out.print("*");
                    Thread.sleep(1000);
                    System.out.print("*");
                    Thread.sleep(1000);
                    System.out.print("*");
                    Thread.sleep(1000);
                    System.out.print("*");
                    Thread.sleep(1000);

                    System.out.println();

                    passportValidator(u);
                    System.out.println("DeInitializing passport checking interface please StandBy..");

                    System.out.print("*");
                    Thread.sleep(1000);
                    System.out.print("*");
                    Thread.sleep(1000);
                    System.out.print("*");
                    Thread.sleep(1000);
                    System.out.print("*");
                    Thread.sleep(1000);
                    System.out.print("*");
                    Thread.sleep(1000);
                    System.out.print("*");
                    Thread.sleep(1000);

                    // now details are ok and the user can book the ticket
                    System.out.println("enter 1 for economy 2 for gold");
                    obj.cls = sc.nextInt();

                    System.out.println("ticket has been booked successfully");
                    // lets wirte these objects into a file
                    File UserData = new File("D:/javaProject/TicketBooking/UserData.txt");
                    // created a file object
                    ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(UserData, false));
                    oos.writeObject(obj);
                    oos.close();
                } catch (Exception e) {
                    System.out.println(e);
                }
            });

        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
