package Com.Demo;

import java.util.Scanner;

public class Leap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the year");
        int n=sc.nextInt();
        if(((n%4==0 && n%100!=0))||(n%400==0)){
            System.out.println("It is a leap year");
        }
        else
        System.out.println("it is not leap year");
    }
}
