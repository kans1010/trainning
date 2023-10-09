import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char[] arr = a.toCharArray();
        String b = ""; 
        if(a.length() >= 1 && a.length() <= 20){
            for(char x : arr){
                if(x >= 65 && x <= 90){
                    b += (char)(x + 32);
                }if(x >= 97 && x <= 122){
                    b += (char)(x - 32);
                }
            }
            System.out.println(b);
        }
    sc.close();
    }
}