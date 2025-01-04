import java.util.Scanner;
public class BubbleSort{
    public static void sort(int[] arr){
        int n = arr.length;
        int temp;    
        for(int i = 0; i < n-1;i++){
            for(int j = 0; j < n-i-1;j++){
                if (arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("Sorted array:");
        for(int i = 0; i < n;i++){
            System.out.print(arr[i] + " ");
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i = 0; i < n;i++){
            arr[i] = scanner.nextInt();
        }
        scanner.close();
        sort(arr);
    }
}