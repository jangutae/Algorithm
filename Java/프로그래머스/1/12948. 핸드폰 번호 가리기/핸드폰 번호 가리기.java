class Solution {
    public String solution(String phone_number) {
        String str = "";
        String digit = "";
        
        
           
        str = "*".repeat(phone_number.length() - 4);
        digit = phone_number.substring(phone_number.length() - 4);
        
        System.out.println(str);
        System.out.println(digit);
        
        return str + digit;
    }
}