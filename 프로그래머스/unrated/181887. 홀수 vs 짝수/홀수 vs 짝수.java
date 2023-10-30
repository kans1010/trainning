class Solution {
    public int solution(int[] num_list) {
        int esum = 0; int osum = 0;
        int answer = 0;
        for(int i = 0; i<num_list.length;i++){
            if(i%2 ==0){
                esum = esum + num_list[i];
            }else{
                osum = osum + num_list[i];
            }
        }
        return answer = (esum>osum)? esum:osum;
    }
}