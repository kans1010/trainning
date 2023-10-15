class Solution {
    public int solution(int a, int b) {
        String aa = Integer.toString(a);
        String bb = Integer.toString(b);
        int c = Integer.parseInt(aa+bb);
        int d = Integer.parseInt(bb+aa);
        return (c>d)? c:d;
    }
}