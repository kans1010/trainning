class Solution {
    public String solution(String code) {
        String ret = "";
        char[] arr = code.toCharArray();
        boolean mode = false;
        for(int idx = 0; idx < code.length(); idx++){
            if(arr[idx] == '1'){
                mode = !mode;
                continue;
            }
            if(mode == false){
                ret += (idx % 2 == 0)? arr[idx] : "";
            }else if(mode ==true){
                ret += (idx % 2 == 1)? arr[idx] : "";
            }
        }
        return (ret.length() != 0) ? ret : "EMPTY";
    }
}