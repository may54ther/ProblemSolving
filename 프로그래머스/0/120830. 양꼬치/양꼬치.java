class Solution {
    
    private final int LAMB_SKEWERS_PRICE = 12000;
    private final int DRINK_PRICE = 2000;
    
    public int solution(int n, int k) {
        return (n * LAMB_SKEWERS_PRICE) + ((k - (n / 10)) * DRINK_PRICE);
    }
}