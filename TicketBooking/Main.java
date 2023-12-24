package TicketBooking;

import java.util.*;
import Clock.Clock;
import java.util.Scanner;
import java.io.*;

public class Main extends Thread {
    private static int choice;

    public void run() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("HI");
            Thread.sleep(1500);
            System.out.println("Initializing Airport Interface");
            Thread.sleep(1000);
            System.out.println("Initializing clock interface");
            Clock clock1 = new Clock();
            clock1.start();// created a new thread of the Clock and it is running.....
            Thread.sleep(1000);
            // System.out.println(clock1.getTime());
            System.out.println("Initializing TicketBooking Interfafce");
            TicketBooking t1 = new TicketBooking();

            while (true) {
                System.out.println("Sir//Madam please enter your choice");
                System.out.println(
                        "1..for Time//2..for setTime//3 for TicketBooking//4 for reading user data in memeory// 10..for exit //");
                choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("You have selected the clock interface");
                        System.out.println(clock1.getTime());
                        break;
                    case 2:
                        System.out.println("enter the hr sec and min");
                        System.out.println(clock1.setTime(sc.nextInt(), sc.nextInt(), sc.nextInt()));
                        break;
                    case 3:
                        System.out.println("You have selected the Ticket Booking Option");
                        t1.init();
                        break;
                    case 4:
                        try {
                            System.out.println("read the data from the User data");
                            File f = new File("D:/javaProject/TicketBooking/UserData.txt");
                            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f));
                            Object o = (User) ois.readObject();
                            System.out.println(o);
                        } catch (Exception e) {
                            System.out.println(e);
                        }
                        break;

                    case 10:
                        System.exit(0);
                        break;
                }
            }
        } catch (Exception e) {
            System.out.println("Exception on Thread occured");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Main t = new Main();
        t.start();
    }
}