class numbers
{
  public static void main(String[] args) {
    String s="3456";
    System.out.println(Integer.decode(s));//converting s to integer
    String octal="333";
    String decimal="999";
    String binary="10100011";
    String hexa="12ABF";
    System.out.println(Integer.parseInt(octal,8));//string to octal number
    System.out.println(Integer.parseInt(decimal,10));//string to decimal number
    System.out.println(Integer.parseInt(binary,2));//string to binary number
    System.out.println(Integer.parseInt(hexa,16));//string to hexadecimal number
    int a=4567;
    System.out.println(Integer.toString(a));////converting integer to string

  }
}
//for convering string to integer or different bases, Integer.valueOf() can also be used in the same way as Integer.parseInt()
