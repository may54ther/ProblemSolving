class Solution {
    private int movedCount = 0;
    
    public int[][] solution(int n) {
        int[][] answer = new int[(int) Math.pow(2, n) - 1][2];
        hanoi(n, 1, 2, 3, answer);
        return answer;
    }
    
    public void hanoi(int n, int from, int by, int to, int[][] answer) {
        if (n == 1) {
            answer[movedCount++] = new int[]{from, to};
            return;
        }
        
        hanoi(n - 1, from, to, by, answer);
        answer[movedCount++] = new int[]{from, to};
        hanoi(n - 1, by, from, to, answer);
    }
}