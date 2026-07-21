import java.util.*;
public class MajorityElement{
	public static int majority_element(int arr[]){
		for(int i = 0; i < arr.length; i++){
			int count = 0;
			for(int j = 0; j < arr.length; j++){
				if(arr[i] == arr[j]){
					count++;
				}
			}
			if(count > arr.length/2){
				return arr[i];
			}
		}
		return -1;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int arr[] = new int[size];
		for(int i = 0; i < size; i++){
			arr[i] = sc.nextInt();
		}
		int res = majority_element(arr);
		System.out.println("Majority element: " +res);
	}
}
