/*
    Given a string and a non-empty word string, return a version of the original String where all chars have been replaced by pluses ("+"), except for appearances of the word string which are preserved unchanged.

    plusOut("12xy34", "xy") → "++xy++"
    plusOut("12xy34", "1") → "1+++++"
    plusOut("12xy34xyabcxy", "xy") → "++xy++xy+++xy"
*/

public String plusOut(String str, String word) {
    String newStr = "";
    
    for(int k = 0;k<str.length();k++){
      if(k+word.length()-1<str.length() && str.substring(k,k+word.length()).equals(word)){
        newStr += str.substring(k,k+word.length());
        k += word.length()-1;
      }else newStr+="+";
    }
    return newStr;
}  