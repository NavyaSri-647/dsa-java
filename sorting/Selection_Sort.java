import java.util.*;

public class Selection_Sort{
	public static void selectionSort(int size, int arr[]){
		int n = arr.length;
		for(int i = 0; i < n-1; i++){
			int min = i;
			for(int j = i+1; j < n; j++){
				if(arr[min] > arr[j]){
					int temp = arr[j];
					arr[j] = arr[min];
					arr[min] = temp;
				}
			}
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
		selectionSort(size, arr);
		System.out.println("After Sorting : " + Arrays.toString(arr));
	}
}
