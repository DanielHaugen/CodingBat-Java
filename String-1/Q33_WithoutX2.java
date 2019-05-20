/*
    Given a string, if one or both of the first 2 chars is 'x', return the string without those 'x' chars, and otherwise return the string unchanged. This is a little harder than it looks.

    withoutX2("xHi") → "Hi"
    withoutX2("Hxi") → "Hi"
    withoutX2("Hi") → "Hi"
*/

public String withoutX2(String str) {
    String newStr = "";
    if(str.length()>0 && str.charAt(0) != 'x') newStr = str.substring(0,1);
    if(str.length()>1 && str.charAt(1) != 'x') newStr += str.substring(1,2);
    if(str.length()>1) newStr+=str.substring(2);
    return newStr;
}  