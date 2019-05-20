/*
    Returns true if for every '*' (star) in the string, if there are chars both immediately before and after the star, they are the same.

    sameStarChar("xy*yzz") → true
    sameStarChar("xy*zzz") → false
    sameStarChar("*xa*az") → true
*/

public boolean sameStarChar(String str) {
    for(int k = 1;k<str.length()-1;k++){
      if(str.charAt(k)=='*'){
        if(str.charAt(k-1)!=str.charAt(k+1)) return false;
      }
    }
    return true;
}  