import java.util.*;

public class Bubble_Sort{
	public static void bubble_sort(int size, int arr[]){
		int n = arr.length;
		for(int i = 0; i < n-1; i++){
			for(int j = 0; j < n-i-1; j++){
				if(arr[j]>arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size of array: ");
		int size = sc.nextInt();
		
		System.out.print("Enter the elements of array: ");
		int arr[] = new int[size];
		for(int i = 0; i < size; i++){
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Before sorting: " +Arrays.toString(arr));
		bubble_sort(size, arr);
		System.out.println("After sorting: " +Arrays.toString(arr));
	}
}
