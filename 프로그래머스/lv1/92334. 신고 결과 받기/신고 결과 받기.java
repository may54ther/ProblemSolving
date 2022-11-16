import java.util.*;
import java.util.stream.Collectors;

class Solution {
    
     public int[] solution(String[] id_list, String[] report, int k) {

        int SIZE = id_list.length;
        int[] results = new int[SIZE];
        
        //중복 제거
        Set<String> reportSet = new HashSet<>(Arrays.asList(report));

        //나를 신고한 유저
        HashMap<String, ArrayList<String>> reporterHash = new HashMap<>();
        for (String rep : reportSet) {
            StringTokenizer st = new StringTokenizer(rep, " ");
            String reporterId = st.nextToken();
            String reportedId = st.nextToken();

            ArrayList<String> reporters = reporterHash.getOrDefault(reportedId, new ArrayList<>());
            reporters.add(reporterId);
            reporterHash.put(reportedId, reporters);
        }

        //처리 결과 메일
        HashMap<String, Integer> receivedEmailHash = new HashMap<>();
        for (ArrayList<String> reporters : reporterHash.values()) {
            if (reporters.size() >= k) {
                for (String reporter : reporters) {
                    receivedEmailHash.put(reporter, receivedEmailHash.getOrDefault(reporter, 0) + 1);
                }
            }
        }

        //결과 담기
        for (int i = 0; i < SIZE; i++) {
            results[i] = receivedEmailHash.getOrDefault(id_list[i], 0);
        }

        return results;
    }
}

