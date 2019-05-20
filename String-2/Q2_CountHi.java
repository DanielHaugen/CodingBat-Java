/*
    Return the number of times that the string "hi" appears anywhere in the given string.

    countHi("abc hi ho") → 1
    countHi("ABChi hi") → 2
    countHi("hihi") → 2
*/

public int countHi(String str) {
    int counter = 0;
    
    for(int k = 0; k < str.length()-1; k+=1)
      if(str.substring(k,k+2).equals("hi")) counter++;
  
    return counter;
}