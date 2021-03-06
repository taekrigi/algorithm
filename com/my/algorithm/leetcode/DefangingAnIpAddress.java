package my.algorithm.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class DefangingAnIpAddress {
	
	 public String defangIPaddr(String address) {
		 return address.replaceAll("\\.", "[.]");
	 }
	 
	 @Test
	 public void Å×½ºÆ®1() {
		 assertEquals(defangIPaddr("1.1.1.1"), "1[.]1[.]1[.]1");
	 }

}
