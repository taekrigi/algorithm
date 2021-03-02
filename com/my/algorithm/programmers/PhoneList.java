package my.algorithm.programmers;
// https://programmers.co.kr/learn/courses/30/lessons/42577#

import java.util.Arrays;

public class PhoneList {
	 public boolean solution(String[] phoneBook) {
       Arrays.sort(phoneBook);
        
       for (int i = 0; i < phoneBook.length - 1; i++) {
           if (phoneBook[i + 1].startsWith(phoneBook[i])) return false;
       }
        
       return true;
     }
}