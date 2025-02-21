class Solution {
    public int solution(int balls, int share) {
        
//         return result(balls, share);
//     }
    
//     private int result(int a, int b) {
//         int value = 1;
        
//         for (int i = 0; i < a - b; i++) {
//             value *= (a - i);
//             value /= (i + 1);
//         }
        
        double answer = 0;
        double u = 1, d=1;
        for(int i=share;i>0;i--){
            u *= balls;
            d *= i;
            balls--;
        }
        answer = u / d;
        return (int) answer;
        
    } 
}