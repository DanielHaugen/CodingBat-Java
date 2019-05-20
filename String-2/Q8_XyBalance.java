/*
    We'll say that a String is xy-balanced if for all the 'x' chars in the string, there exists a 'y' char somewhere later in the string. 
    So "xxy" is balanced, but "xyx" is not. One 'y' can balance multiple 'x's. Return true if the given string is xy-balanced.

    xyBalance("aaxbby") → true
    xyBalance("aaxbb") → false
    xyBalance("yaaxbb") → false
*/

public boolean xyBalance(String str) {
    int yIndex = 0, lastXIndex = 0;
    
    for(int k = 0; k < str.length();k++){
      if(str.substring(k,k+1).equals("x")) lastXIndex = k;
      else if(str.substring(k,k+1).equals("y")) yIndex = k;
    }
    
    return yIndex > lastXIndex || !str.contains("x");
}  