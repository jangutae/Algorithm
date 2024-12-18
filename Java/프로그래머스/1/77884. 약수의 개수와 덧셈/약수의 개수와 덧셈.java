class Solution {
    public int solution(int left, int right) {
//         int answer = 0;
//         int index = 1;
//         int count = 0;
        
//         for (int j = left; j <= right; j++) {
//             for (int i = 1; i <= j; i++) {
//                 if (j % i == 0) {
//                     count++;
//                 }
//             }
            
//             if (count % 2 == 0) {
//                 answer += j;
//             } else {
//                 answer -= j;
//             }
//         System.out.println(count);
//         count = 0;
//         }
        
//         System.out.println(answer);
        
        int answer = 0;

        for (int i=left;i<=right;i++) {
            //제곱수인 경우 약수의 개수가 홀수
            if (i % Math.sqrt(i) == 0) {
                answer -= i;
            }
            //제곱수가 아닌 경우 약수의 개수가 짝수
            else {
                answer += i;
            }
        }

        return answer;
    }
}