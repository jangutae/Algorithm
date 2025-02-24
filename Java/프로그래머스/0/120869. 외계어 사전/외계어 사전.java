import java.util.Arrays;

class Solution {
    public int solution(String[] spell, String[] dic) {
        // spell을 정렬하여 문자열로 변환
        char[] spellArr = new char[spell.length];
        for (int i = 0; i < spell.length; i++) {
            spellArr[i] = spell[i].charAt(0);
        }
        Arrays.sort(spellArr);
        String spellStr = new String(spellArr);

        // dic 배열을 순회하며 정렬된 형태와 비교
        for (String word : dic) {
            char[] wordArr = word.toCharArray();
            Arrays.sort(wordArr);
            if (new String(wordArr).equals(spellStr)) {
                return 1; // 일치하는 단어가 존재하면 1 반환
            }
        }
        return 2; // 존재하지 않으면 2 반환
    }
}