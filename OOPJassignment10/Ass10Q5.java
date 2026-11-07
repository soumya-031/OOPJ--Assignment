class P1 {
    int a = 5;
}

class P2 extends P1 {
    int b = 10;
}

class Child extends P2 {
    int c = 15;

    void show() {
        System.out.println("A = " + a);
        System.out.println("B = " + b);
        System.out.println("C = " + c);
    }
}

class D extends P1 {
    int d = 20;

    void sum() {
        System.out.println("Sum: " + (a + d));
    }
}

public class Ass10Q5 {
    public static void main(String args[]) {

        Child obj1 = new Child();
        obj1.show();

        D obj2 = new D();
        obj2.sum();
    }
}
