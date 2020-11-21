import org.junit.Test;
import java.util.*;
import java.util.stream.Collectors;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class HandleTruthTest {
    @Test
    public void makeshiftTest() {
        String[] input = {
                "hi",
                "hello",
                "this code is done done",
                "yes this  code code will work work",
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
        String[] answer3S = {
                "this",
                "code",
                "is",
                "done",
                "done",
        };
        Set<String> set3 = new HashSet<>(Arrays.asList("this", "code", "is"));
        answer3.put(1, set3);
        Set<String> set33 = new HashSet<>(Arrays.asList("done"));
        answer3.put(2, set33);
        //4th input
        TreeMap<Integer , Set<String>> answer4 = new TreeMap<>(Collections.reverseOrder());
        String[] answer4S = {
                "yes",
                "this",
                "code",
                "code",
                "will",
                "work",
                "work",
        };
        Set<String> set4 = new HashSet<>(Arrays.asList("yes", "this", "will"));
        answer4.put(1, set4);
        Set<String> set44 = new HashSet<>(Arrays.asList("code", "work"));
        answer4.put(2, set44);
        //5th input
        TreeMap<Integer , Set<String>> answer5 = new TreeMap<>(Collections.reverseOrder());
        String[] answer5S = {
                "this",
                "is",
                "is",
                "is",
                "the",
                "last",
                "one",
        };
        Set<String> set5 = new HashSet<>(Arrays.asList("yes", "this", "will"));
        answer5.put(1, set5);
        Set<String> set55 = new HashSet<>(Arrays.asList("code", "work"));
        answer5.put(3, set55);

    }
}