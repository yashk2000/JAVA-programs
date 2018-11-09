class GetDataType{
  public static void main(String[] args) {
    int t=1;
    String s="yash";
    double d=67.45;
    //System.out.println(t.getClass().getName()+" = "+t);///won't work as t is not an obect. it is a reference data type
    System.out.println(s.getClass().getName()+" = "+s);
    //System.out.println(d.getClass().getName()+" = "+d);
  }
}
