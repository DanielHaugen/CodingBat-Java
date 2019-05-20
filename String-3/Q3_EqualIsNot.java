/*
    Given a string, return true if the number of appearances of "is" anywhere in the
    string is equal to the number of appearances of "not" anywhere in the string (case sensitive).

    equalIsNot("This is not") → false
    equalIsNot("This is notnot") → true
    equalIsNot("noisxxnotyynotxisi") → true
*/

public boolean equalIsNot(String str) {
    int countIs = 0, countNot = 0;
    str = str + " ";    
    
    for (int k = 0; k < str.length() - 2; k++)
      if (str.substring(k, k + 2).equals("is")) countIs++;
      else if (str.substring(k, k + 3).equals("not")) countNot++;
    
    return countIs == countNot; 
}  