class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        int[] counter = new int[30];
        for(int i = 0; i<strArr.length;i++){
            int len = strArr[i].length();
            counter[len-1]++;
        }
        for(int i = 0; i<30;i++){
            if(counter[i]>answer) answer = (counter[i]);
        }
        return answer;
    }
}