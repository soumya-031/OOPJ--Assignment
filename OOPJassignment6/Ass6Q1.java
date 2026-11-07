 import java.util.*;
 class Ass6Q1 {
    public static void main(String args[]) {
        int a[]  = {100, 20, 30, 10, 50};

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        for (int i : a)
            System.out.print(i + " ");
    }
}