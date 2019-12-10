//: innerclasses/Parcel8.java
package innerclasses; /* Added by Eclipse.py */
// Calling the base-class constructor.

/**
 * 匿名内部类，直接调用父类的构造，然后还能重写父类方法，调用父类方法--ljj注释
 * 这种匿名内部类，其父类是一个普通类的情况平时还是比较少见的，平时最多见的是父类是接口的形式--ljj注释
 */
public class Parcel8 {
  public Wrapping wrapping(int x) {
    // Base constructor call:
    return new Wrapping(x) { // Pass constructor argument.//此处相当于定义了一个Wrapping的子类。--ljj注释
      public int value() {
        return super.value() * 47;
      }
    }; // Semicolon required
  }
  public static void main(String[] args) {
    Parcel8 p = new Parcel8();
    Wrapping w = p.wrapping(10);
  }
} ///:~
