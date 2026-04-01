//Write a program to input amount from user and print minimum number of notes (Rs. 500, 100, 50, 20, 10, 5, 2, 1) required for the amount.
import java.util.*;
class Dsa3
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the amount:");
        long amt=sc.nextLong();
        int five_hundred=0,hundred=0,fifty=0,twenty=0,ten=0,five=0,two=0,one=0;
        if(amt>=500)
        {
            five_hundred=(int)(amt/500);
            amt=amt%500;
        }
        if(amt>=100)
        {
            hundred=(int)(amt/100);
            amt=amt%100;
        }
        if(amt>=50)
        {
            fifty=(int)(amt/50);
            amt=amt%50;
        }
        if(amt>=20)
        {
            twenty=(int)(amt/20);
            amt=amt%20;
        }
        if(amt>=10)
        {
            ten=(int)(amt/10);
            amt=amt%10;
        }
        if(amt>=5)
        {
            five=(int)(amt/5);
            amt=amt%5;
        }
        if(amt>=2)
        {
            two=(int)(amt/2);
            amt=amt%2;
        }
        if(amt>=1)
        {
            one=(int)(amt/1);
            amt=amt%1;
        }
        System.out.println("Total Number of Notes :");
        System.out.println("500 = " + five_hundred);
        System.out.println("100 = " + hundred);
        System.out.println("50 = " + fifty);
        System.out.println("20 = " + twenty);
        System.out.println("10 = " + ten);
        System.out.println("5 = " + five);
        System.out.println("2 = " + two);
        System.out.println("1 = " + one);
        sc.close();
    }
}