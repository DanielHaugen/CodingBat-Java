/*
    Given a string and a non-empty word string, return a string made of each char just before and just after every appearance of the word in the string. Ignore cases where there is no char before or after the word, and a char may be included twice if it is between two words.

    wordEnds("abcXY123XYijk", "XY") → "c13i"
    wordEnds("XY123XY", "XY") → "13"
    wordEnds("XY1XY", "XY") → "11"
*/

public String wordEnds(String str, String word) {
    String newStr = "";
    
    for(int k = 0;k<str.length();k++){
      if(k+word.length()-1<str.length() && str.substring(k,k+word.length()).equals(word)){
        if(k!=0) newStr+=str.charAt(k-1);
        if(k+word.length()-1<str.length()-1) newStr+=str.charAt(k+word.length());
        k += word.length()-1;
      }
    }
    return newStr;
}