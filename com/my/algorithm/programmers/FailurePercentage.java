package my.algorithm.programmers;

import java.util.HashMap;
import java.util.Map;

public class FailurePercentage {
	
	public int[] solution(int N, int[] stages) {
        Map<Integer, Integer> stateInfo = new HashMap<>();
        Map<Integer, Float> failureLate = new HashMap<>();
        
        for (int i = 0; i < stages.length; i++) {
            stateInfo.put(stages[i], stateInfo.getOrDefault(stages[i], 0) + 1);
        }
        
        for (int i = 1; i <= N; i++) {
            int failure = stateInfo.getOrDefault(i, 0);
            int participant = failure;
            for (int j = i + 1; j <= N + 1; j++) {
                participant += stateInfo.getOrDefault(j, 0);
            }
            failureLate.put(i, participant == 0 ? 0 : (float) failure / (float) participant);
        }

        return failureLate.keySet()
        		.stream()
        		.sorted((a1, a2) -> {
                    int compare = Float.compare(failureLate.get(a2), failureLate.get(a1));
                    return compare == 0 ? a1 - a2 : compare;
                })
        		.mapToInt(i -> i.intValue())
        		.toArray();
    }
}
