/*
    Given an array of scores, return true if each score is equal or 
    greater than the one before. The array will be length 2 or more.

    scoresIncreasing([1, 3, 4]) → true
    scoresIncreasing([1, 3, 2]) → false
    scoresIncreasing([1, 1, 4]) → true
*/

public boolean scoresIncreasing(int[] scores) {
    boolean increasingScores = true;
    
    for(int k = 1; k < scores.length; k++)
      increasingScores = (increasingScores && scores[k] >= scores[k-1]) ? true : false;
    
    return increasingScores;
}  