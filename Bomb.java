interface Dynamite {//interface declared

  void saySomething();//function heading created

}

public class Bomb {

  public void watermelon(Dynamite dynamite) {
    dynamite.saySomething();
  }


  public static void main(String[] args) {

      new Bomb().watermelon(new Dynamite() {//this is the anonymus class. The class has been started with out a name and a interface has been implinted
        public void saySomething() {
          System.out.println("Watermelon bomb");
        }
      });

      new Bomb().watermelon(() -> {//a shorter way to create an anonymus class using lambda expressions
        System.out.println("Dragon Fruit bomb");
      });
  }
}
//the basic use of an anonymus class is to create the body of methods of an interface.
