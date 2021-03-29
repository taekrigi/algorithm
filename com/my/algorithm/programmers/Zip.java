package my.algorithm.programmers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;

// https://programmers.co.kr/learn/courses/30/lessons/42888
public class Zip {
	
	public String[] solution(String[] record) {
		Map<String, String> users = new HashMap<>();
		Arrays.stream(record).forEach(setResult(users));
        return Arrays.stream(record)
        		.map(changeResult(users))
                .filter(r -> r != null)
        		.toArray(String[]::new);
    }
	
	private Function<String, String> changeResult(Map<String, String> users) {
		return record -> {
			String[] split = record.split(" ");
			String name = users.get(split[1]);
			if (record.startsWith("Enter")) {
				return name + "님이 들어왔습니다.";
			} else if (record.startsWith("Leave")) {
				return name + "님이 나갔습니다.";
			}
			return null;
		};
	}
	
	private Consumer<String> setResult(Map<String, String> users) {
		return record -> {
			String[] split = record.split(" ");
			
			if (record.startsWith("Enter") || record.startsWith("Change")) {
				users.put(split[1], split[2]);
			}
		};
	}

}
