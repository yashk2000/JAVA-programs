import java.util.*;
class StrBld
{
  public static void main(String[] args) {
    String s="stringbuilder";
    StringBuilder sb = new StringBuilder(s);//stringbuilderis stored in sb object
    sb.reverse();//revered sb data
    System.out.println(sb);
    sb.reverse();//again reversed sb data
    sb.append(true);//appended a boolean value at the end of sb
    System.out.println(sb);
    StrBld O1=new StrBld();//created a class object
    sb.append(O1);//apppended object, this prints the address of the object
    System.out.println(sb);
    sb.delete(7,13);//deletes characters from index 7 to 13
    System.out.println(sb);
    sb.insert(0,'Y');//inserts Y at index 0
    System.out.println(sb);
  }
}
