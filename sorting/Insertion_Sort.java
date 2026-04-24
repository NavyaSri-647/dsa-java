import java.util.*;

public class Insertion_Sort{
	public static void insertionSort(int size, int arr[]){
		int n = arr.length;
		for(int i = 1; i < n; i++){
			int key = arr[i];
			int j = i-1;
			while(j >= 0 && arr[j] > key){
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = key;
		}
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size : ");
		int size = sc.nextInt();
		
		System.out.print("Enter the Elements to be Sorted : ");
		int arr[] = new int[size];
		for(int i = 0; i < size; i++){
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Before Sorting : " + Arrays.toString(arr));
		insertionSort(size, arr);
		System.out.println("After Sorting : " + Arrays.toString(arr));
	}
}
