package my.algorithm.programmers;

import java.util.HashSet;
import java.util.Set;

//https://programmers.co.kr/learn/courses/30/lessons/42839
public class FindPrime {
	
	private Set<Integer> set = new HashSet<>();

    public int solution(String numbers) {
        permutation(numbers, "");
        return (int) set.stream()
            .filter(this::isPrime)
            .count();
    }

    public void permutation(String str, String prefix) {
        for (int i = 0; i < str.length(); i++) {
            String rem = str.substring(0, i) + str.substring(i + 1);
            permutation(rem, prefix + str.charAt(i));
            set.add(Integer.parseInt(prefix + str.charAt(i)));
        }
    }

    public boolean isPrime(int n) {
        if (n == 0 || n == 1) return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }

        return true;
    }

}
