import java.util.Map;
import java.util.HashMap;

class Solution {
    
    public int solution(int[] bandage, int health, int[][] attacks) {
        int successCount = 0;
        int currentHealth = health;

        Map<Integer, Integer> attackMap = new HashMap<>();
        for(int[] attack : attacks) {
            attackMap.put(attack[0], attack[1]);
        }
        
        int lastAttackTime = attacks[attacks.length - 1][0];
        for (int time = 1; time <= lastAttackTime; time++){

            if(attackMap.containsKey(time)) {
                currentHealth -= attackMap.get(time);
                successCount = 0;
                if (currentHealth < 1) {
                    return -1;
                }
            } else {
                successCount++;
                currentHealth += bandage[1];
                if (successCount == bandage[0]) {
                    currentHealth += bandage[2];
                    successCount = 0;
                }
                
                currentHealth = Math.min(health, currentHealth);
            }
        }
        
        return currentHealth;
    }
}

