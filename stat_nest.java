import java.util.*;
class Outer
{
  static int a=10;//static variable
  static int b=45;//static variable
  int y=10;//non-static variable
  int z=45;//non-static variable
  static class Inner//inner static class
  {
    void func(){
    //System.out.println((y+z)); This will not work as non static variables cannot be used by static classes
    System.out.println(a+b);
  }
  }
  public static void main(String[] args) {
    Outer.Inner O1=new Outer.Inner();//creating an object for inner static class
    O1.func();
  }
}
