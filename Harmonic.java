package Com.Demo;

import java.util.Scanner;

public class Harmonic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double  result=0.0;
        System.out.println("The hormonic series is");
     for (int i=n;i>0;i--){
         result =result+(double)1/i;
         System.out.println(result);
     }
    }
}
