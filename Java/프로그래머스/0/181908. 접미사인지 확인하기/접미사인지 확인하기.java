class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        String[] arr = new String[my_string.length()];
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] =  my_string.substring(i, arr.length);
        }
        
        for (String s : arr) {
            if (s.equals(is_suffix)) {
                answer = 1;
            }
        }
        
        return answer;
    }
}