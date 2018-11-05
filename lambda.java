import java.util.*;
class lambda{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String name="yash";
    trialint O1 = (namesent)->{ //using lambda expression to crate anonymous class
      System.out.println(namesent);
      return namesent+" khare";
    };//note the semicolon here
    String ret = O1.fullname(name);//calling the fullname function in the interface
    System.out.println(ret);
  }
}


@FunctionalInterface
interface trialint//functional interface-->with only one function
{
  String fullname(String name);//function header declared
}
