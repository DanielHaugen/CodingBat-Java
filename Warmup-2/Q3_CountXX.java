/*
	Count the number of "xx" in the given string. We'll say that overlapping is allowed, so "xxx" contains 2 "xx".
	
	countXX("abcxx") → 1
	countXX("xxx") → 2
	countXX("xxxx") → 3
 */

public int countXX(String str) {
	int count = 0;

	for(int k = 0; k < str.length()-1; k++)
		if(str.substring(k,k+2).equals("xx")) count++;

	return count;
}