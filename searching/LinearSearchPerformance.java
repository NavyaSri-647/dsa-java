import java.util.*;
public class LinearSearchPerformance{
	public static int search(int arr[], int n, int x){
		for(int i = 0; i < n; i++){
			if(arr[i] == x){
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of elements: ");
		int n = sc.nextInt();
		System.out.print("Enter the elements: ");
		int arr[] = new int[n];
		for(int i = 0; i < n; i++){
			arr[i] = sc.nextInt();
		}
		System.out.print("Enter the element to search: ");
		int x = sc.nextInt();
		
		long startTime = System.nanoTime();
		int index = search(arr, n, x);
		long endTime = System.nanoTime();
		if(index == -1){
			System.out.println("Target not found!");
		}
		else{
			System.out.println("Target found at index " + index);
		}
		long duration = endTime - startTime;
		System.out.println("Execution Time (nano seconds): " + duration);
		
		long spaceUsed = n*4;
		System.out.println("Approximate memory used (bytes): " +spaceUsed);
		sc.close();
	}
}
