package my.algorithm.programmers;

import java.util.LinkedList;
import java.util.Queue;

// https://programmers.co.kr/learn/courses/30/lessons/42583
public class TrucksOnBridge {

    public int solution(int bridge_length, int weight, int[] truck_weights) {
    	Queue<Integer> waitingTrucks = new LinkedList<>();
    	TruckListOnBridge trucksOnBridge = new TruckListOnBridge(new LinkedList<>());
    	
    	for (int t : truck_weights) waitingTrucks.add(t);
    	
    	int time = 0;
    	
    	while (!waitingTrucks.isEmpty() || !trucksOnBridge.isEmpty()) {
    		time++;
    		
    		if (!trucksOnBridge.isEmpty()) {
    			Truck truck = trucksOnBridge.peek();
    			if (time - truck.getTime() >= bridge_length) {
    				trucksOnBridge.poll();
    			}
    		}
    		
    		if (!waitingTrucks.isEmpty()) {
    			if (trucksOnBridge.getTotalWeight() + waitingTrucks.peek() <= weight) {
    				trucksOnBridge.add(new Truck(waitingTrucks.poll(), time));
    			}
    		}
    	}
    	
    	return time;
    }
}

class TruckListOnBridge {
	private Queue<Truck> trucksOnBridge;
	private int totalWeight;
	
	public TruckListOnBridge(Queue<Truck> trucksOnBridge) {
		this.trucksOnBridge = trucksOnBridge;
	}
	
	public int getTotalWeight() {
		return this.totalWeight;
	}
	
	public boolean isEmpty() {
		return this.trucksOnBridge.isEmpty();
	}
	
	public void add(Truck truck) {
		this.trucksOnBridge.add(truck);
		this.totalWeight += truck.getWeight();
	}
	
	public Truck peek() {
		return this.trucksOnBridge.peek();
	}
	
	public void poll() {
		Truck firstTruck = this.trucksOnBridge.poll();
		this.totalWeight -= firstTruck.getWeight();
	}
}

class Truck {
	private int weight;
	private int time;
	
	public Truck(int weight, int time) {
		this.weight = weight;
		this.time = time;
	}
	
	public int getWeight() {
		return this.weight;
	}
	
	public int getTime() {
		return this.time;
	}
}