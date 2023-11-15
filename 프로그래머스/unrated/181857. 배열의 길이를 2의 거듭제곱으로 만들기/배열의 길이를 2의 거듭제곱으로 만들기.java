class Solution {
    public int[] solution(int[] arr) {
        int len = arr.length;
        
        int i = 0;
        while(len>Math.pow(2,i)){
            i++;
        }
        int[] answer = new int[(int)Math.pow(2,i)];
        for(int j = 0; j<arr.length;j++){
            answer[j] = arr[j];
        }
        return answer;
    }
}