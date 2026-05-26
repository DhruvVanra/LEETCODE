import java.util.*;
class gropuAnagrams49{
    public static void main(String[] args) {
        String  strs[] = {"eat","tea","tan","ate","nat","bat"};
        groupAnagrams(strs);
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
    
        HashMap<String, ArrayList<String>> map = new HashMap<>();
            
        for (String word : strs) {

            char[] ch = word.toCharArray();
            Arrays.sort(ch);

            String sorted = new String(ch);

            map.putIfAbsent(sorted, new ArrayList<>());

            map.get(sorted).add(word);
        }
        List<List<String>> ans = new ArrayList<>();
        ans.addAll(map.values());
        return ans;

    }
}