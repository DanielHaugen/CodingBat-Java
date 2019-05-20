/*
    Start with two arrays of strings, A and B, each with its elements in alphabetical 
    order and without duplicates. Return a new array containing the first N elements 
    from the two arrays. The result array should be in alphabetical order and without duplicates. 
    A and B will both have a length which is N or more. The best "linear" solution makes a single 
    pass over A and B, taking advantage of the fact that they are in alphabetical order, copying 
    elements directly to the new array.

    mergeTwo(["a", "c", "z"], ["b", "f", "z"], 3) → ["a", "b", "c"]
    mergeTwo(["a", "c", "z"], ["c", "f", "z"], 3) → ["a", "c", "f"]
    mergeTwo(["f", "g", "z"], ["c", "f", "g"], 3) → ["c", "f", "g"]
*/

public String[] mergeTwo(String[] a, String[] b, int n) {
    String[] arr = new String[n];
    int aIdx = 0, bIdx = 0;
    
    for(int k = 0; k < n; k++) {
      if(a[aIdx].compareTo(b[bIdx]) < 0) {
        arr[k] = a[aIdx];
        aIdx++;
      } else if(a[aIdx].compareTo(b[bIdx]) > 0) {
        arr[k] = b[bIdx];
        bIdx++;
      } else {
        arr[k] = a[aIdx];
        aIdx++;
        bIdx++;
      }
    }
    
    return arr;
}  