import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = -100000;
        int y = 100000;
        
        if(a >= x && a <= y && b >= x && b <= y ){
            System.out.println("a = " + a);
            System.out.println("b = " + b);
            
        }else{
            System.out.println("false");
        }

    }
}