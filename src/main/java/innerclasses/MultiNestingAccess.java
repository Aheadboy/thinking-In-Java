//: innerclasses/MultiNestingAccess.java
package innerclasses; /* Added by Eclipse.py */
// Nested classes can access all members of all
// levels of the classes they are nested within.

/**
 * 多级内部类，可以访问其外部多级类的所有成员。
 *
 */
class MNA {
  private int MNAint;
  private void f() {}
  class A {
    private int anInt;
    private void g() {}

    /**
     * 最内层的内部类，可以访问到
     * A的所有成员
     * MNA的所有成员
     */
    public class B {
      void h() {
        g();
        f();
        System.out.println(MNAint);
        System.out.println(anInt);

      }
    }
  }
}	

public class MultiNestingAccess {
  public static void main(String[] args) {
    MNA mna = new MNA();
    MNA.A mnaa = mna.new A();
    MNA.A.B mnaab = mnaa.new B();
    mnaab.h();
  }
} ///:~
