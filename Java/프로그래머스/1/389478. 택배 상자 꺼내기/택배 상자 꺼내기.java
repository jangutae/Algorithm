class Solution {
    public int solution(int n, int w, int num) {
//         int answer = 0;
        
//         // 현재 층수 
//         int layer = (num % w == 0) ? num / w : num / w + 1 ;
        
//         // 전체 층수
//         int wholeLayer = (n % w == 0) ? n / w : n / w + 1;   
        
//         // 층수에서 이동한 칸
//         int value2 = num % w;
        
//         // 꼭대기 층에서 이동한 칸
//         int value3 = n % w;
        
//         if (n % w == 0) {
//             answer = wholeLayer - layer;
//         } 
        
//         if ( w == 1) {
//             answer = n - num;
//         }
        
//         while (num + (2 * w) <= wholeLayer * w) {
        
//         if (num + (2 * w) > n) {
//             answer = (wholeLayer - 1) - layer + 1;
            
//         } else if (num + (2 * w) <= n) {
//             answer = wholeLayer - layer + 1;
//         }
//         num = num + (2 * w);
        
//         }
        
        
//         System.out.println(num);
//         return answer;
        
         int answer = 0;
        while (num <= n) {
            num += 2 * (w - ((num - 1) % w) - 1) + 1;
            answer ++;
        }
        return answer;
    }
}