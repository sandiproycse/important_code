import java.util.*;
class Perfect_num{
  public static void main(String args[]){
    Scanner input = new Scanner(System.in);
    int number, rem, sum = 0;
    System.out.print("Enter a number : ");
    number = input.nextInt();

    for(int i = 1; i < number; i++){
      rem = number % i;
      if(rem == 0){
        sum = sum + i;
      }
    }
    if(sum == number){
      System.out.println("Entered number is perfect number.");
    }else{
      System.out.println("Entered number is not a perfect number.");
    }
  }
}
