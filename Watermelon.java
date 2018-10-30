//this class demonstrates that a function can have any return type
class Test {

  public String saySomething(String name) {//function returning String which is class
    return name;
  }

  public Watermelon saySomething() {//return type of class is watermelon
    return new Watermelon("Japanese" , "Square");//it return an object of watermelon
  }

}

public class Watermelon {

  private String name;
  private String shape;

  public Watermelon() {
    //defautl
  }

  public Watermelon(String name, String shape) {//parameterized constructor
    this.shape = shape;
    this.name = name;
  }

  @Override//overring a library function
  public String toString() {//if overriding is not done, it will print the  object address and not the value we want
    return shape + " " + name;//toString() is called everytime printing is done
  }

  public static void main(String[] args) {
    System.out.println(new Test().saySomething());//creating an anonymus object and calling the saySomething() function
  }
}
