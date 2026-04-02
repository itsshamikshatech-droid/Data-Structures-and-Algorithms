/*Write a program to input electricity unit charge and calculate the total electricity bill according to the given condition:
For first 50 units Rs. 0.50/unit
For next 100 units Rs. 0.75/unit
For next 100 units Rs. 1.20/unit
For unit above 250 Rs. 1.50/unit
An additional surcharge of 20% is added to the bill.*/

import java.util.Scanner;

class Dsa5
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the electricity unit charge:");
        double units=sc.nextDouble();
        double bill=0;
        if(units<=50)
        {
            bill=0.50*units;
        }
        else if(units>50 && units<=150)
        {
            bill=(50*0.50)+(units-50)*0.75;
        }
        else if(units>150 && units<=250)
        {
            bill=(50*0.50)+(100*0.75)+(units-150)*1.20;
        }
        else if(units>250)
        {
            bill=(50*0.50)+(100*0.75)+(100*1.20)+(units-250)*1.50;
        }
        bill=bill+(bill*0.20);
        System.out.printf("Your Electricity Bill is Rs %.2f:",bill);
        sc.close();
    }
}