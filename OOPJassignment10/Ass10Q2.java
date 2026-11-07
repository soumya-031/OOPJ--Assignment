interface A {
    default void show() {
        System.out.println("This is Interface A");
    }
}

interface B {
    default void display() {
        System.out.println("This is Interface B");
    }
}

class C implements A, B {
}

public class Ass10Q2 {
    public static void main(String args[]) {
        C obj = new C();

        obj.show();
        obj.display();
    }
}
