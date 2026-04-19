import java.util.*;

public class Array_Sum{
	public static void sumOfElements(int size, int arr[]){
		int sum = 0;
		for(int i=0; i<size; i++){
			sum += arr[i];
		}
		System.out.println("Sum of the elements = " +sum);
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
		sumOfElements(size, arr);
	}
}
