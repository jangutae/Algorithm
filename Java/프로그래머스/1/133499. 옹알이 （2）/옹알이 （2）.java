class Solution {
    public int solution(String[] babbling) {
//         int answer = 0;
//         String[] word = {"aya", "ye", "woo", "ma"};
        
//         for (String s : babbling) {
            
//             for (String w : word) {
//                 if (!s.contains(w.repeat(2))) {
//                     s = s.replaceFirst(w, "");
//                 }
//             }
            
            
//             if (s.isBlank()) answer++;
//             System.out.println(s);
//         }
//         // System.out.println(s);
//         return answer;
        
        int count = 0;
        String pattern = "^(aya(?!aya)|ye(?!ye)|woo(?!woo)|ma(?!ma))+$";

        for (String word : babbling) {
            if (word.matches(pattern)) {
                count++;
            }
        }
        return count;
    }
}