//: innerclasses/Parcel10.java
package innerclasses; /* Added by Eclipse.py */
// Using "instance initialization" to perform
// construction on an anonymous inner class.

/**
 * 使用实例初始化代码块，在匿名内部类，实现构造函数的效果。
 */

public class Parcel10 {
  public Destination
  destination(final String dest, final float price) {
    return new Destination() {
      private int cost;
      // Instance initialization for each object:
      {//匿名内部类的构造函数替代法。//这里就相当于构造函数的函数体。
        cost = Math.round(price);
        if(cost > 100)
          System.out.println("Over budget!");
      }
      private String label = dest;
      public String readLabel() { return label; }
    };
  }	
  public static void main(String[] args) {
    Parcel10 p = new Parcel10();
    Destination d = p.destination("Tasmania", 101.395F);
  }
} /* Output:
Over budget!
*///:~
