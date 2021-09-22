import java.util.Scanner;

class Time2{

    int hr,min,sec;

    public Time2()
    {
        // Default 
    }

    public Time2(int hr , int min , int sec)
    {
       
        this.hr = hr;
        this.min = min;
        this.sec = sec;

    }

    public void sethr(int hr)
    {
        this.hr = hr;
    }
    public int gethr()
    {
        return hr;
    }
    public int getmin()
    {
        return min;
    }
    public void setmin(int min)
    {
        this.min = min;
    } 
    public void setsec(int sec)
    {
        this.sec = sec;
    }
    public int getsec()
    {
        return sec;
    }

    void get(){

        gethr();
        getmin();
        getsec();

    }
    void display ()
    {
        if ((hr < 12 &&  hr>=0) || hr > 23 ) {
            System.out.println("\nTime is : " +hr+ " hours "+ " : " +min+ " minutes "+ " : " +sec+ " seconds " + " AM\n");
        }
        else{
            System.out.println("\nTime is : " +hr+ " hours "+ " : " +min+ " minutes "+ " : " +sec+ " seconds " + " PM\n");
        }
    }
    public void difer(Time2 T)
    {
        double h ;
        if (this.gethr() < T.gethr()) {
            h = (T.gethr() - this.gethr());
        }
        else
        {
            h = this.gethr() - T.gethr();
        }
        
        double m;
        if (this.getmin() < T.getmin()) {
            m = (T.getmin() - this.getmin());
        }
        else
        { 
            m = this.getmin() - T.getmin();
        }

        double s;
        if (this.getsec() < T.getsec()) {
            s = (T.getsec() - this.getsec());
        }
        else
        { 
            s = this.getsec() - T.getsec();
        }
        
        System.out.println("Time difference is : " +h + " Hours " + " : " +m+ " Minutes " + " : " + s + " Seconds ");
        
    }
    
}

public class time
{
    public static void main (String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter hrs, min and secs : ");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int z1 = sc.nextInt();
        
        Time2 t2 = new Time2();
        

        t2.sethr(x1);
        t2.setmin(y1);
        t2.setsec(z1);
        t2.display();

        System.out.println("Enter hrs, min and secs : ");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int z2 = sc.nextInt();

        Time2 t3 = new Time2();

        t3.sethr(x2);
        t3.setmin(y2);
        t3.setsec(z2);
        t3.display();
        
        t2.difer(t3);
        
        sc.close();
        
    }
}