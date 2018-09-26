package observable.test;

import observable.java.Uppercase;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UppercaseTest {

    @Test
    public void isNotUppercaseTest(){
        Uppercase uppercase = new Uppercase();
        uppercase.notifyWord("test");
        assertEquals(0, uppercase.wordsCounted());
    }

    @Test
    public void isUppercaseTest(){
        Uppercase uppercase = new Uppercase();
        uppercase.notifyWord("Test");
        assertEquals(1, uppercase.wordsCounted());
    }
}
