import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int lengthOfLastWord(String s) {
        String [] strings = new String[s.split(" ").length];
        for (int i = 0; i < s.length(); i++) {
             strings = s.split(" ");
        }
        List<String> stringList = new ArrayList<>(Arrays.asList(strings));

        return stringList.get(stringList.size()-1).length();
    }
}