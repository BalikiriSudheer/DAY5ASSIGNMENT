package Com.Demo;

import java.util.Scanner;

public class Remainder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the divided");
        int diveded=sc.nextInt();
        System.out.println("enter the divisors");
        int divisors=sc.nextInt();

        int qoentient=diveded/divisors;
        int remainder=diveded%divisors;
        System.out.println(qoentient);
        System.out.println(remainder);
    }
}
