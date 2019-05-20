/*
    Start with two arrays of strings, a and b, each in alphabetical order, possibly with duplicates. 
    Return the count of the number of strings which appear in both arrays. The best "linear" solution 
    makes a single pass over both arrays, taking advantage of the fact that they are in alphabetical order.

    commonTwo(["a", "c", "x"], ["b", "c", "d", "x"]) → 2
    commonTwo(["a", "c", "x"], ["a", "b", "c", "x", "z"]) → 3
    commonTwo(["a", "b", "c"], ["a", "b", "c"]) → 3
*/

public int commonTwo(String[] a, String[] b) {
    int count = 0, aIdx = 0, bIdx = 0;
    
    if(a[0].equals(b[0])) {
      count++;
      aIdx++;
      bIdx++;
    }
    else if(a[0].compareTo(b[0]) < 0) aIdx++;
    else bIdx++;
    
    while(aIdx < a.length && bIdx < b.length) {
      if(aIdx > 0 && a[aIdx-1].equals(a[aIdx])) aIdx++;
      else if(a[aIdx].equals(b[bIdx])) {
        count++;
        aIdx++;
        bIdx++;
      }
      else if(a[aIdx].compareTo(b[bIdx]) < 0) aIdx++;
      else bIdx++;
    }
    
    return count;
}  