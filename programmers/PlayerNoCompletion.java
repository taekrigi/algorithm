import java.util.HashMap;
import java.util.Map;

// https://programmers.co.kr/learn/courses/30/lessons/42576
public class PlayerNoCompletion {
	
	public String solution(String[] participant, String[] completion) {
        Map<String, Integer> store = new HashMap<>();
        
        for (String person : participant) {
            store.put(person, store.getOrDefault(person, 0) + 1);
        }
        
        for (String person : completion) {
            store.put(person, store.get(person) - 1);
        }
        
        for (String name : store.keySet()) {
            if (store.get(name) != 0) return name;
        }
        
        return null;
    }
}
