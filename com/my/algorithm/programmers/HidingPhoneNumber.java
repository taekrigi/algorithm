package my.algorithm.programmers;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class HidingPhoneNumber {
	
	public String solution(String phone_number) {
        return IntStream.range(0, phone_number.length())
        		.mapToObj(e -> e >= phone_number.length() - 4 ? "" + phone_number.charAt(e) : "*")
        		.collect(Collectors.joining());
    }
}
