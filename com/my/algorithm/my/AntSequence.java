package my.algorithm.my;

import java.util.ArrayList;
import java.util.List;

/*
 * 1
 * 11
 * 12
 * 1121
 * 122111
 * 112213 
 */
public class AntSequence {

	public static void main(String[] args) {
	  int n = 6;
	  
	  List<String> sequence = new ArrayList<>();
	  sequence.add("1");
	  
	  for (int i = 0; i < n; i++) {
		  String row = sequence.get(i);
		  StringBuilder sb = new StringBuilder();
		  int count = 0;
		  for (int j = 0; j < row.length(); j++) {
			  char current = row.charAt(j);
			 
			  if (j == row.length() - 1 || current != row.charAt(j + 1)) {
				  count++;
				  sb.append(current + "" + count);
				  count = 0;
			  } else {
				  count++;
			  }
			  
			  if (j == row.length() - 1) {
				  sequence.add(sb.toString());
			  }
		  }
	  }
	  
	  System.out.println(sequence);
	}
}
