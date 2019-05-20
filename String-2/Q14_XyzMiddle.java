/*
    Given a string, does "xyz" appear in the middle of the string? To define middle, we'll say that the number of chars to the left and right of the "xyz" must differ by at most one. This problem is harder than it looks.

    xyzMiddle("AAxyzBB") → true
    xyzMiddle("AxyzBB") → true
    xyzMiddle("AxyzBBB") → false
*/

public boolean xyzMiddle(String str) {
    if(str.length()<=2) 
      return false;
    else if(str.length()%2 == 1)
      return str.substring((str.length()/2)-1,(str.length()/2)+2).equals("xyz");
    else
      return str.substring((str.length()/2)-2,(str.length()/2)+2).contains("xyz");
}  