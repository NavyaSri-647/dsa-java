import java.util.Scanner;
public class Reverse_Int{
	public static int reverse_integer(int x){
		int rev = 0;
		while(x!=0){
			int rem = x % 10;
			
			if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && rem > 7)){
				return 0;
			}

			if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && rem < -8)){
				return 0;
			}
			rev = rev*10 + rem;
			x = x/10;
		}
		return rev;
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter an integer: ");
		
		int n = sc.nextInt();
		int reverse = reverse_integer(n);
		
		System.out.print("Reverse integer of " + n + " is " +reverse);
	}
}
