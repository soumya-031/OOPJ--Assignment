import java.util.*;
class Ass6Q3 {
    public static void main(String args[]) {
        int a[] = {2, 14, 56, 15, 36, 56, 77, 18, 29, 49};

        int max = a[0];
        int min = a[0];

        for (int i : a) {
            if (i > max)
                max = i;

            if (i < min)
                min = i;
		
        }

        System.out.println("Maximum value for the above array = " + max);
        System.out.println("Minimum value for the above array = " + min);
    }
}