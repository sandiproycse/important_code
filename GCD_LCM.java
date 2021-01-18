import java.util.*;
class GCD_LCM{

  public static void main(String args[]){
    Scanner input = new Scanner(System.in);
    int a,b,x,y,gcd,lcm;
    System.out.print("Enter two integer : ");
    a = input.nextInt();
    b = input.nextInt();
    x = a;
    y = b;

    while(b != 0){
      int temp = b;
      b = a % b;
      a = temp;
    }
    gcd = a;
    lcm = (x * y)/gcd;

    System.out.println("Greatest common divisor of " + x + " and " + y + " is " + gcd);
    System.out.println("Least common multiple of " + x + " and " + y + " is " + lcm);
  }
}
