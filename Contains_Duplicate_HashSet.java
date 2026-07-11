import java.util.*;
public class Contains_Duplicate_HashSet{
	public static boolean containsDuplicate(int nums[]){
		HashSet<Integer> set = new HashSet<>();
		for(int num : nums){
			if(set.contains(num)){
				return true;
			}
			set.add(num);
		}
		return false;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Size: ");
		int size = sc.nextInt();
		System.out.println("Elements in array: ");
		int arr[] = new int[size];
		for(int i = 0; i < size; i++){
			arr[i] = sc.nextInt();
		}
		boolean result = containsDuplicate(arr);
		System.out.println(result);
	}
}
