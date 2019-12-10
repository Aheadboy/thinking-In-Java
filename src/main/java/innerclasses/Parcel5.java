//: innerclasses/Parcel5.java
package innerclasses; /* Added by Eclipse.py */
// Nesting a class within a method.
//方法中嵌入内部类。
public class Parcel5 {
  public Destination destination(String s) {
    class PDestination implements Destination {
      private String label;
      private PDestination(String whereTo) {
        label = whereTo;
        System.out.println("father is :"+Parcel5.this.getClass().getSimpleName());
      }
      public String readLabel() { return label; }
    }
    return new PDestination(s);
  }
  public static void main(String[] args) {
    Parcel5 p = new Parcel5();
    Destination d = p.destination("Tasmania");
  }
} ///:~
