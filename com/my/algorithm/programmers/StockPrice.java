package my.algorithm.programmers;

// https://programmers.co.kr/learn/courses/30/lessons/42584
public class StockPrice {
	
	public int[] solution(int[] prices) {
		int [] answer = new int[prices.length];
		
		for (int i = 0; i < prices.length - 1; i++) {
			int time = 0;
			for (int j = i + 1; j < prices.length; j++) {
				time++;
				if (prices[i] > prices[j]) {
					answer[i] = time;
					break;
				}
			}
            if (answer[i] == 0) answer[i] = time;
		}
		
        return answer;
    }
}

class Price {
	private int price;
	private int time;
	
	public Price(int price, int time) {
		this.price = price;
		this.time = time;
	}
	
	public int getPrice() {
		return this.price;
	}
	
	public int getTime() {
		return this.time;
	}
}
