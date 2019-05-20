/*
	Given a non-empty string and an int N, return the string made starting with char 0, and then every Nth char of the string. So if N is 3, use char 0, 3, 6, ... and so on. N is 1 or more.	
	
	everyNth("Miracle", 2) → "Mrce"
	everyNth("abcdefg", 2) → "aceg"
	everyNth("abcdefg", 3) → "adg"
 */

public String everyNth(String str, int n) {
	String newStr = str.substring(0,1);

	for(int k = 1; k < str.length(); k++)
		if(k%n == 0) newStr += str.substring(k,k+1); 

	return newStr;
}