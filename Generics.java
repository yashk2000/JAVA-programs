class Gene<O1, O2>//declaring type of data to be held by an object
{
  O1 o1;//object created for the type
  O2 o2;//object created for the second type
  Gene(O1 o1, O2 o2){//constructor to assign value to object
    this.o1=o1;
    this.o2=o2;
  }
  void print(){
    System.out.println(o1+"\n"+o2);//printing object
  }
}


class Generics{
  public static void main(String[] args) {
    Gene<Double, String> O3=new Gene<Double, String>(5.34,"I am Yash");//type of object declared and data sent to default construucor of class gene
    O3.print();//calling print in gene
  }
}
