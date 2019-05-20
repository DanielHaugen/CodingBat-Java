/*
    Given a string, compute recursively (no loops) the 
    number of lowercase 'x' chars in the string.


    countX("xxhixx") → 4
    countX("xhixhix") → 3
    countX("hi") → 0
*/

public int countX(String str) {
    if(str.length()<1) return 0;
    
    int index = 0;
    int xCount = 0;
    if(str.substring(index,index+1).equals("x")) xCount++;
    
    if(index == str.length()-1) return xCount;
    
    return countX(str.substring(++index)) + xCount;
}  