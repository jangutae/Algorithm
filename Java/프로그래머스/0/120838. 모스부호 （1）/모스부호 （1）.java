import java.util.*;

class Solution {
    public String solution(String letter) {
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
        String[] alphabet = "abcdefghijklmnopqrstuvwxyz".split("");
        
        
        Map<String, String> morseMap = new HashMap<>();
        
         for (int i = 0; i < morse.length; i++) {
            morseMap.put(morse[i], alphabet[i]);
        }

        StringBuilder result = new StringBuilder();
        for (String code : letter.split(" ")) {
            result.append(morseMap.get(code));
        }

        return result.toString();
        
    }
}