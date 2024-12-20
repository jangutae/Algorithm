class Solution {
    public int solution(String s) {
        String[] en = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        
        for (int i = 0; i < en.length; i++) {
            s = s.replaceAll(en[i], String.valueOf(i));
        }
        return Integer.parseInt(s);
    }
}