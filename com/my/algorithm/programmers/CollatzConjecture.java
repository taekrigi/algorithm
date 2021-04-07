package my.algorithm.programmers;

public class CollatzConjecture {
	public int solution(long num) {
        int repeat = 0;
        boolean isOne = false;
        
        for (int i = 0; i < 500; i++) {
            repeat++;
            if (isEven(num)) {
                num = num / 2;
            } else {
                num = num * 3 + 1;
            }

            if (num == 1) {
                isOne = true;
                break;
            }
        }
        return !isOne ? -1 : repeat;
    }
    
    private boolean isEven(long num) {
        return num % 2 == 0;
    }
}
