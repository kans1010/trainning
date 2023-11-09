class Solution {
    public int solution(String binomial) {
        String[] arr = binomial.split(" ");
        int a = Integer.valueOf(arr[0]);
        int b = Integer.valueOf(arr[2]);
        int answer = 0;
        switch(arr[1]){
            case "+": answer = a+b; break;
            case "-": answer = a-b; break;
            case "*": answer = a*b; break;
        }
        return answer;
    }
}