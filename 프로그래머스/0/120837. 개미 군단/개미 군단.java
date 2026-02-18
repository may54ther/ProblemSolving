class Solution {
    public int solution(int hp) {
        int currentHp = hp;
        int attacks = 0;

        if (currentHp >= 5) {
            int count = (int) currentHp / 5;
            currentHp -= (count * 5);
            attacks += count;
        }
        if (currentHp >= 3) {
            int count = (int) currentHp / 3;
            currentHp -= (count * 3);
            attacks += count;
        }
        
        return attacks + currentHp;
    }
}