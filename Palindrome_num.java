import java.util.*;
class Palindrome_num{
  public static void main(String args[]){
    Scanner input = new Scanner(System.in);
    int number, reverse = 0, t;
    System.out.print("Enter a number to check if it is a palindrome or not : ");
    number = input.nextInt();
    t = number;
    while(t != 0){
      reverse = reverse * 10;
      reverse = reverse + (t % 10);
      t = t/10;
    }

    if(number == reverse){
      System.out.println(number + " is a palindrome number.");
    }else{
      System.out.println(number + " is not a palindrome number.");
    }
  }
}
