package Clock;

public class Clock extends Thread {
    //the clock is set to zero initially
    private static int hr=0;
    private static int min=0;
    private static int sec=0;


    //these are the getters and setters of the clock time..
    public static String getTime()
    {
        return 0+""+hr+" : "+0+""+min+" : "+0+""+sec;
    }
    public static String setTime(int hr,int min,int sec)
    {
        //System.out.println("enter hours min and sec");
        Clock.hr=hr;
        Clock.sec=sec;
        Clock.min=min;
        return getTime();
    }

    // static
    // {
    //     System.out.println("Hi i am a static initialization block");
    // }

    //timeout method
    public static void setTimeout(Runnable runnable,int delay)
    {
        new Thread(()->{
            try{
                Thread.sleep(delay);
                runnable.run();
            }
            catch(Exception e){
                System.out.println(e);
            }
        }).start();
    }

    //method for starting the time at the time of entering of customer...
    public static void startTime()
    {
        while(true){
            try{
        Thread.sleep(1000);
            }
            catch(Exception e)
            {
                System.out.println("got exception with sleep method");
            }
        sec+=1;
        if(sec==60)
        {
            min+=1;
            sec=0;
        }
        if(min==60)
        {
            hr+=1;
            min=0;
        }
        // while(hr<2)
        // {
        //     // setTiemout(()->startTime(),1000);
        // }
        if(hr>2)
        break;
        }
    }

    @Override//this is the run method which overrides the run method in the Thread class....
    public  void run()
    {
        startTime();
    }



}
