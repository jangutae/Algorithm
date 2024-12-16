class Solution {
    public long solution(long num) {
        long answer = 0;
        long count = 0;
        
        while (num != 1) {
            if (num % 2 == 0) {
                num /= 2;
                count++;
                if (count > 500) {
                    count = -1;
                    break;
                }  
            } else if (num % 2 != 0) {
                num = num * 3 + 1;
                count++;
            } 
        }
        answer = count;
        
        System.out.println(num);
        System.out.println(count);
        System.out.println(answer);
        return answer;
    }
}