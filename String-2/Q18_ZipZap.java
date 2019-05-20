/*
    Look for patterns like "zip" and "zap" in the string -- length-3, starting with 'z' and ending with 'p'. Return a string where for all such words, the middle letter is gone, so "zipXzap" yields "zpXzp".

    zipZap("zipXzap") → "zpXzp"
    zipZap("zopzop") → "zpzp"
    zipZap("zzzopzop") → "zzzpzp"
*/

public String zipZap(String str) {
    String newStr = "";
    if(str.length()<3) return str;
    
    for(int k = 0; k < str.length();k++){
      if(str.charAt(k) == 'z' && (str.charAt(k+2) == 'p')){
        newStr += "zp";
        k+=2;
      } else newStr += str.substring(k,k+1);
    }
    
    return newStr;
}  