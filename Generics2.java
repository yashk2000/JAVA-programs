class Gene<t, u>{
  t T;
  u U;
  Gene(t T, u U){
    this.T=T;
    this.U=U;
  }
  void print(){
    System.out.println(T+"\n"+U);
    System.out.println(T.getClass().getName()+" = "+T);
    System.out.println(U.getClass().getName()+" = "+U);
  }
}

class Generics2{
  public static void main(String[] args) {
    Gene <String, Boolean> g1=new Gene<String, Boolean>("yash", true);
    g1.print();
  }
}
