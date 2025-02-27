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
            
            // if (String.valueOf(index).contains("3")) {
            //     index++;
            // }
            
            //  if (index % 3 == 0) {
            //     index++;
            // }
            
            System.out.println(index);
            answer = index;
            count++;
            index++;
        }
            
            
            System.out.println(answer);
    
        return answer;
    }
}