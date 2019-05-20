/*
    Given n>=0, create an array length n*n with the following pattern, 
    shown here for n=3 : {0, 0, 1,    0, 2, 1,    3, 2, 1} 
    (spaces added to show the 3 groups).


    squareUp(3) → [0, 0, 1, 0, 2, 1, 3, 2, 1]
    squareUp(2) → [0, 1, 2, 1]
    squareUp(4) → [0, 0, 0, 1, 0, 0, 2, 1, 0, 3, 2, 1, 4, 3, 2, 1]
*/

public int[] squareUp(int n) {
  
    int[]list = new int[n*n];
    int pos, curIndex = list.length-1;
    
    for(int k = n; k > 0; k--){
      pos = 1;
      for(int i = n; i > 0; i--){
        if(pos <= k) list[curIndex] = pos;
        pos++;
        curIndex--;
      }
    }
    return list;
}  