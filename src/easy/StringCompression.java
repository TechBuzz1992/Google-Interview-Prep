package easy;

//import java.util.*;

class StringCompression {
	public static void main(String[] args) {
		char[] arr = { 'a'};
		StringCompression obj = new StringCompression();

		System.out.println(obj.getLength(arr));

	}

	public int getLength(char[] arr) {
		int ans = 0;
		char curr = ' ';
		int i = 0;
		while (i < arr.length) {
			if (arr[i] != curr) {
				ans++;
				curr = arr[i];
				i++;
			} else {
				while (i<arr.length && curr == arr[i]) {
					i++;
				}
				ans++;
			}

		}

		return ans;

	}
}