class Solution {
    public int solution(int price) {
        int answer = 0;
        if (price >= 500000) {
            answer = price - price * 20 / 100;
        } else if (price >= 300000) {
            answer = price - price * 10 / 100;
        } else if (price >= 100000) {
            answer =  answer =price - (int)Math.ceil(price*0.05);
        } else {
            answer = price;
        }
        return answer;
    }
}