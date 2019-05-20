/*
    Given two strings, a and b, create a bigger string made of the first char of a, the first char of b, the second char of a, the second char of b, and so on. Any leftover chars go at the end of the result.

    mixString("abc", "xyz") → "axbycz"
    mixString("Hi", "There") → "HTihere"
    mixString("xxxx", "There") → "xTxhxexre"
*/

public String mixString(String a, String b) {
    String newstr = "", longString = a, shortString = b;
    
    if(longString.length() < b.length()){
      longString = b;
      shortString = a;
    } 
    
    for(int k = 0; k < longString.length(); k++){
      if(k < shortString.length()) newstr += a.substring(k,k+1) + b.substring(k,k+1);
      else newstr += longString.substring(k,k+1);
    }
    return newstr;
}