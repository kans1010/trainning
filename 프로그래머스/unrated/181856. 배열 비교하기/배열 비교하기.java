class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        if(arr1.length>arr2.length) answer = 1;
        else if(arr1.length<arr2.length) answer = -1;
        else{
            int array1=0; int array2 = 0;
            for(int i = 0; i<arr1.length;i++){
                array1+=arr1[i];
                array2+=arr2[i];
            }if(array1==array2)answer = 0;
            else{
                answer = (array1>array2)? 1:-1;
            }
        }
        return answer;
    }
}