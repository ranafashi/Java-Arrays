import java.util.*;
public class Array_Q_3 {
    static int findUnique(int[] arr) {
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
           if (arr[i] == arr[j]) {
                arr[i]=-1;
                arr[j]=-1;
           }
            }
        }
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]>0){
               ans=arr[i];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

            System.out.println("Enter array size : ");
            int size = input.nextInt();
            int[] arr = new int[size];
            System.out.println("Enter " + size + " elements : ");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = input.nextInt();
            }
            System.out.println("\nThe unique number in the given array is  : " + findUnique(arr)+"\n");
        }
    }


