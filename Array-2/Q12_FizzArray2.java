/*
    Given a number n, create and return a new string array of length n, containing the strings "0", "1" "2" .. through n-1. 
    N may be 0, in which case just return a length 0 array. Note: String.valueOf(xxx) will make the String form of most types. 
    The syntax to make a new string array is: new String[desired_length]  (See also: FizzBuzz Code)

    fizzArray2(4) → ["0", "1", "2", "3"]
    fizzArray2(10) → ["0", "1", "2", "3", "4", "5", "6", "7", "8", "9"]
*/

public String[] fizzArray2(int n) {
    String[] str = new String[n];
    
    for(int k = 0; k < str.length; k++)
      str[k] = String.valueOf(k);
    
    return str;
}  