class Solution {
    private final int COFFEE_PRICE = 5500;

    public int[] solution(int money) {
        return new int[] { money / COFFEE_PRICE, money % COFFEE_PRICE };
    }
}