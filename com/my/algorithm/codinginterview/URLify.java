package my.algorithm.codinginterview;

/*
 * P.284 - 1.3
 * 
 * URLify
 * 
 * 문자열에 들어 있는 모든 공백을 '%20' 으로 바꾸는 메소드를 작성하라.
 */
public class URLify {

	public void replaceSpaces(char[] str, int trueLength) {
		int spaceCount = 0, index, i = 0;
		for (i = 0; i < trueLength; i++) {
			if (str[i] == ' ') {
				spaceCount++;
			}
		}
		index = trueLength + spaceCount * 2;
		if (trueLength < str.length) str[trueLength] = '\0';
		
		for (i = trueLength - 1; i >= 0; i--) {
			if (str[i] == ' ') {
				str[index - 1] = '0';
				str[index - 2] = '2';
				str[index - 3] = '%';
				index = index - 3;
			} else {
				str[index - 1] = str[i];
				index--;
			}
		}
	}

}
