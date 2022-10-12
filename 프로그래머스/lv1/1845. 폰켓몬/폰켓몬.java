import java.util.HashSet;

class Solution {
    public int solution(int[] nums) {
        int half = Math.floorDiv(nums.length, 2);
        HashSet<Integer> pokemonSet = new HashSet<>();
        for (int n : nums) {
            pokemonSet.add(n);
        }
        
        return Math.min(pokemonSet.size(), half);
    }
}