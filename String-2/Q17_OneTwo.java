/*
    Given a string, compute a new string by moving the first char to come after the next two chars, so "abc" yields "bca". 
    Repeat this process for each subsequent group of 3 chars, so "abcdef" yields "bcaefd". Ignore any group of fewer than 3 chars at the end.

    oneTwo("abc") → "bca"
    oneTwo("tca") → "cat"
    oneTwo("tcagdo") → "catdog"
*/

public String oneTwo(String str) {
    String newStr = "";
    for(int k = 0; k<str.length()-2;k+=3)
        newStr+=str.substring(k+1,k+3) + str.substring(k,k+1);
  
    return newStr;
}  