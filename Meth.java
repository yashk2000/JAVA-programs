import java.util.*;

interface something{
  void printSum(int a, int b);
}
class Meth{
  public static void main(String[] args) {
    something s1=Meth::somEthing;
    s1.printSum(5,6);
  }

  public static void somEthing(int a, int b){
    System.out.println("Sum = "+(a+b));
  }
}
