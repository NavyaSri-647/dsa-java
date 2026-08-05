import java.util.*;
public class LeadersInArray{
	public static ArrayList<Integer> leaders(int[] arr){
		ArrayList<Integer> list = new ArrayList<>();
		int n = arr.length;
		int max = arr[n-1];
		list.add(max);
		for(int i = n-2; i >= 0; i--){
			if(max <= arr[i]){
				max = arr[i];
				list.add(arr[i]);
			}
		}
		Collections.reverse(list);
		return list;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Size of array: ");
		int size = sc.nextInt();
		
		System.out.println("Elements of array: ");
		int[] arr = new int[size];
		for(int i = 0; i < size; i++){
			arr[i] = sc.nextInt();
		}
		ArrayList<Integer> ans = leaders(arr);
		System.out.println("Leaders in the array: ");
		for(int a : ans){
			System.out.print(a + " ");
		}
	}
}
