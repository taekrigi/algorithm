package my.algorithm.programmers;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import org.junit.jupiter.api.Test;

public class FunctionDevelopment {
	
	@Test
	public void test() {
		int[] progress = {93, 30, 55};
		int[] speed = {1, 30, 5};
		solution(progress, speed);
	}
	
	public int[] solution(int[] progresses, int[] speeds) {
		List<Integer> result = new ArrayList<>();
        Queue<Program> programs = new LinkedList<>();
        
        for (int i = 0; i < progresses.length; i++) {
        	programs.add(new Program(progresses[i], speeds[i], false));
        }

        while (!programs.isEmpty()) {
        	Iterator<Program> it = programs.iterator();
        	
        	while (it.hasNext()) {
        		Program program = it.next();
        		program.work();
        	}
        	
        	int completeCount = 0;
        	
        	it = programs.iterator();
        	
        	while (it.hasNext()) {
        		Program program = it.next();
        		if (!program.isCompleted()) break;
        		completeCount++;
        		it.remove();
        	}
        	
        	if (completeCount != 0) result.add(completeCount); 
        }
        
        return result.stream()
        		.mapToInt(Integer::intValue)
        		.toArray();
        		
    }

}

class Program {
    private int progress;
    private int speed;
    private boolean complete;
    
    public Program(int progress, int speed, boolean complete) {
        this.progress = progress;
        this.speed = speed;
        this.complete = complete;
    }
    
    public void work() {
    	if (this.complete) return;
    	this.progress += this.speed;
    	if (this.progress >= 100) this.setComplete(true);
    }
    
    public boolean isCompleted() {
        return this.complete;
    }
    
    public void setComplete(boolean complete) {
        this.complete = complete;
    }
}