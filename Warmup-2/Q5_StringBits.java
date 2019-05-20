/*
	Given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo".	

	stringBits("Hello") → "Hlo"
	stringBits("Hi") → "H"
	stringBits("Heeololeo") → "Hello" 
 */

public String stringBits(String str) {
	String newStr = "";

	for(int k = 0; k < str.length(); k+=2)
		newStr+=str.charAt(k);

	return newStr;
}