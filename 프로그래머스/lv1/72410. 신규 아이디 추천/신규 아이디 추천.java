class Solution {
    
    private final int MIN = 3;
    private final int MAX = 15;
    
     public String solution(String new_id) {
        
        String answer = "";

        //1. 소문자 치환
        answer = new_id.toLowerCase();

        //2. 사용할 수 없는 특수문자 제거
        answer = answer.replaceAll("[^0-9a-z._-]", "");

        //3. ... => .
        answer = answer.replaceAll("[.]{2,}", ".");

        //4. 처음/끝에 위치한 마침표(.) 제거
        answer = answer.replaceAll("^[.]|[.]$", "");

        //5. 빈 문자열이라면, "a" 대입
        answer = answer.isBlank() ? "a" : answer;

        //6. 최대 길이 제한(15자)
        if (answer.length() > MAX) {
            answer = answer.substring(0, MAX);
            answer = answer.replaceAll("^[.]|[.]$", "");
        }

        //7. 최소 길이(3자) 미만이면 마지막 글자 추가
        while (answer.length() < MIN) {
            answer += String.valueOf(answer.charAt(answer.length() - 1));
        }

        return answer;
    }
}