//Write a program to input a character from user and check whether given character is alphabet, digit or special character.
import java.util.*;
class Dsa2
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a character:");
        char ch=sc.next().charAt(0);
        if((Character.isLetter(ch)))
        {
            System.out.println("The character is an alphabet.");
        }
        else if(Character.isDigit(ch))
        {
            System.out.println("The character is a digit.");
        }
        else
        {
            System.out.println("The character is a special character.");
        }
        sc.close();
    }
}