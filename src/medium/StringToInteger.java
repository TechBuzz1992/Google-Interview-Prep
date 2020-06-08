package medium;

public class StringToInteger {
    public static void main(String[] args) {
        
    }

    public int myAtoi(String str) {
    	int i = 0, n = str.length();
		while (i < n && Character.isWhitespace(str.charAt(i)))
			i++;
		int sign = 1;
		if (i < n && str.charAt(i) == '+')
			i++;
		else if (i < n && str.charAt(i) == '-') {
			sign = -1;
			i++;
		}
		int num = 0;
		while (i < n && Character.isDigit(str.charAt(i))) {
			int digit = Character.getNumericValue(str.charAt(i));
			num = num * 10 + digit;
			i++;
		}
		return sign * num;    
    }
    
}