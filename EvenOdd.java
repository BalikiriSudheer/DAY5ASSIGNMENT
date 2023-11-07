package Com.Demo;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("enter the number");
        if(n%2==0){
            System.out.println("it is a even mumber");
        }
        else{
            System.out.println("it is odd number");
        }
    }
}
