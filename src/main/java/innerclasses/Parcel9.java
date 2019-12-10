//: innerclasses/Parcel9.java
package innerclasses; /* Added by Eclipse.py */
// An anonymous inner class that performs
// initialization. A briefer version of Parcel5.java.

/**
 * 匿名内部类，在定义处，直接调用定义好的这个类的构造函数，来进行，定义处初始化。--ljj注释
 * 对比Parcel5,可以很好的理解，**匿名**内部类--ljj理解注释
 */
public class Parcel9 {
  // Argument must be final to use inside
  // anonymous inner class:

  /**
   * 函数体里面的匿名内部类，如果，类体用到了函数的形参数，这个形参数必须是final
   * @param dest
   * @return
   */
  public Destination destination(final String dest) {
    return new Destination() {
      private String label = dest;
      public String readLabel() { return label; }
    };
  }
  public static void main(String[] args) {
    Parcel9 p = new Parcel9();
    Destination d = p.destination("Tasmania");
  }
} ///:~
