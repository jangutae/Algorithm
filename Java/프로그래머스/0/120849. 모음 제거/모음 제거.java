import java.util.*;

class Solution {
    public String solution(String myString) {
        
        String[] strArr = {"a", "e", "i", "o", "u"};
        
        for (String s1 : strArr) {
            if (myString.contains(s1)) {
                myString = myString.replaceAll(s1, "");
            }
        }
        
        
        return myString;
    }
}
