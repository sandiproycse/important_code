import java.util.*;
class Factorial{
  long factorial(int n){
    if(n == 0){
      return 1;
    }else{
      return (n * factorial(n-1));
    }
  }
  public static void main(String args[]){
    Scanner input = new Scanner(System.in);
    int n;
    long f;
    Factorial fact = new Factorial();
    System.out.print("Enter an integer to find its factorial : ");
    n = input.nextInt();
    if(n < 0){
      System.out.println("Factorial of negative integers isn't defined.");
    }else{
      f = fact.factorial(n);
      System.out.println("Factorial of " + n + " is " + f);
    }
  }
}
