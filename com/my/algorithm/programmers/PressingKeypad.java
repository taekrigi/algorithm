package my.algorithm.programmers;

// https://programmers.co.kr/learn/courses/30/lessons/67256
public class PressingKeypad {
	
	public String solution(int[] numbers, String hand) {
		StringBuilder sb = new StringBuilder();
		
		int lastLeft = 10;
		int lastRight = 12;
		
		for (int i = 0; i < numbers.length; i++) {
			int number = numbers[i];
			if (number == 1 || number == 4 || number == 7) {
				lastLeft = number;
				sb.append("L");
			} else if (number == 3 || number == 6 || number == 9) {
				lastRight = number;
				sb.append("R");
			} else {
				int leftDiff = getPoint(lastLeft, number);
				int rightDiff = getPoint(lastRight, number);
				
				if (leftDiff > rightDiff) {
					lastRight = number;
					sb.append("R");
				} else if (leftDiff < rightDiff) {
					lastLeft = number;
					sb.append("L");
				} else {
					if ("left".equals(hand)) {
					    lastLeft = number;
                        sb.append("L");
				    } else {
					    lastRight = number;
                        sb.append("R");
				    }
				}
				
			}
		}
		return sb.toString();
	}
	
    
    
	private int getPoint(int lastNumber, int number) {
        lastNumber = lastNumber == 0 ? 11 : lastNumber;
        number = number == 0 ? 11 : number;
        
        int xOfLastNumber = 1;
        int yOfLastNumber = number / 3;
        
        int x = (lastNumber - 1) % 3;
        int y = (lastNumber - 1) / 3;
        
        return Math.abs(x - xOfLastNumber) + Math.abs(y - yOfLastNumber);
	}

}
