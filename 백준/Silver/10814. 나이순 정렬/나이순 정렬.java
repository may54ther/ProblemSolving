import java.util.HashMap;
import java.util.ArrayList;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        HashMap<Integer, ArrayList<String>> map = new HashMap<>();

        for(int i=0; i<n; i++) {
            String[] line = br.readLine().split(" ");
            int age = Integer.parseInt(line[0]);
            String name = line[1];

            ArrayList<String> list = map.containsKey(age) ? map.get(age) : new ArrayList<>();
            list.add(name);
            map.put(age, list);
        }

        map.forEach((age, names) -> {
            for (String name : names) {
                System.out.println(age + " " + name);
            }
        });
    }
}