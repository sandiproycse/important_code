import java.util.*;
class F_nPr_nCr{
  long factorial(int n){
    if(n == 0){
      return 1;
    }else{
      return (n * factorial(n-1));
    }
  }

  long find_nCr(int n, int r){
    long result;
    result = factorial(n) / (factorial(r) * factorial(n-r));
    return result;
  }

  long find_nPr(int n, int r){
    long result;
    result = factorial(n) / factorial(n-r);
    return result;
  }

  public static void main(String args[]){
    Scanner input = new Scanner(System.in);
    F_nPr_nCr obj_nPr_nCr = new F_nPr_nCr();

    int n,r;
    long ncr, npr;
    System.out.print("Enter the value of n and r : ");
    n = input.nextInt();
    r = input.nextInt();

    ncr = obj_nPr_nCr.find_nCr(n, r);
    npr = obj_nPr_nCr.find_nPr(n, r);

    System.out.println("Combination : " + ncr);
    System.out.println("Permutation : " + npr);


  }

}
