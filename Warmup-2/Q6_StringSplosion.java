/*
	Given a non-empty string like "Code" return a string like "CCoCodCode".	
	
	stringSplosion("Code") → "CCoCodCode"
	stringSplosion("abc") → "aababc"
	stringSplosion("ab") → "aab"
 */

public String stringSplosion(String str) {
	String newStr = "";

	for(int k = 0; k < str.length()+1; k++)
		newStr += str.substring(0,k);

	return newStr;
}