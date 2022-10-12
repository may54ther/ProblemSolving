import java.util.Arrays;

class Solution {
    public boolean solution(String[] phone_book) {
        Arrays.sort(phone_book);
        
        int count = 0;
        String temp;
        
        while (count < phone_book.length - 1) {
            temp = phone_book[count++];
            if (phone_book[count].startsWith(temp)) {
                return false;
            }
        }
        
        return true;
    }
}