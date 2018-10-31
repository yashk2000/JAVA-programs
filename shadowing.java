class shadowing
{
  int z=45;//non static variable of shadowing
  class shadow{
    int z=50;//non static variable of shadow
    void shadowMethod(int z){
      System.out.println("z="+z);//prints the z in the method
      System.out.println("this.z="+this.z);//prints the z of shadow class
      System.out.println("shadowing.this.z="+shadowing.this.z);//prints the z of the shadowing class
    }
  }

  public static void main(String[] args) {

    shadowing O1=new shadowing();
    shadowing.shadow OO1=O1.new shadow();//object for shadow class
    OO1.shadowMethod(60);//calling a method of shadow class
  }
}
