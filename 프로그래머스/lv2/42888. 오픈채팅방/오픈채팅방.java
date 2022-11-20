
import java.util.*;

class Solution {
    
    private static final String ENTER_MESSAGE = "님이 들어왔습니다.";
    private static final String LEAVE_MESSAGE = "님이 나갔습니다.";
    
    HashMap<String, String> memberMap = new HashMap<>();
        
    
    public String[] solution(String[] record) {
        
        ArrayList<String> memberLog = new ArrayList<>();

        for (String r : record) {
            StringTokenizer st = new StringTokenizer(r);
            String state = st.nextToken();
            String uid = st.nextToken();

            if (!state.equals("Change"))
                memberLog.add(uid + "," + state);

            if (st.hasMoreTokens()) {
                memberMap.put(uid, st.nextToken());
            }
        }

        String[] answer = new String[memberLog.size()];
        for (int i = 0; i < memberLog.size(); i++) {
            String[] st = memberLog.get(i).split(",");
            String uid = st[0];
            String state = st[1];
            String message = state.equals("Enter") ? ENTER_MESSAGE : LEAVE_MESSAGE;

            answer[i] = memberMap.get(uid) + message;
        }
        return answer;
    }
}
