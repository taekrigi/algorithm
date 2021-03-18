package my.algorithm.programmers;

public class Capet {
	
	 public int[] solution(int brown, int yellow) {
	       int total = brown + yellow;
	       
	       for (int i = 3; i < total / 2; i++) {
	           if (total % i == 0) {
	               int col = total / i;
	               int row = total / col;

	               int yellowCol = col - 2;
	               int yellowRow = row - 2;

	               if (yellowCol * yellowRow == yellow && col >= row) { 
	                   return new int[] { col, row };
	               };
	           }
	           
	       }
	       
	       return null;
	    }

}
