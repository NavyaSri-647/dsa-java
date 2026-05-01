import java.util.*;
public class Quick_Sort{
	static int partition(int arr[], int low, int high){
		int pivot = arr[high];    //choosing the last element as pivot
		int i = low - 1;
		
		for(int j = low; j < high; j++){
			if(arr[j] < pivot){
				i++;
				
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
		
		return i+1;
	}
	
	public static void quickSort(int arr[], int low, int high){
		if(low < high){
			int p = partition(arr, low, high);
			
			quickSort(arr, low, p-1);     //left side
			quickSort(arr, p+1, high);    //right side
			
			/*   |left part|  |pivot|  |right part|
				   low...i      i+1     i+2...high    */
		}
	}
	
	static void display(int arr[]){
		System.out.println("Sorted Array: ");
		for(int x:arr){
			System.out.print(x + " ");
		}
		System.out.println();
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size of the array: ");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		System.out.print("Enter the elements of the array: ");
		for(int i = 0; i < size; i++){
			arr[i] = sc.nextInt(); 
		}
		
		quickSort(arr, 0, arr.length - 1);
		display(arr);
	}
}
