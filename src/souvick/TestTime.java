package souvick;

import java.text.DecimalFormat;
import java.util.Scanner;

class Time{
    int hr,min,sec;
    public Time(int h,int m,int s){
        hr=h;
        min=m;
        sec=s;
    }

    public Time(){

    }
    void showTime(){
        formatTime();
        DecimalFormat df=new DecimalFormat("00");
        String formatHr=df.format(hr);
        String formatMin=df.format(min);
        String formatSec=df.format(sec);
        System.out.println("Formatted Time: "+formatHr+":"+formatMin+":"+formatSec);
    }
    Time addTime(Time t){
        Time s=new Time();
        s.hr=this.hr+t.hr;
        s.min=this.min+t.min;
        s.sec=this.sec+t.sec;
        return s;
    }

    void formatTime(){
        hr=hr+min/60;
        min=min%60+sec/60;
        sec=sec%60;
    }
}
public class TestTime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter hours, minutes and seconds for 1st Time object:");
        int hour1=sc.nextInt();
        int minute1= sc.nextInt();
        int second1= sc.nextInt();
        Time p=new Time(hour1,minute1,second1);
        p.showTime();

        System.out.println("Enter hours, minutes and seconds for 2nd Time object:");
        int hour2=sc.nextInt();
        int minute2= sc.nextInt();
        int second2= sc.nextInt();
        Time q=new Time(hour2,minute2,second2);
        q.showTime();

        Time r=p.addTime(q);
        System.out.println("After addition:");
        r.showTime();
    }
}
