class Solution {
    boolean solution(String s) {
        boolean answer = true;
        char[] arr = s.toLowerCase().toCharArray();
        int p = 0; int y = 0;
        for(char c:arr){
            p += (c =='p')? 1:0;
            y += (c =='y')? 1:0;
        }

        return p==y;
    }
}