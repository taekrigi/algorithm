package my.algorithm.programmers;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class CollatzConjecture {
	public int solution(long num) {
        int repeat = 0;
        boolean isOne = false;
        
        for (int i = 0; i < 500; i++) {
            if (num == 1) {
                isOne = true;
                break;
            }
            num = isEven(num) ? num / 2 : num * 3 + 1;
            repeat++;
        }
        return !isOne ? -1 : repeat;
    }
    
    private boolean isEven(long num) {
        return num % 2 == 0;
    }
    
    @Test
    public void test() {
    	assertEquals(solution(1), 0);
    }
}
