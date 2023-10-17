class Solution {
    public int solution(int[] num_list) {
        String odd = "";
        String even = "";
        for(int a : num_list){
            if(a % 2 ==0){
                even +=a;
            }else{
                odd +=a;
            }
        }
        return Integer.parseInt(even)+Integer.parseInt(odd);
    }
}