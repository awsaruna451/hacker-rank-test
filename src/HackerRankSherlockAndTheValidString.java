import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class HackerRankSherlockAndTheValidString {

    public static String isValid(String s) {
        // Write your code here
        Map<String, Integer> characterVal = new HashMap<>();
        for(int i=0; i< s.length(); i++) {

            String chars = String.valueOf(s.charAt(i));

            if(!Optional.ofNullable(characterVal).isPresent() || characterVal.isEmpty()) {
                characterVal.put(chars, 1);
            } else {
                if (characterVal.containsKey(chars)) {
                    characterVal.put(chars, characterVal.get(chars)+1);
                } else {
                    characterVal.put(chars, 1);
                }
            }

        }

        int charCountVal = 0;

        int unEqualCount = 0;

        for(Map.Entry<String,Integer> val: characterVal.entrySet()) {

            charCountVal = charCountVal == 0 ? val.getValue() : charCountVal;

            if (charCountVal != val.getValue()) {
                unEqualCount ++;
            }

            if (unEqualCount > 1) {
                return  "NO";
            }

        }

        return "YES";

    }


    public static void main(String[] args) {

    }

}
