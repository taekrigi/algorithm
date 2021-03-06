package my.algorithm.programmers;

// https://programmers.co.kr/learn/courses/30/lessons/12921
public class 소수찾기 {
	
	 public int solution(int n) {
         int answer = 0;
                   
         for(int i = 2; i <= n; i++) {
             boolean isPrime = true;
             for(int j = 2; j <= Math.sqrt(i); j++) {
                 if(i % j == 0) {
                     isPrime = false;
                     break;
                 }
             }
             if(isPrime) answer++;
         }
         
         return answer;
     }

}
