/*
    Return the number of times that the string "code" appears anywhere in the given string, except we'll accept any letter for the 'd', so "cope" and "cooe" count.

    countCode("aaacodebbb") → 1
    countCode("codexxcode") → 2
    countCode("cozexxcope") → 2
*/

public int countCode(String str) {
    int count = 0;
    
    for(int k = 0; k < str.length()-3;k++)
      if(str.substring(k,k+2).equals("co") && str.charAt(k+3)=='e') count++;
  
    return count;
}  