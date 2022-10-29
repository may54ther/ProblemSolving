class Solution {
    public static String solution(String s) {
		String[] st = s.toLowerCase().split("");
		StringBuilder result = new StringBuilder(st[0].toUpperCase());

		for(int i=1; i<st.length; i++) {
			if(st[i-1].isBlank()) {
				result.append(st[i].toUpperCase());
			} else
				result.append(st[i]);
		}

		return result.toString();
	}
}