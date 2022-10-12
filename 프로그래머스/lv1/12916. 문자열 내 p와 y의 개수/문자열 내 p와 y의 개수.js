function solution(s){
    var answer, pcnt=0, ycnt=0;
    
    s = s.toUpperCase()
    for(var i=0; i<s.length;i++){
        if(s.slice(i, i+1) === 'P') pcnt++
        else if (s.slice(i, i+1) === 'Y') ycnt++
    }
    answer = pcnt===ycnt? true : false;
    
    return answer;
}