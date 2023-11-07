package Com.Demo;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        System.out.println("Before Swap");
        System.out.println(x);
        System.out.println(y);

        int temp=x;
        x=y;
        y=temp;
        System.out.println("After Swap");
        System.out.println("x"+x);
        System.out.println("Y"+y);
    }
}
