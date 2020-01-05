package innerclasses;

/**
 * 普通内部类不能有静态申明。
 *
 */
public class ljjTest {
    static int staticInt1;
    int nonStaticInt2;

    /**
     * 普通内部类的使用，是一定要实例化的。
     * 而且，它自己实例化前，还要依赖外部类先实例化。
     * 那么，依赖于实例化才能使用的类，它内部的静态成员还有什么意义呢。
     * 所有普通内部类不能有静态成员。
     */
    class InnerClass {
        /**
         * 不可以在普通内部类中，定义静态成分。
         */
//！        static {}//Inner Class can not have static declarations
//！        static int k;
//！        static void fun1() {
//!        }
    }
    static class NestedClass {
        public NestedClass() {
            System.out.println(staticInt1);
//！            System.out.println(nonStaticInt2);//静态内部类，不能访问外部类的非静态成员。
        }
        static {}
        static int k;
        static void fun1() {

        }
    }

    /**
     * 函数不能有静态成员。
     */
    static void outFunStatic() {
         int staticInStaticFun;
    }
}
