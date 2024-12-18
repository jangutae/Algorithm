class Solution {
    public String solution(String word) {
//         String answer = "";
        
        
//         String[] str = s.split("");
        
//         if (str.length % 2 == 0) {
//             answer = str[str.length / 2 - 1]  + str[str.length / 2];
//         } else {
//             answer = str[str.length / 2];
//         }
        return word.substring((word.length()-1)/2, word.length()/2 + 1);
        // return answer;
    }
}