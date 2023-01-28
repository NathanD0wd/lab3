import static org.junit.Assert.*;
import org.junit.*;

import java.util.List;
import java.util.ArrayList;

public class ListTests {
    @Test
    public void filter1() {
        List<String> input1 = new ArrayList<String>();
        input1.add("abc");
        input1.add(null);
        input1.add("ABC");
        input1.add("blueberry");
        List<String> output1 = new ArrayList<String>();
        output1.add("abc");
        output1.add("ABC");
        output1.add("blueberry");
        StringChecker scheck = new ListExamples();
        assertEquals( output1 , ListExamples.filter( input1 , scheck ));
    }

    @Test
    public void mergeError() {
        List<String> input1 = new ArrayList<String>();
        List<String> input2 = new ArrayList<String>();
        List<String> output1 = new ArrayList<String>();
        input1.add("a"); input1.add("e");
        input2.add("b"); input2.add("c"); input2.add("f"); input2.add("g");
        output1.add("a"); output1.add("b"); output1.add("c"); output1.add("e"); output1.add("f"); output1.add("g");
        System.out.println( "" + input1 + input2 + output1 );
        assertEquals( output1 , ListExamples.merge(input1, input2) );
    }

    @Test
    public void mergeNoError() {
        List<String> input1 = new ArrayList<String>();
        List<String> input2 = new ArrayList<String>();
        List<String> output1 = new ArrayList<String>();
        input1.add("a"); input1.add("e"); input1.add("g");
        input2.add("b"); input2.add("c"); input2.add("f");
        output1.add("a"); output1.add("b"); output1.add("c"); output1.add("e"); output1.add("f"); output1.add("g");
        System.out.println( "" + input1 + input2 + output1 );
        assertEquals( output1 , ListExamples.merge(input1, input2) );
    }
}