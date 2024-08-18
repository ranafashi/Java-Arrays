import java.util.*;
public class Array_Q_1 {
    static int findPairs(int[] arr, int target) {
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    ans++;
                    System.out.println("The pairs are : "+arr[i]+" and "+arr[j]);
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Enter array size : ");
            int size = input.nextInt();
            int[] arr = new int[size];
            System.out.println("Enter " + size + " elements : ");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = input.nextInt();
            }
            System.out.println("Enter the target sum to find pairs in the array (or press -1 to exit): ");
            int target = input.nextInt();
            if (target == -1){break;}
            System.out.println("\nThe total number of pairs are : " + findPairs(arr, target)+"\n");
        }
    }
}
