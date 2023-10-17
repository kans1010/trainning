class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        if(a == b && b == c){
            answer = a * 3 
                * (int)(Math.pow((double)a,2) * 3) 
                * (int)(Math.pow((double)a,3) * 3);
        }else if(a == b || b == c || a == c){
            answer = (a + b + c) *  
                 ((int)(Math.pow((double)a,2))
                + (int)(Math.pow((double)b,2))
                + (int)(Math.pow((double)c,2)));
        }else{
            answer = a + b + c;
        }
        return answer;
    }
}