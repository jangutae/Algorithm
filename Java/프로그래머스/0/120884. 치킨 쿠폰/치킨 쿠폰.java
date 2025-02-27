class Solution {
    public int solution(int chicken) {
        int answer = -1;
        
        int service = 0;
        int coupons = chicken;
        
        while (coupons >= 10) {
            int newService = coupons / 10;
            service += newService;
            coupons = newService + (coupons % 10);
        }
        
        answer = service;
        
        return answer;
    }
}