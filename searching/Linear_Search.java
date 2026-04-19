import java.util.*;

public class Linear_Search{
	public static void linearSearch(int size,int arr[],int key){
		for(int i=0; i<size; i++){
			if(key == arr[i]){
				System.out.println("Key found at index " +i);
				return;
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
		
		linearSearch(size, arr, key);
	}
}
