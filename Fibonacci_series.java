import java.util.*;
class Fibonacci_series{
  int fibonacci(int n){
    //System.out.println("function : " + n);
    if(n == 0 || n == 1){
      return n;
    }else{
      return (fibonacci(n-1) + fibonacci(n-2));
    }
  }
  public static void main(String args[]){
    Scanner input = new Scanner(System.in);
    Fibonacci_series fibo = new Fibonacci_series();

    int n;
    System.out.print("Enter how many fibonacci you want : ");
    n = input.nextInt();
    for(int i = 0; i < n; i++){
      //System.out.println("i = " + i);
      System.out.print(/*"Return : " + */ fibo.fibonacci(i) + " ");
    }
  }
}
