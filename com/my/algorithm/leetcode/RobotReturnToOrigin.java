package my.algorithm.leetcode;

import java.util.HashMap;
import java.util.Map;

public class RobotReturnToOrigin {

	class RobotLocation {
		int x;
		int y;
		Map<Character, Runnable> moves;
		
		{
			moves.put('U', () -> y++);
			moves.put('D', () -> y--);
			moves.put('L', () -> x--);
			moves.put('R', () -> x++);
		}

		public void move(char c) {
			moves.get(c).run();
		}
		
		public boolean isOriginLocation() {
			return x == 0 && y == 0;
		}
	}
	
	public boolean judegeCircle(String moves) {
		RobotLocation robotLocation = new RobotLocation();
		for (int i = 0; i < moves.length(); i++) {
			robotLocation.move(moves.charAt(i));
		}
		return robotLocation.isOriginLocation();
	}
}
