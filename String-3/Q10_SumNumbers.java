/*
    Given a string, return the sum of the numbers appearing in the string, 
    ignoring all other characters. A number is a series of 1 or more digit 
    chars in a row. (Note: Character.isDigit(char) tests if a char is one of 
    the chars '0', '1', .. '9'. Integer.parseInt(string) converts a string to an int.)

    sumNumbers("abc123xyz") → 123
    sumNumbers("aa11b33") → 44
    sumNumbers("7 11") → 18
*/

public int sumNumbers(String str) {
    int len = str.length();
    
      int start = - 1, end = 0, sum = 0;
      for(int k = 0; k < len; k++) {
          if(start == -1) {
              if(Character.isDigit(str.charAt(k))) {
                  start = k;
                  end = k+1;
              }
          } else {
              if(Character.isDigit(str.charAt(k)))
                  end++;
              else
              {
                  sum += Integer.parseInt(str.substring(start,end));
                  start = -1;
              }
          }
      }
      
      if(start != -1)
          sum += Integer.parseInt(str.substring(start,end));
          
      return sum;
}  