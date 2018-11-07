import java.util.*;
class WithoutGenericDataType{
  public static void main(String[] args) {
  List list = new ArrayList();
  list.add("hello");
  //System.out.println((String)list.get(0));
  String s = (String) list.get(0);
  System.out.println(s);
  }
}
