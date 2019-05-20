/*
    Return true if the string "cat" and "dog" appear the same number of times in the given string.

    catDog("catdog") → true
    catDog("catcat") → false
    catDog("1cat1cadodog") → true
*/

public boolean catDog(String str) {
    int cat = 0, dog = 0;
    
    for(int k = 0; k<str.length()-2;k++){
      if(str.substring(k,k+3).equals("dog")) dog++;
      if(str.substring(k,k+3).equals("cat")) cat++;
    }
    
    return cat==dog;
}  