function solution(s) {
    var answer = '';
    var sLength = s.length / 2;
    
    if(s.length % 2 == 0) {
        answer = s.slice(sLength-1, sLength+1)
    } else 
        answer = s.slice(sLength, sLength+1)
    
    return answer;
}