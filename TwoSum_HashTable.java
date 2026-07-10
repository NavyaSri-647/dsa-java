import java.util.*;
public class TwoSum_HashTable{
    public static int[] two_sum(int[] arr, int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            int compliment = target - arr[i];
            if(map.containsKey(compliment)){
                return new int[]{map.get(compliment), i};
            }
            map.put(arr[i], i);
        }
        return new int[]{-1,-1};
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        int arr[] = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        int result[] = two_sum(arr, target);
        
        System.out.println(result[0]+ " " +result[1]);
    }
}
