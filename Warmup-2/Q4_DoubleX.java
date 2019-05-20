/*
	Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".
	
	doubleX("axxbb") → true
	doubleX("axaxax") → false
	doubleX("xxxxx") → true
 */

public boolean doubleX(String str) {
	return str.indexOf("xx") != -1 && 
		   str.charAt(str.indexOf('x')+1) == 'x';
}
