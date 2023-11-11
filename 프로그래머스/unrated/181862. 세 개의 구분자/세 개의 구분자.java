import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        String replaced = myStr.replace('a',' ').
            replace('b',' ').replace('c',' ');
        if(replaced.trim().isEmpty()){
            replaced = "EMPTY";
        }
        String[] answer = replaced.trim().split("\\s+");
        return answer;
    }
}