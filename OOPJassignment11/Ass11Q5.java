import java.util.Scanner;

public class Ass11Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int[] freq = new int[256];
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }

        int firstMax = 0;
        int secondMax = 0;
        char secondChar = '\0';
        for (int i = 0; i < 256; i++) {
            if (freq[i] > firstMax) {
                firstMax = freq[i];
            }
        }
        for (int i = 0; i < 256; i++) {
            if (freq[i] > secondMax && freq[i] < firstMax) {
                secondMax = freq[i];
                secondChar = (char) i;
            }
        }

        if (secondMax == 0) {
            System.out.println("There is no second most frequent character.");
        } else {
            System.out.println("Second most frequent character: " + secondChar);
            System.out.println("Frequency: " + secondMax);
        }

        sc.close();
    }
}
