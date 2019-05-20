/*
    We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' 
    immediately to its left or right. Return true if all the g's in the given string are happy.

    gHappy("xxggxx") → true
    gHappy("xxgxx") → false
    gHappy("xxggyygxx") → false
*/

public boolean gHappy(String str) {
    str = " " + str + " "; // in case of characters on the edges
  
    for (int k = 1; k < str.length() - 1; k++)
      if (str.charAt(k) == 'g' && str.charAt(k - 1) != 'g'
          && str.charAt(k + 1) != 'g')
        return false;
    
    return true;
}  