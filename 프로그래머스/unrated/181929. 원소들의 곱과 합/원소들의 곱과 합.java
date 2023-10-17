class Solution {
    public int solution(int[] num_list) {
        int x = 1;
        int p = 0;
        for(int a : num_list){
            x *= a;
            p += a;
        }
        return (x < Math.pow(p,2)) ? 1 : 0;
    }
}