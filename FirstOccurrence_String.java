import java.util.Scanner;
public class FirstOccurrence_String{
    public static int strStr(String haystack, String needle){
        int a = haystack.length();
        int b = needle.length();

        if(b==0){
            return 0;
        }
        for(int i = 0; i <= a-b; i++){
            int j = 0;
            while(j < b && haystack.charAt(i+j) == needle.charAt(j)){
                j++;
            }
            if(j == b){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        int res = strStr(s1, s2);
        System.out.println(res);
    }
}
