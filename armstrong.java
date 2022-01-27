package com.company;
import java.util.*;
public class armstrong {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int num= sc.nextInt();
        int num2 = num;
        int d,sum =0;
        while(num!=0){
            d=num%10;
            sum+=d*d*d;
            num/=10;
        }
        if(sum==num2)
            System.out.println(num2 + " is Armstrong Number");
        else
            System.out.println(num2 + " is not an Armstrong Number");
    }

}
