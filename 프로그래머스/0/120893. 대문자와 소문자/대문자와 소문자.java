class Solution {
    public String solution(String my_string) {
        char[] characters = my_string.toCharArray();
        
	    for(int i = 0; i < characters.length; i++) {
            if (Character.isLowerCase(characters[i])) {
                characters[i] = Character.toUpperCase(characters[i]);
            } else {
                characters[i] = Character.toLowerCase(characters[i]);
            }
	    }
	
    	return String.valueOf(characters);   
    }
}