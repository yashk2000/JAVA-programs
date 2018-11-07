import java.util.*;
class OverRide{
  void print(){
    System.out.println("This is not overidden");
  }
}

class OverRidden extends OverRide{
  @Override//override annotation. This overrides the method print of the super class
  void print(){
    System.out.println("This is overidden");
  }
}

class Finale{
  public static void main(String[] args) {
    OverRide OV=new OverRidden();
    OV.print();
  }
}
