package my.algorithm.programmers;

public class 시저암호 {
	
	public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            int code = (int) s.charAt(i) + n;
            if (s.charAt(i) == ' ') {
                sb.append(' ');
            } else if ((97 <= code && code <= 122) || (65 <= code && code <= 90)) {
                boolean isOriginUppserCase = Character.isUpperCase(s.charAt(i));
                boolean isChangingUpperCase = Character.isUpperCase((char) code);
                sb.append(isOriginUppserCase != isChangingUpperCase ? 
                          (char) (code - 26) : 
                          (char) code);
            } else {
                sb.append((char) (code - 26));
            }
        }
        
        return sb.toString();
    }

}
