class Solution {
    public int[] solution(int[] numbers, String direction) {
        int arrSize = numbers.length;
        int[] answer = new int[arrSize];
        
        if (direction.equals("left")) {
            System.arraycopy(numbers, 1, answer, 0, arrSize - 1);
            answer[arrSize - 1] = numbers[0];
        } else {
            answer[0] = numbers[arrSize - 1];
            System.arraycopy(numbers, 0, answer, 1, arrSize - 1);
        }
        
        return answer;
    }
}