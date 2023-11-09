import java.util.*;

class Solution {
    public String[] solution(String myString) {
        String[] arr = myString.split("x");
        List<String> list = new ArrayList<>();
        for (String str : arr) {
            if (!str.equals("")) {
                list.add(str);
            }
        }
        String[] answer = new String[list.size()];
        list.toArray(answer);
        Arrays.sort(answer);
        return answer;
    }
}