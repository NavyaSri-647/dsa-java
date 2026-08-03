import java.util.Scanner;
public class GCD_ofStrings{
    public String gcdOfString(String str1, String str2){
        if(!(str1 + str2).equals(str2 + str1)){
            return "";
        }
        int length = gcd(str1.length(), str2.length());
        
        return str1.substring(0,length);
    }
    public int gcd(int a, int b){
        while(b!=0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        GCD_ofStrings obj = new GCD_ofStrings();
        System.out.println("GCD of the two strings: " + obj.gcdOfString(str1, str2));
    }
}
