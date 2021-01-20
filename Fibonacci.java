import java.util.*;
class Fibonacci{
  public static void main(String args[]){
    Scanner input = new Scanner(System.in);
    int n,f1 = 0,f2 = 1, fn;

    System.out.print("Enter how many fibonacci you want : ");
    n = input.nextInt();

    System.out.print(f1 + " " + f2);
    for(int i = 0; i < (n-2); i++){
        fn = f1 + f2;
        f1 = f2;
        f2 = fn;
        System.out.print(" " + fn);
    }
    System.out.println();
  }
}
