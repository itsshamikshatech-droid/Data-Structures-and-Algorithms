//Write a program to input sides of a triangle and check whether a triangle is equilateral, scalene or isosceles triangle.
import java.util.Scanner;
class Dsa4
{
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the sides of the triangle:");
       double a=sc.nextDouble();
       double b=sc.nextDouble();
       double c=sc.nextDouble();
       if(a==b && b==c)
       {
        System.out.println("The triangle is an equilateral triangle.");
       }
       else if(a==b || b==c || a==c)
       {
        System.out.println("The triangle is an isosceles triangle.");
       }
       else
       {
        System.out.println("The triangle is a scalene triangle.");
       }
       sc.close();
    }
}