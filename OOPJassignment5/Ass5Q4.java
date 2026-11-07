import java.util.*;

class Ass5Q4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        int a[] = new int[n];

        System.out.println("Enter " + n + " elements in sorted order: ");

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.print("Enter the element to search: ");
        int key = sc.nextInt();

        int low = 0;
        int high = n - 1;
        int found = -1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (a[mid] == key) {
                found = mid;
                break;
            } else if (key < a[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        if (found != -1) {
            System.out.println("Element found at position " + (found + 1));
        } else {
            System.out.println("Element not found");
        }

        sc.close();
    }
}