class Solution {
    public String solution(String my_string, int[] indices) {
        StringBuilder a = new StringBuilder(my_string);
        for(int i = 0; i < indices.length; i++){
            a.setCharAt(indices[i],'1');
        }
        String answer = String.valueOf(a);
        answer = answer.replaceAll("1","");
        return answer;
    }
}