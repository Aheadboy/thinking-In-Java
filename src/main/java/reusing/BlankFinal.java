//: reusing/BlankFinal.java
package reusing; /* Added by Eclipse.py */
// "Blank" final fields.

class Poppet {
  private int i;
  Poppet(int ii) { i = ii; }
}

public class BlankFinal {
  private final int i = 0; // Initialized final
  private final int j; // Blank final
  private final Poppet p; // Blank final reference
  // Blank finals MUST be initialized in the constructor:
  public BlankFinal() {
//    int kk = j;//ljj1 final 域在使用前必须被初始化。//非final域则不需要可以试下，删除j的final，编译器就不报错了。
    j = 1; // Initialize blank final
    p = new Poppet(1); // Initialize blank final reference
  }

  public BlankFinal(int x) {
    j = x; // Initialize blank final
    p = new Poppet(x); // Initialize blank final reference
  }
  public static void main(String[] args) {
    new BlankFinal();
    new BlankFinal(47);
  }
} ///:~
