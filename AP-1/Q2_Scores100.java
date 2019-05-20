/*
    Given an array of scores, return true if there are scores of 100 
    next to each other in the array. The array length will be at least 2.

    scores100([1, 100, 100]) → true
    scores100([1, 100, 99, 100]) → false
    scores100([100, 1, 100, 100]) → true
*/

public boolean scores100(int[] scores) {
    boolean hundreds = false;
    
    for(int k = 0; k<scores.length-1; k++)
      if(scores[k] == 100 && scores[k + 1] == 100) 
        hundreds = !hundreds;
  
    return hundreds;
}  