//Write a program to find maximum between three numbers.
import java.util.*;
class Dsa1
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three numbers:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int max = Math.max(a, Math.max(b, c));
        System.out.println("Maximum number is: " + max);
        sc.close();
    }
}
