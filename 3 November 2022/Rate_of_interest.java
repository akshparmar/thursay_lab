/*Q1) Accept age and gender from user and display the rate of interest as follow

        age above 60 and gender Male (RI= 7 %)
        age above 60 and gender FeMale (RI= 7.5 %)
        below 60 age = RI 5%   */

//-------------------------------------------------------------------------


import org.xml.sax.SAXNotRecognizedException;

import java.util.Scanner;

public class Rate_of_interest
{
    public static void main(String[] args) {
        // input age of  user
        System.out.print("Enter the age ");
        Scanner sc=new Scanner(System.in);
                int age= sc.nextInt();
        System.out.println( "your age is "+age);


        // Gender  male = M Female = F
        System.out.println("Enter the Gender");
        Scanner ch=new Scanner(System.in);
        char gender = ch.next().charAt(0);
        System.out.println( "your gender is "+ gender);

        if(age>60)
        {
            if(gender=='M') // Checking if user Gender
            {
                System.out.println("Your Rate of interest is :- 7%");	// checking if user is male
            }
            else
            {
                System.out.println("Your Rate of interest is :- 7.5%");	// checking if user is female
            }

        }
        else        // if user is below 60 age
        {
            System.out.println("Your Rate of interest is :- 5%");
        }
    }
}
