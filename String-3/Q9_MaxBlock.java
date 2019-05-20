/*
    Given a string, return the length of the largest "block" in the string. 
    A block is a run of adjacent chars that are the same.

    maxBlock("hoopla") → 2
    maxBlock("abbCCCddBBBxx") → 3
    maxBlock("") → 0
*/

public int maxBlock(String str) {
    if(str.length() == 0)
      return 0;
    
    int max = 0, cur = 1;
    
    for(int i = 1; i < str.length(); i++) {
      if(str.charAt(i) != str.charAt(i-1)) {
        if(cur > max)
          max = cur;
        cur = 1;
      } else 
        cur++;
    }
    
    return Math.max(max, cur);
}  