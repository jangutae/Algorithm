class Solution {
    public int solution(int n) {
        int answer = 0;
        int count = 0; 
        int index = 1; 

        while (count < n) { 
            if (index % 3 == 0 || String.valueOf(index).contains("3")) {
                index++; 
                continue;
            }
            answer = index; 
            count++; 
            index++; 
        }

       
        return answer;
    }
}