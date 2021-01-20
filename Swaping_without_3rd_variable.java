import java.util.*;
class Swaping_without_3rd_variable{
  public static void main(String args[]){
    Scanner input = new Scanner(System.in);
    int a,b;
    System.out.print("Enter two integers (a & b) to swap : ");
    a = input.nextInt();
    b = input.nextInt();

    a = (a + b);
    b = (a - b);
    a = (a - b);
    System.out.println("a = " + a + " b = " + b);
  }
}
