import org.junit.Test;
import java.util.*;
import java.util.stream.Collectors;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class HandleTruthTest {
    @Test
    public void makeshiftTest() {
        assertTrue(true);
    }
    @Test
    public void finalTest() {
        String[] input = {
                "hi",
                "hello",
                "this code is done done",
                "yes this code code will work work",
                "this is is is the last one",
        };
        //1st input
        TreeMap<Integer , Set<String>> answer1 = new TreeMap<>(Collections.reverseOrder());
        String[] answer1S = {
                "hi",
        };
        Set<String> set1 = new HashSet<>(Arrays.asList(answer1S));
        answer1.put(1, set1);
        //2nd input
        TreeMap<Integer , Set<String>> answer2 = new TreeMap<>(Collections.reverseOrder());
        String[] answer2S = {
                "hello",
        };
        Set<String> set2 = new HashSet<>(Arrays.asList(answer2S));
        answer2.put(1, set2);
        //3rd input
        TreeMap<Integer , Set<String>> answer3 = new TreeMap<>(Collections.reverseOrder());

        Set<String> set3 = new HashSet<>(Arrays.asList("this", "code", "is"));
        answer3.put(1, set3);
        Set<String> set4 = new HashSet<>(Arrays.asList("done"));
        answer3.put(2, set4);
        //4th input
        TreeMap<Integer , Set<String>> answer4 = new TreeMap<>(Collections.reverseOrder());

        Set<String> set5 = new HashSet<>(Arrays.asList("yes", "this", "will"));
        answer4.put(1, set5);
        Set<String> set6 = new HashSet<>(Arrays.asList("code", "work"));
        answer4.put(2, set6);
        //5th input
        TreeMap<Integer , Set<String>> answer5 = new TreeMap<>(Collections.reverseOrder());

        Set<String> set7 = new HashSet<>(Arrays.asList("this","the","last","one"));
        answer5.put(1, set7);
        Set<String> set8 = new HashSet<>(Arrays.asList("is"));
        answer5.put(3, set8);

        TreeMap<Integer, Set<String>>[] Cases = new TreeMap[5];
        Cases[0] = answer1;
        Cases[1] = answer2;
        Cases[2] = answer3;
        Cases[3] = answer4;
        Cases[4] = answer5;

        for(int i = 0; i < input.length; i++){
            TreeMap<Integer, Set<String>> expected = Cases[i];
            TreeMap<Integer, Set<String>> actual = HandleTruth.wordCount(input[i]);
            assertEquals(actual,expected);
        }
    }
}