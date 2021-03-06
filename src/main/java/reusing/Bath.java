//: reusing/Bath.java
package reusing; /* Added by Eclipse.py */
// Constructor initialization with composition.

import static net.mindview.util.Print.print;

class Soap {
    private String s;

    Soap() {
        print("Soap()");
        s = "Constructed";
    }

    public String toString() {
        return s;
    }
}

public class Bath {
    private String // Initializing at point of definition:
            s1 = "Happy",
            s2 = "Happy",
            s3, s4;
    private Soap castille;
    private int i;
    private float toy;

    // Instance initialization://在构造函数之前，运行可只该结果。
    {
        i = 47;
        print("Instance initialization");
    }

    public Bath() {
        print("Inside Bath() constructor");
        s3 = "Joy";
        toy = 3.14f;
        castille = new Soap();
    }

    public static void main(String[] args) {
        Bath b = new Bath();
        print(b);
    }

    public String toString() {
        if (s4 == null) // Delayed initialization:
            s4 = "Joy";
        return
                "s1 = " + s1 + "\n" +
                        "s2 = " + s2 + "\n" +
                        "s3 = " + s3 + "\n" +
                        "s4 = " + s4 + "\n" +
                        "i = " + i + "\n" +
                        "toy = " + toy + "\n" +
                        "castille = " + castille;
    }
} /* Output:
Inside Bath()
Soap()
s1 = Happy
s2 = Happy
s3 = Joy
s4 = Joy
i = 47
toy = 3.14
castille = Constructed
*///:~
