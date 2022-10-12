class Solution {
  public String[] solution(int n, int[] arr1, int[] arr2) {
      String[] answer = new String[n];
      int []temp = new int[n];

      for(int i = 0 ; i < n ; i++){
          String resultStr = "";
          int target =1;
          int arr = arr1[i] | arr2[i];
          
         for(int j = 0 ; j < n; j++){
             resultStr = ((arr & target) == 0 ? " " : "#")+resultStr;
             target = target << 1;
         }
          
          answer[i] = resultStr;
      }

      return answer;
  }
}
