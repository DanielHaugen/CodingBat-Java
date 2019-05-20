/*
    Return a version of the given string, where for every star (*) in the string the star and the chars immediately to its left and right are gone. So "ab*cd" yields "ad" and "ab**cd" also yields "ad".

    starOut("ab*cd") → "ad"
    starOut("ab**cd") → "ad"
    starOut("sm*eilly") → "silly"
*/

public String starOut(String str) {
    String newStr;
    if(str.length()>1){
      if(str.charAt(0)!='*' && str.charAt(1)!='*') newStr = str.substring(0,1);
      else newStr = "";
      for(int k = 1; k<str.length()-1;k++)
        if(!str.substring(k-1,k+2).contains("*")) newStr+= str.charAt(k);
    
      if(!str.substring(str.length()-2,str.length()).contains("*")) newStr+=str.charAt(str.length()-1);
      return newStr;
    }
    else{
      if(str.length()>0 && str.charAt(0)!='*') return str;
      else return "";
    } 
}   