import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String word = reader.readLine().toUpperCase();

        Map<String, Integer> wordMap = new HashMap<>();
        for (String w : word.split("")) {
            if (wordMap.containsKey(w)) {
                wordMap.computeIfPresent(w, (String key, Integer value) -> ++value);
                continue;
            }
            wordMap.put(w, 1);
        }

        int max = Collections.max(wordMap.values());
        int maxCount = (int) wordMap.values().stream().filter(x -> x == max).count();

        if (maxCount > 1) {
            System.out.println("?");
        } else {
            for (Map.Entry<String, Integer> entry : wordMap.entrySet()) {
                if (entry.getValue() == max) {
                    System.out.println(entry.getKey());
                }
            }
        }
    }
}
