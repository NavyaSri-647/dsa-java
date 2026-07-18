import java.util.*;
public class longest_Substring_hashset{
	public static int substring_count(String s){
		HashSet<Character> set = new HashSet<>();
		int left = 0;
		int maxlength = 0;
		for(int right = 0; right < s.length(); right++){
			while(set.contains(s.charAt(right))){
				set.remove(s.charAt(left));
				left++;
			}
			set.add(s.charAt(right));
			maxlength = Math.max(maxlength, right - left + 1);
		}
		return maxlength;
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int maxlength = substring_count(s);
		System.out.println(maxlength);
	}
}
