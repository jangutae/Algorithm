class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String kStr = String.valueOf(k);
        
        for (int m = i; m <= j; m++) {
            String mStr = String.valueOf(m);
            if (mStr.contains(kStr)) {
                String newStr = mStr.replaceAll(kStr, "");
                answer += mStr.length() - newStr.length();
            } 
        }
        return answer;
    }
}