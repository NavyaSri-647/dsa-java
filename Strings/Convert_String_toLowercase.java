import java.util.Scanner;
class Convert_String_toLowercase{
    static String toLower(String s){
        char[] arr = s.toCharArray();
        for(int i = 0; i < arr.length; i++){
            if(arr[i] >= 'A' && arr[i] <= 'Z'){
                arr[i] = (char)(arr[i] + 32);
            }
        }
        return new String(arr);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String res = toLower(s);
        System.out.println(res);
        sc.close();
    }
}
