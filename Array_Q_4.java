import java.util.*;
public class Array_Q_4 {
static int isFirstMax(int[] arr){
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length ; i++) {
        if (arr[i]>max){
            max=arr[i];
        }
    }
return max;
}
static int isSecondMax(int[] arr){
    int max = isFirstMax(arr);
    for (int i = 0; i <arr.length ; i++) {
        if (arr[i] == max){
            arr[i] = Integer.MIN_VALUE;
        }
    }
int SecondMax =  isFirstMax(arr);
    return SecondMax;
}
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.println("Enter Array size : ");
        int size = input.nextInt();
        int [] arr = new int[size];
        System.out.println("Enter "+size+" elements : ");
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println("The Second Largest Element  in the Array is  " +isSecondMax(arr));

    }


}
