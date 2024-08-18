import java.util.*;
public class Array_Q_2 {
    static int findTriplets(int[] arr, int target) {
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j+1; k <arr.length ; k++) {
                    if (arr[i] + arr[j] +arr[k] == target) {
                        ans++;
                        System.out.println("The Triplets are : "+ arr[i] + "," + arr[j] + " and " + arr[k] );
                    }
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
            System.out.println("Enter the target sum to find Triplets in the array (or press -1 to exit): ");
            int target = input.nextInt();
            if (target == -1){break;}
            System.out.println("\nThe total number of pairs of triplets are : " + findTriplets(arr, target)+"\n");
        }
    }
}

