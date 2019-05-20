/*
    Given an array of strings, return a new array without the strings that are equal 
    to the target string. One approach is to count the occurrences of the target string, 
    make a new array of the correct length, and then copy over the correct strings.

    wordsWithout(["a", "b", "c", "a"], "a") → ["b", "c"]
    wordsWithout(["a", "b", "c", "a"], "b") → ["a", "c", "a"]
    wordsWithout(["a", "b", "c", "a"], "c") → ["a", "b", "a"]
*/

public String[] wordsWithout(String[] words, String target) {
    int count = 0;
    
    for(int k = 0; k < words.length; k++)
      if(!words[k].equals(target))
        count++;
    
    String[] arr = new String[count];
    int idx = 0;
    
    for(int k = 0; idx < count; k++) {
      if(!words[k].equals(target)) {
        arr[idx] = words[k];
        idx++;
      }
    }
    
    return arr;
}  