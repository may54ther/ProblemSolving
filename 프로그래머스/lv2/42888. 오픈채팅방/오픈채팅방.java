
import java.util.*;

class Solution {

    public String[] solution(String[] record) {
        
        String ENTER_MESSAGE = "님이 들어왔습니다.";
        String LEAVE_MESSAGE = "님이 나갔습니다.";

        HashMap<String, String> members = new HashMap<>();
        ArrayList<String> logs = new ArrayList<>();

        for (String text : record) {
            StringTokenizer st = new StringTokenizer(text, " ");
            String state = st.nextToken();
            String uid = st.nextToken();

            if (st.hasMoreTokens()) {
                String nickname = st.nextToken();
                members.put(uid, nickname);
            }

            if (state.equals("Enter")) 
                logs.add(uid + ENTER_MESSAGE);
            if (state.equals("Leave"))
                logs.add(uid + LEAVE_MESSAGE);
        }

        int size = logs.size(), n = 0;
        String[] answer = new String[size];
        for (String log : logs) {
            String uid = log.substring(0, 7);
            answer[n++] = log.replace(uid, members.get(uid));
        }
        
        return answer;
    }
}
