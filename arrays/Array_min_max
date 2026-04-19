import java.util.*;

public class Array_min_max{
	public static void findMinimum(int size, int arr[]){
		int min = arr[0];
		for(int i=1; i<size; i++){
			if(arr[i]<min){
				min = arr[i];
			}
		}
		System.out.println("Minimum = " +min);
	}
	public static void findMaximum(int size, int arr[]){
		int max = arr[0];
		for(int i=1; i<size; i++){
			if(arr[i]>max){
				max = arr[i];
			}
		}
		System.out.println("Maximum = " +max);
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the Array: ");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		System.out.print("Enter the elements of the array: ");
		for(int i=0; i<size; i++){
			arr[i] = sc.nextInt();
		}
		findMinimum(size, arr);
		findMaximum(size, arr);
	}
}
