class Solution {
    public int solution(int chicken) {
        int answer = -1;
        int serviceChicken = 0;
        int coupon = chicken;
        
        while (coupon >= 10) {
            int newChicken = coupon / 10;
            serviceChicken += newChicken;
            coupon = (coupon % 10) + newChicken;
        }
        
        answer = serviceChicken;
        
        return answer;
    }
}