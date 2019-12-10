//: innerclasses/Parcel7.java
package innerclasses; /* Added by Eclipse.py */
// Returning an instance of an anonymous inner class.

/**
 * 匿名内部类
 */
public class Parcel7 {
  public Contents contents() {
    /**
     * //这里相当于定义类一个继承自Contents接口的子类，并在定义处直接调用该子类的默认构造函数，来创建实例。
     */
    return new Contents() { // Insert a class definition
      private int i = 11;
      public int value() { return i; }
    }; // Semicolon required in this case
  }
  public static void main(String[] args) {
    Parcel7 p = new Parcel7();
    Contents c = p.contents();
  }
} ///:~
