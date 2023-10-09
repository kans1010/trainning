import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        
        int strLen = str.length();
        
        if(1 <= n && n <= 5 && 1 <= strLen && strLen <= 10){
            for(int i = 1; i <= n; i++){
                System.out.printf(str);
            }
                System.out.printf("%n");   
            } else{
            System.out.println("false");
        }
    sc.close();
    }
}