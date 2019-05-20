/*
    Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" 
    and the 'z' in "fez" count, but not the 'y' in "yellow" (not case sensitive). 
    We'll say that a y or z is at the end of a word if there is not an alphabetic letter
    immediately following it. (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)

    countYZ("fez day") → 2
    countYZ("day fez") → 2
    countYZ("day fyyyz") → 2
*/

public int countYZ(String str) {
    String newStr = str.toLowerCase();
    int count = 0;
    
    for(int k = 1;k<str.length();k++)
      if(!Character.isLetter(str.charAt(k)) 
        && (newStr.charAt(k-1)=='y' || newStr.charAt(k-1)=='z')) count++;
    
    if(newStr.charAt(str.length()-1)=='y' || newStr.charAt(str.length()-1)=='z') count++;
    
    return count;
}  