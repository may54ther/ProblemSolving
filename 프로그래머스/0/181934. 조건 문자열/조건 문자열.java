class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        int compare = n - m;
        if (eq.equals("=") && n == m) return 1;
        if (ineq.equals(">")) compare = compare > 0 ? 1 : 0;
        if (ineq.equals("<")) compare = compare < 0 ? 1 : 0;
        return compare;
    }
}