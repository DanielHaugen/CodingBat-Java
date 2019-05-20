/*
    A sandwich is two pieces of bread with something in between. Return the string that is between the first and last appearance of "bread" in the given string, or return the empty string "" if there are not two pieces of bread.

    getSandwich("breadjambread") → "jam"
    getSandwich("xxbreadjambreadyy") → "jam"
    getSandwich("xxbreadyy") → ""
*/

public String getSandwich(String str) {
    String tmpString = "", finalString = "";
    int start = 0, finish = 0;
    int len = str.length();
    boolean found = false;
  
    if (len <= 10) return "";
    
    for (int i = 0; i < len - 4; i++) {
      tmpString = str.substring(i, i+5);
      if (tmpString.equals("bread") && found == true) finish = i;
      if (tmpString.equals("bread") && found == false) {
        start = i+5;
        found = true;
      } 
    }
    finalString = str.substring(start,finish);
    
    return finalString;
}  