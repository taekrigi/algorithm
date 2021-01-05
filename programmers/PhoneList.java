// https://programmers.co.kr/learn/courses/30/lessons/42577#

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PhoneList {
    public boolean solution(String[] phoneBook) {
        List<String> sortedPhoneBook = Arrays.stream(phoneBook).sorted(Comparator.comparing(String::length)).collect(Collectors.toList());

        for (int i = 0; i < sortedPhoneBook.size() - 1; i++) {
            for (int j = i + 1; j < sortedPhoneBook.size(); j++) {
                String comparing = sortedPhoneBook.get(i);
                String target = sortedPhoneBook.get(j);

                if (target.length() != comparing.length() && target.startsWith(comparing)) return false;
            }
        } 

        return true;
    }
}