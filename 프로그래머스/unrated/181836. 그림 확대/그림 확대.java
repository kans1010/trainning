import java.util.Arrays;

class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length*k];
        Arrays.fill(answer,"");
        String temp = "";
        for(int i = 0; i<answer.length;i++){
            for(int j = 0; j<picture[i/k].length(); j++){
                 answer[i]+= picture[i/k].substring(j,j+1).repeat(k);
            }
        }
        return answer;
    }
}