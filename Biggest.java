package Com.Demo;

import java.util.Scanner;

public class Biggest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("First number");
        int x=sc.nextInt();
        System.out.println("second number");
        int y=sc.nextInt();
        System.out.println("third number");
        int z=sc.nextInt();

        if(x>y && x>z){
            System.out.println("largest number"+x);
        } else if (y>z){
            System.out.println("largest number"+y);

            }
        else{
            System.out.println("largest number"+z);
        }

    }
}
