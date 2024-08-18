import java.util.*;

public class Array_Q_5 {
    static int isRepeated(int[] arr) {
        int ans = -1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return arr[i];
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Array Size : ");
        int size = input.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter "+size+" elements : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println("The Fist Element Repeated in the given Array is : " + isRepeated(arr));

    }
}
