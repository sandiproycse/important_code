import java.util.*;
class Leap_year{
  public static void main(String args[]){
    Scanner input = new Scanner(System.in);
    int year;
    System.out.print("Enter a year to check if it is a leap year : ");
    year = input.nextInt();

    if((year % 400) == 0){
      System.out.println(year + " is a leap year.");
    }else if((year % 4) == 0 && (year % 100) != 0){
      System.out.println(year + " is a leap year.");
    }else{
      System.out.println(year + " is not a leap year.");
    }
  }
}
