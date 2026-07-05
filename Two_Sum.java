import java.util.*;
public class Two_Sum{
	public static void solution(int[] arr, int t){
		int n = arr.length;
		for(int i = 0; i < n-1; i++){
			for(int j = i+1; j < n; j++){
				if(arr[i] + arr[j] == t){
					System.out.println("Pair found");
					System.out.println("Indices: " + i + " and " + j);
					System.out.println("Elements: " + arr[i] + " and " +arr[j]);
					return;
				}
			}
		}
		System.out.println("Pair not found!");
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Size: ");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		System.out.print("Enter the elements of array: ");
		for(int i = 0; i < size; i++){
			arr[i] = sc.nextInt();
		}
		
		System.out.print("Target: ");
		int target = sc.nextInt();
		
		solution(arr, target);
	}
}
