import java.util.*;
class MethNonStatic{
  public void sum(int a, int b){
    System.out.println(a+b);
  }

  public static void main(String[] args) {
    Sum sum1=new MethNonStatic()::sum;
    sum1.sum5(4,5);
  }
}

interface Sum{
  public void sum5(int a, int b);
}
