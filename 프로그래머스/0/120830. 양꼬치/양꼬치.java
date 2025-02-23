class Solution {
    private final int FOOD_PRICE = 12000;
    private final int DRINK_PRICE = 2000;
    
    public int solution(int n, int k) {
        return (n * FOOD_PRICE) + ((n >= 10 ? k - Math.round(n / 10) : k) * DRINK_PRICE);
    }
}