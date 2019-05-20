/*
    Return true if the given string contains a "bob" string, but where the middle 'o' char can be any char.

    bobThere("abcbob") → true
    bobThere("b9b") → true
    bobThere("bac") → false
*/

public boolean bobThere(String str) {
    for(int k = 0; k < str.length()-2; k++)
      if(str.charAt(k) == 'b' && str.charAt(k+2) == 'b') return true;
    
    return false;
}