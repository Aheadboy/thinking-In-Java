//: innerclasses/Parcel1.java
package innerclasses; /* Added by Eclipse.py */
// Creating inner classes.

public class Parcel1 {
  class Contents {
    private int i = 11;
    public int value() { return i; }
    public int ljjint;
  }
  class Destination {
    private String label;
    Destination(String whereTo) {
      label = whereTo;
    }
    String readLabel() { return label; }
  }	
  // Using inner classes looks just like
  // using any other class, within Parcel1:

  /**
   * 在定义内部类的外部类中，使用其内部类，
   * 跟平时使用普通类几乎是一样的。
   * @param dest
   */
  public void ship(String dest) {
    Contents c = new Contents();
    Destination d = new Destination(dest);
    System.out.println(d.readLabel());
  }
  public static void main(String[] args) {
    Parcel1 p = new Parcel1();
    p.ship("Tasmania");
  }
} /* Output:
Tasmania
*///:~
