/*
    Given 2 strings, a and b, return a new string made of the first char of a and the last char of b, so "yo" and "java" yields "ya". If either string is length 0, use '@' for its missing char.

    lastChars("last", "chars") → "ls"
    lastChars("yo", "java") → "ya"
    lastChars("hi", "") → "h@"
*/

public String lastChars(String a, String b) {
    String str = "";
    
    if(a.length()>0) str += a.charAt(0);
    else str += "@";
    
    if(b.length()>0) str += b.charAt(b.length()-1);
    else str += "@";
    
    return str;
}  