import java.util.*;

public class Binary_Search{
	public static void binarySearch(int size,int arr[],int key){
		int low = 0;
		int high = arr.length - 1;
		while(low <= high){
			int mid = (low + high)/2;
			if(arr[mid] == key){
				System.out.println("Key found at index " +mid);
				return;
			}else if(arr[mid] < key){
				low = mid + 1;
			}else if(arr[mid] > key){
				high = mid - 1;
			}
		}
		System.out.println("Key not found");
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Size of Array: ");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		System.out.print("Enter the Elements of the Array: ");
		for(int i=0; i<size; i++){
			arr[i] = sc.nextInt();
		}
		
		System.out.print("Enter the Key to be Searched: ");
		int key = sc.nextInt();
		
		binarySearch(size, arr, key);
	}
}
