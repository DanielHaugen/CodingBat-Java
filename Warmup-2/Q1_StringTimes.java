/*
	Given a string and a non-negative int n, return a larger string that is n copies of the original string.	
	
	stringTimes("Hi", 2) → "HiHi"
	stringTimes("Hi", 3) → "HiHiHi"
	stringTimes("Hi", 1) → "Hi"
 */

public String stringTimes(String str, int n) {
	String newStr = "";
	for(int k = 0; k<n;k++) newStr+=str;
	return newStr;
}