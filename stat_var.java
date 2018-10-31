import java.util.*;
class stat_var
{
  static int a=56;//static variable
  static int b=90;//static variable
  int x=90;//non-static variable
  int y=78;//non-static variable
  public static void main(String[] args) {
    System.out.println(a+b);//directly printing sum if static variables
    //System.out.println(x+y);//will not work now as not a static variable
    stat_var O1=new stat_var();//object creation
    System.out.println(O1.x+O1.y);//printing O1 instatnce of non-static variables
    O1.x=90;
    O1.y=100;//O1 instance of variables updated
    System.out.println(O1.x+O1.y);
    stat_var O2=new stat_var();//another object created
    System.out.println(O2.x+O2.y);
    O2.x=100;
    O2.y=100;//seperate instance
    System.out.println(O2.x+O2.y);
  }
}
