package my.algorithm.programmers;

import java.util.Calendar;

// https://programmers.co.kr/learn/courses/30/lessons/12901
public class ¿Ã√µΩ ¿∞≥‚ {
	
	public String solution(int a, int b) throws Exception {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 2016);
        cal.set(Calendar.MONTH, a - 1);
        cal.set(Calendar.DATE, b);
        int day = cal.get(Calendar.DAY_OF_WEEK);
        
        switch (day) {
            case 1: return "SUN";
            case 2: return "MON";
            case 3: return "TUE";
            case 4: return "WED";
            case 5: return "THU";
            case 6: return "FRI";
            case 7: return "SAT";
            default: return null;
        }
    }

}
