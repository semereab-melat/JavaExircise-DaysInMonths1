

import java.util.Scanner;

/***************************************************************
 Filename: DaysInMonth1
 Created by: Melat Semereab
 Created on: 10/9/2021
 Comment: this program calculates the number of days in each month including leap year.
 ***************************************************************/


class Main 
{
  public static void main(String[] args) 
  {
    
      // creating a keyboard object to read data from end user
      Scanner keyboard = new Scanner(System.in);

      // declaring and initializing our variables
      int month, year = 0, days;
      boolean leapYear;

      //the formula for leap year (year % 4 =0 && year % 100 =0) && (year % 400 =0)...........leap year
      leapYear = ( year % 4 ==0 && year % 100 ==0 && year % 400 ==0);

      //prompt data from end user
      System.out.println("Please enter the months: ");
      month = keyboard.nextInt();

      System.out.println("Please enter the year: ");
      year = keyboard.nextInt();

      // clears the buffer of any unwanted data
      keyboard.nextLine();

      // using if and else if statement to calculate the number of days in a given month
      if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
      {
         days = 31;
         System.out.println("There are " + days + " days in month " + month + ", " + year);
      } else if (month == 4 || month == 6 || month == 9 || month == 11)
      {
         days = 30;
         System.out.println("There are " + days + " days in month " + month + ", " + year);
      } else if (month == 2)
      {
            if (( year % 4 ==0) && (year % 100 !=0 ) && (year % 400 ==0))
               {
                  days = 29;
                  System.out.println("This is leap year! This month " + month + " has " + days + " days, " + year);
               }
            else
               {
                  days = 28;
                  System.out.println("This month " + month + " has " + days + " days , " + year);
               }
      }else
      {
         System.out.println("You enter invalid month");
      }
      keyboard.close();
  }//main
}//class
