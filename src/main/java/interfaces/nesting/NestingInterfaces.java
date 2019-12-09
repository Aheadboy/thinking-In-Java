//: interfaces/nesting/NestingInterfaces.java
package interfaces.nesting;

/**
 * 该文件中文注释--ljj
 * 接口嵌套在类中，可以private，但是也只能在该类内部implement该接口。
 * 接口嵌套在接口中，是不可以为private。
 */
class A {
  interface B {
    void f();
  }
  public class BImp implements B {
    public void f() {}
  }
  private class BImp2 implements B {
    public void f() {}
  }
  public interface C {
    void f();
  }
  class CImp implements C {
    public void f() {}
  }	
  private class CImp2 implements C {
    public void f() {}
  }
  private interface D {//嵌套在类中，可以是private
    void f();
  }
  private class DImp implements D {
    public void f() {}
  }
  public class DImp2 implements D {
    public void f() {}
  }
  public D getD() { return new DImp2(); }
  private D dRef;
  public void receiveD(D d) {
    dRef = d;
    dRef.f();
  }
}	

interface E {
  interface G {
    void f();
  }
  // Redundant "public":
  public interface H {
    void f();
  }
  void g();
  // Cannot be private within an interface:
  //! private interface I {}//嵌套在接口中，不能修饰为private
}	

public class NestingInterfaces {
  public class BImp implements A.B {
    public void f() {}
  }
  class CImp implements A.C {
    public void f() {}
  }
  // Cannot implement a private interface except//嵌套在类中的私有接口，不能在类外被implement
  // within that interface's defining class:
  //! class DImp implements A.D {
  //!  public void f() {}
  //! }
  class EImp implements E {
    public void g() {}
  }
  class EGImp implements E.G {
    public void f() {}
  }
  class EImp2 implements E {
    public void g() {}
    class EG implements E.G {
      public void f() {}
    }
  }	
  public static void main(String[] args) {
    A a = new A();
    // Can't access A.D: //类中的私有接口，不能被外部所使用
    //! A.D ad = a.getD();
    // Doesn't return anything but A.D:
    //! A.DImp2 di2 = a.getD();
    // Cannot access a member of the interface://私有接口的成员函数，不可被访问。
    //! a.getD().f();
    // Only another A can do anything with getD()://唯有A类，（嵌套类私有接口的类），才可以有效使用，该类的私有接口。
    A a2 = new A();
    a2.receiveD(a.getD());
  }
} ///:~
