import java.util.*;
class letterCombinations17{
    public List<String> letterCombinations(String digits) {
        String[] map = {
            "",     
            "",     
            "abc",  
            "def",  
            "ghi",  
            "jkl",  
            "mno",  
            "pqrs", 
            "tuv",  
            "wxyz"  
        };

        int len = digits.length();
        int arr[] = new int[len];
        for(int i =0;i<digits.length();i++){
            arr[i] = digits.charAt(i);
        }

    }
}