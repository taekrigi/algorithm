package my.algorithm.programmers;

// https://programmers.co.kr/learn/courses/30/lessons/12903
public class 가운데글자가져오기 {

	public String solution(String s) {
        boolean isEven = s.length() % 2 == 0;
        int devide = s.length() / 2;

        return s.substring(isEven ? devide - 1 : devide, devide + 1);
    }
}
