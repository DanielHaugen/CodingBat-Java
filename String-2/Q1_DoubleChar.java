/*
    Given a string, return a string where for every char in the original, there are two chars.

    doubleChar("The") → "TThhee"
    doubleChar("AAbb") → "AAAAbbbb"
    doubleChar("Hi-There") → "HHii--TThheerree"
*/

public String doubleChar(String str) {
    String newstr="";
    
    for(int k =0;k<str.length();k++)
        newstr += str.substring(k,k+1) + str.substring(k,k+1);
        
    return newstr;
}  