package my.algorithm.codinginterview;

/*
 * P.77 - ���� 10
 * 
 * �Ҽ����� Ȯ��
 */
public class IsPrime {

	public boolean isPrime(int n) {
		if (n <= 1) return false;
		
		for (int i = 2; i * i <= n; i++) {
			if (n % 2 == 0) {
				return false;
			}
		}
		return true;
	}
}
