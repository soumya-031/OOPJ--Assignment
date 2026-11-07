import java.util.*;
class Ass6Q5  {
    public static void main(String args[]) {
        String array1[] = {"python", "java", "c++", "SQL"};
        String array2[] = {"mysql", "SQL", "oracle", "java"};

        String common[] = new String[array1.length];
        int k = 0;

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i].equals(array2[j])) {
                    common[k] = array1[i];
                    k++;
                }
            }
        }

        System.out.print("Common element is : [");

        for (int i = 0; i < k; i++) {
            System.out.print(common[i]);

            if (i < k - 1)
                System.out.print(", ");
        }

        System.out.println("]");
    }
}