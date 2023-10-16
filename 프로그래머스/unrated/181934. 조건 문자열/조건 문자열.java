class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        boolean a = true;
        switch(ineq + eq){
            case ">=":
                a = n >= m;
                break;
            case "<=":
                a = n <= m;
                break;
            case "<!":
                a = n < m;
                break;
            case ">!":
                a = n > m;
                break;
        } 
        return (a)? 1:0;
    }
}