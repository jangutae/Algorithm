class Solution {
    public int solution(int a, int b) {
        StringBuilder sb1 = new StringBuilder();
        sb1.append(b);
        sb1.append(a);
        
        StringBuilder sb2 = new StringBuilder();
        sb2.append(a);
        sb2.append(b);
        int x = Integer.parseInt(sb1.toString());
        int y = Integer.parseInt(sb2.toString());
        
        int answer = x >= y ? x : y;
        return answer;
    }
}