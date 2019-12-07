//: polymorphism/PolyConstructors.java
package polymorphism; /* Added by Eclipse.py */
// Constructors and polymorphism
// don't produce what you might expect.
import static net.mindview.util.Print.*;

/**
 * 构造函数中，调用多态方法，可能会有令人迷惑的现象--ljj
 */
class Glyph {
  void draw() { print("Glyph.draw()"); }
  Glyph() {
    print("Glyph() before draw()");
    draw();
    print("Glyph() after draw()");
  }
}	

class RoundGlyph extends Glyph {
  private int radius = 1;
  RoundGlyph(int r) {
    radius = r;
    print("RoundGlyph.RoundGlyph(), radius = " + radius);
  }
  void draw() {
    print("RoundGlyph.draw(), radius = " + radius);//调用的还是这个方法。
  }
}	

public class PolyConstructors {
  public static void main(String[] args) {
    new RoundGlyph(5);//动态绑定还是成功的，会调用这个对象的draw。
  }
} /* Output:
Glyph() before draw()
RoundGlyph.draw(), radius = 0
Glyph() after draw()
RoundGlyph.RoundGlyph(), radius = 5
*///:~
