class Solution {
    public int solution(int a, int b) {
        int answer = 2;
        
        int gcdValue = gcd(a, b);
        int mother = b / gcdValue;
        System.out.println(gcdValue);
        // a/b -> 기약분수(최대공약수)로 나타내야함 -> 분모가 2,5로 나눠지는지 확인해야함 -> 삼항연산자 사용 
        // double fraction = (son) / (mother);
        while (mother % 2 == 0) {
            mother /= 2;
        }        
        
        while (mother % 5 == 0) {
            mother /= 5;
        }
        
        if (mother == 1) {
            answer = 1;
        }
       
        return answer;
    }
    
    private int gcd(int num1, int num2) {
         while (num2 > 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }
}